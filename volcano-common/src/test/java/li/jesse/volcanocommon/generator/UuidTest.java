package li.jesse.volcanocommon.generator;

import li.jesse.volcanocommon.generator.Uuid;
import org.junit.jupiter.api.Test;

public class UuidTest {

    @Test
    public void testUuid() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Uuid.nextUuid());
        }
    }

    @Test
    public void testUuidLength() {
        String str = "8ffe88137aea42b1817abe870b0985ef";
        System.out.println(str.length());
    }
}
