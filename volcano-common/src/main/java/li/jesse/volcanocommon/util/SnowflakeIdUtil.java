package li.jesse.volcanocommon.util;

public class SnowflakeIdUtil {

    // Epoch (custom start time, e.g., 2025-01-01)
    private final long twepoch = 1735689600000L;

    private final long workerIdBits = 5L;
    private final long datacenterIdBits = 5L;
    private final long maxWorkerId = -1L ^ (-1L << workerIdBits);       // 31
    private final long maxDatacenterId = -1L ^ (-1L << datacenterIdBits); // 31
    private final long sequenceBits = 12L;

    private final long workerIdShift = sequenceBits;                   // 12
    private final long datacenterIdShift = sequenceBits + workerIdBits; // 17
    private final long timestampLeftShift = sequenceBits + workerIdBits + datacenterIdBits; // 22
    private final long sequenceMask = -1L ^ (-1L << sequenceBits);     // 4095

    private long workerId;
    private long datacenterId;
    private long sequence = 0L;
    private long lastTimestamp = -1L;

    public SnowflakeIdUtil(long workerId, long datacenterId) {
        if (workerId > maxWorkerId || workerId < 0) {
            throw new IllegalArgumentException(String.format("workerId must be between 0 and %d", maxWorkerId));
        }
        if (datacenterId > maxDatacenterId || datacenterId < 0) {
            throw new IllegalArgumentException(String.format("datacenterId must be between 0 and %d", maxDatacenterId));
        }
        this.workerId = workerId;
        this.datacenterId = datacenterId;
    }

    public synchronized long nextId() {
        long timestamp = timeGen();

        if (timestamp < lastTimestamp) {
            throw new RuntimeException(
                    String.format("Clock moved backwards. Refusing to generate id for %d milliseconds", lastTimestamp - timestamp));
        }

        if (lastTimestamp == timestamp) {
            // Same millisecond: increment sequence
            sequence = (sequence + 1) & sequenceMask;
            if (sequence == 0) {
                // Sequence overflow in the same millisecond, wait for next millisecond
                timestamp = tilNextMillis(lastTimestamp);
            }
        } else {
            // New millisecond: reset sequence
            sequence = 0L;
        }

        lastTimestamp = timestamp;

        return ((timestamp - twepoch) << timestampLeftShift) |
                (datacenterId << datacenterIdShift) |
                (workerId << workerIdShift) |
                sequence;
    }

    private long tilNextMillis(long lastTimestamp) {
        long timestamp = timeGen();
        while (timestamp <= lastTimestamp) {
            timestamp = timeGen();
        }
        return timestamp;
    }

    private long timeGen() {
        return System.currentTimeMillis();
    }

    public static long getId(long workerId, long datacenterId) {
        SnowflakeIdUtil idGen = new SnowflakeIdUtil(workerId, datacenterId);
        return idGen.nextId();
    }
}
