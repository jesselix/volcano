package li.jesse.volcano.util;

import org.junit.jupiter.api.Test;

public class RandomUtilTest {

    @Test
    public void testRandomNumberInRange() {
        for (int i = 0; i < 50; i++)
            System.out.println(RandomUtil.randomNumberInRange(50, 100));
    }

}
