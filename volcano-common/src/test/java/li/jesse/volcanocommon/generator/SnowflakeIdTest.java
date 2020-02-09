package li.jesse.volcanocommon.generator;

import li.jesse.volcanocommon.generator.SnowflakeId;
import li.jesse.volcanocommon.util.BinHexUtil;
import org.junit.jupiter.api.Test;

public class SnowflakeIdTest {

    @Test
    public void testSnowflakeId() {
        SnowflakeId snowflakeId = new SnowflakeId(2, 5);
        for (int i = 0; i < 5; i++) {
            long id = snowflakeId.nextId();
            System.out.println(String.format("%s => id: %d, hex: %s, bin: %s", snowflakeId.formatId(id), id,
                    BinHexUtil.hex(id), BinHexUtil.bin(id)));
        }
    }

    @Test
    public void testSnowflakeIdLength() {
        String str = "0000000000001001111101110100111001101010010001000101000000000000";
        System.out.println(str.length());
        String str2 = "2805190952767488";
        System.out.println(str2.length());
    }
}
