package li.jesse.volcanocommon.util;

public class EnumUtil {

    public static int getNextCode(int code, int length) {
        int nextCode = code;
        if (++nextCode == length){
            nextCode = 0;
        }
        return nextCode;
    }

    public static int getNextCode(int code, int length, int firstCode) {
        int nextCode = code;
        if (++nextCode == length + firstCode){
            nextCode = firstCode;
        }
        return nextCode;
    }
}
