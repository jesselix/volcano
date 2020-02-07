package li.jesse.volcanocommon.util;

import java.util.UUID;

public class UuidUtil {

    public static String generateUuid() {
        String uuid = UUID.randomUUID().toString().replaceAll("-", "");
        return uuid;
    }
}
