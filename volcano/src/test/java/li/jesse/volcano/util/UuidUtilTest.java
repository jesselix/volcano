package li.jesse.volcano.util;

import org.junit.jupiter.api.Test;

public class UuidUtilTest {

    @Test
    public void testUuid() {
        for (int i = 0; i < 5; i++) {
            System.out.println(UuidUtil.uuidGenerator());
        }
    }

    @Test
    public void testUuidLength() {
        String str = "8ffe88137aea42b1817abe870b0985ef";
        System.out.println(str.length());
    }
}
