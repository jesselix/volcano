package li.jesse.volcano.util;

import org.junit.jupiter.api.Test;

public class PhotographyUtilTest {

    @Test
    public void testTimeLapseCalculator() {
        Integer shutterInterval = 4;
        Integer recordingTime = 60 * 60;
        Integer finalVideoLength = 60;
        Integer frameRate = 30;

//        System.out.println(PhotographyUtil.timeLapseCalculator(1, 3600, null, 30));
//        System.out.println(PhotographyUtil.timeLapseCalculator(4, null, 60, 30));
//        System.out.println(PhotographyUtil.timeLapseCalculator(3, null, 60, 30));

        System.out.println(PhotographyUtil.timeLapseCalculator(4, 6648, null, 30));

        System.out.println(PhotographyUtil.timeLapseCalculator(2, 3600, null, 60));
    }
}
