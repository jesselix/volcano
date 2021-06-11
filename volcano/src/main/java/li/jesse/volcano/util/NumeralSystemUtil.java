package li.jesse.volcano.util;

public class NumeralSystemUtil {

    public static int lengthOfInt(int number) {
        int div = 1;
        int length = 1;

        while (number / div >= 10) {
            div *= 10;
            length++;
        }

        return length;
    }

    public static String intToHex(int number) {
        return null;
    }
}
