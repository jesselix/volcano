package li.jesse.volcanocommon.generator;

import li.jesse.volcanocommon.generator.SnowflakeId;
import li.jesse.volcanocommon.util.BinHexUtil;
import li.jesse.volcanocommon.util.DateTimeUtil;
import org.junit.jupiter.api.Test;

import java.text.ParseException;

public class SnowflakeIdTest {

    @Test
    public void testSnowflakeId() throws ParseException {
        long epoch = DateTimeUtil.dateToStamp(2010, 10, 1);
        SnowflakeId snowflakeId = new SnowflakeId(2, 5, epoch);
        for (int i = 0; i < 5; i++) {
            long id = snowflakeId.nextId();
            System.out.println(String.format("%s => id: %d, hex: %s, bin: %s",
                    snowflakeId.formatId(id),
                    id,
                    BinHexUtil.hex(id),
                    BinHexUtil.bin(id)));
        }
    }

    @Test
    public void testSnowflakeIdLength() {
        String str = "0000000000001001111101110100111001101010010001000101000000000000";
        System.out.println(str.length());
        String str2 = "1332791118315933696";
        System.out.println(str2.length());
    }
}
