package org.junyingli.code.util;

import org.junit.Test;

public class SnowflakeTest {

    @Test
    public void testSnowflakeIdWorker() {
        Snowflake snowflake = new Snowflake(2, 5);
        for (int i = 0; i < 20; i++) {
            long id = snowflake.nextId();
            System.out.println(String.format("%s => id: %d, hex: %s, bin: %s", snowflake.formatId(id), id,
                    BinHexUtil.hex(id), BinHexUtil.bin(id)));
        }
    }

    @Test
    public void gg() {
        String str = "110111100000101101101011001110100111011000111111111111111111";
        System.out.println(str.length());
        String str2 = "543497714680201216";
        System.out.println(str2.length());



        long l = 1093708051447283717L;
        System.out.println(Long.toBinaryString(l));

    }
}
