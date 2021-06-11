package li.jesse.volcano.util;

import org.junit.jupiter.api.Test;

public class StopwatchUtilTest {

    @Test
    public void testStopwatch() {
        StopwatchUtil stopwatchUtil = new StopwatchUtil();

        int sum = 0;
        for (int i = 0; i < 100000000; i++) {
            sum += i;
        }

        System.out.println(stopwatchUtil.elapsedTime());
    }
}
