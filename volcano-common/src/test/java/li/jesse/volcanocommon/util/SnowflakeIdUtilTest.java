package li.jesse.volcanocommon.util;

import org.junit.jupiter.api.Test;

import java.text.ParseException;

public class SnowflakeIdUtilTest {

    @Test
    public void testSnowflakeId() throws ParseException {
        long epoch = DateTimeUtil.dateToStamp(2020, 10, 1);
        SnowflakeIdUtil snowflakeIdUtil = new SnowflakeIdUtil(2, 5, epoch);
        for (int i = 0; i < 5; i++) {
            long id = snowflakeIdUtil.nextId();
            System.out.println(String.format("%s => id: %d, hex: %s, bin: %s",
                    snowflakeIdUtil.formatId(id),
                    id,
                    BinHexUtil.hex(id),
                    BinHexUtil.bin(id)));
        }
    }

    @Test
    public void testSnowflakeIdLength() {
        String str = "0000000000001001111101110100111001101010010001000101000000000000";
        System.out.println(str.length());
        String str2 = "1332809439539122176";
        System.out.println(str2.length());
    }

    @Test
    public void testSnowflakeIdGenerator() throws ParseException {
        System.out.println(SnowflakeIdUtil.snowflakeIdGenerator(2020, 10, 1, 2, 5));
    }
}
