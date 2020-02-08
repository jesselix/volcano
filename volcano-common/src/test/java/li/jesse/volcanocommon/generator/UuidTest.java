package li.jesse.volcanocommon.generator;

import li.jesse.volcanocommon.generator.Uuid;
import org.junit.Test;

public class UuidTest {

    @Test
    public void testUuidUtil() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Uuid.generateUuid());
        }
    }
}
