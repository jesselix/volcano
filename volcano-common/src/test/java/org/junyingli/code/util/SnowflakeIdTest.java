package org.junyingli.code.util;

import org.junit.Test;

public class SnowflakeIdTest {

    @Test
    public void testSnowflakeId() {
        SnowflakeId snowflakeId = new SnowflakeId(2, 5);
        for (int i = 0; i < 10; i++) {
            long id = snowflakeId.nextId();
            System.out.println(String.format("%s => id: %d, hex: %s, bin: %s", snowflakeId.formatId(id), id,
                    BinHexUtil.hex(id), BinHexUtil.bin(id)));
        }
    }

    @Test
    public void gg() {
        String str = "0000010110111001001111001100111110001000100001000101000000000000";
        System.out.println(str.length());
        String str2 = "412871644718321664";
        System.out.println(str2.length());
    }
}
