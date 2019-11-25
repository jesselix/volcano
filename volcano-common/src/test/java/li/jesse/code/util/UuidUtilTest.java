package li.jesse.code.util;

import org.junit.Test;

public class UuidUtilTest {

    @Test
    public void testUuidUtil() {
        for (int i = 0; i < 10; i++) {
            System.out.println(UuidUtil.generateUuid());
        }
    }
}
