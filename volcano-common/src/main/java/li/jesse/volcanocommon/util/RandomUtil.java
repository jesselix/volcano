package li.jesse.volcanocommon.util;

import java.util.Random;

public class RandomUtil {

    public static int randomNumberInRange(int min, int max) {
        Random random = new Random();
        return random.nextInt(max) % (max - min + 1) + min;
    }

}
