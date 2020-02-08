package li.jesse.volcanocommon.generator;

import java.util.UUID;

public class Uuid {

    public static String generateUuid() {
        String uuid = UUID.randomUUID().toString().replaceAll("-", "");
        return uuid;
    }
}
