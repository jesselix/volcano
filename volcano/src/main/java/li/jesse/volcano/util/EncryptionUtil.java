package li.jesse.volcano.util;
import java.security.MessageDigest;

public class EncryptionUtil {

    public static String md5Encryption(String str, String salt) {
        try {
            str = str + salt;
            MessageDigest m = MessageDigest.getInstance("MD5");
            m.update(str.getBytes("UTF8"));
            byte s[] = m.digest();
            String result = "";
            for (int i = 0; i < s.length; i++) {
                result += Integer.toHexString((0x000000FF & s[i]) | 0xFFFFFF00).substring(6);
            }
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "";

    }
}
