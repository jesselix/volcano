package li.jesse.volcanocommon.generator;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;

public class SnowflakeId {

    private final long unusedBits = 1L;

    private final long timestampBits = 41L;
    private final long datacenterIdBits = 5L;
    private final long workerIdBits = 5L;
    private final long sequenceBits = 12L;

    private final long maxDatacenterId = -1L ^ (-1L << datacenterIdBits); // 2^5-1
    private final long maxWorkerId = -1L ^ (-1L << workerIdBits); // 2^5-1
    private final long maxSequence = -1L ^ (-1L << sequenceBits); // 2^12-1

    private final long timestampShift = sequenceBits + datacenterIdBits + workerIdBits;
    private final long datacenterIdShift = sequenceBits + workerIdBits;
    private final long workerIdShift = sequenceBits;

    private final long epoch = 1580486400000L;

    private final long datacenterId;

    private final long workerId;

    private long sequence = 0L;

    private long lastTimestamp = -1L;

    public synchronized long nextId() {
        long currTimestamp = timestampGen();

        if (currTimestamp < lastTimestamp) {
            throw new IllegalStateException(
                    String.format("Clock moved backwards. Refusing to generate id for %d milliseconds",
                            lastTimestamp - currTimestamp));
        }

        if (currTimestamp == lastTimestamp) {
            sequence = (sequence + 1) & maxSequence;
            if (sequence == 0) {
                currTimestamp = waitNextMillis(currTimestamp);
            }

        } else {
            sequence = 0L;
        }

        lastTimestamp = currTimestamp;

        return ((currTimestamp - epoch) << timestampShift) |
                (datacenterId << datacenterIdShift) |
                (workerId << workerIdShift) |
                sequence;
    }

    public SnowflakeId(long datacenterId, long workerId) {
        if (datacenterId > maxDatacenterId || datacenterId < 0) {
            throw new IllegalArgumentException(
                    String.format("datacenter Id can't be greater than %d or less than 0", maxDatacenterId));
        }
        if (workerId > maxWorkerId || workerId < 0) {
            throw new IllegalArgumentException(
                    String.format("worker Id can't be greater than %d or less than 0", maxWorkerId));
        }

        this.datacenterId = datacenterId;
        this.workerId = workerId;
    }

    private final AtomicLong waitCount = new AtomicLong(0);

    public long getWaitCount() {
        return waitCount.get();
    }

    protected long waitNextMillis(long currTimestamp) {
        waitCount.incrementAndGet();
        while (currTimestamp <= lastTimestamp) {
            currTimestamp = timestampGen();
        }
        return currTimestamp;
    }

    protected long timestampGen() {
        return System.currentTimeMillis();
    }

    @Override
    public String toString() {
        return "SnowflakeId Settings [timestampBits=" + timestampBits + ", datacenterIdBits=" + datacenterIdBits
                + ", workerIdBits=" + workerIdBits + ", sequenceBits=" + sequenceBits + ", epoch=" + epoch
                + ", datacenterId=" + datacenterId + ", workerId=" + workerId + "]";
    }

    public long getEpoch() {
        return this.epoch;
    }

    public long[] parseId(long id) {
        long[] arr = new long[5];
        arr[4] = ((id & diode(unusedBits, timestampBits)) >> timestampShift);
        arr[0] = arr[4] + epoch;
        arr[1] = (id & diode(unusedBits + timestampBits, datacenterIdBits)) >> datacenterIdShift;
        arr[2] = (id & diode(unusedBits + timestampBits + datacenterIdBits, workerIdBits)) >> workerIdShift;
        arr[3] = (id & diode(unusedBits + timestampBits + datacenterIdBits + workerIdBits, sequenceBits));
        return arr;
    }

    public String formatId(long id) {
        long[] arr = parseId(id);
        String tmf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date(arr[0]));
        return String.format("%s, #%d, @(%d,%d)", tmf, arr[3], arr[1], arr[2]);
    }

    private long diode(long offset, long length) {
        int lb = (int) (64 - offset);
        int rb = (int) (64 - (offset + length));
        return (-1L << lb) ^ (-1L << rb);
    }
}
