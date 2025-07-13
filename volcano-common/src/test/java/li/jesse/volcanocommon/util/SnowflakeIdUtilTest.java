package li.jesse.volcanocommon.util;


import org.junit.jupiter.api.Test;

public class SnowflakeIdUtilTest {

    @Test
    public void testGetId() {

        for (int i = 0; i < 10; i++) {
            long id = SnowflakeIdUtil.getId(1, 1);
            System.out.println("Generated ID: " + id);
        }
    }
}
