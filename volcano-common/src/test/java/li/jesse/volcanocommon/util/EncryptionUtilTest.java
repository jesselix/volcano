package li.jesse.volcanocommon.util;

import org.junit.jupiter.api.Test;

public class EncryptionUtilTest {

    @Test
    public void testMd5Encryption() {
        String salt = "0123456789xxxyyyzzz";
        String ss = EncryptionUtil.md5Encryption("123", salt);
        System.out.println(ss);
        System.out.println(ss.length());
    }
}
