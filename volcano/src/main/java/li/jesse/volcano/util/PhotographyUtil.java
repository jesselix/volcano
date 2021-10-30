package li.jesse.volcano.util;

import java.util.ArrayList;

public class PhotographyUtil {


    /**
     * Time Lapse Calculator
     * @param shutterInterval
     * @param recordingTime
     * @param finalVideoLength
     * @return
     */
    public static int timeLapseCalculator(Integer shutterInterval, Integer recordingTime, Integer finalVideoLength, Integer frameRate) {
        // shutter interval = recording time / (final video length * frame rate)
        // Time unit is second. Frame rate unit is fps
        if (frameRate == null) {
            return 0;
        }

        ArrayList<Integer> paramArray = new ArrayList<>();
        paramArray.add(shutterInterval);
        paramArray.add(recordingTime);
        paramArray.add(finalVideoLength);

        if (ArrayListUtil.nullValueCount(paramArray) != 1) {
            return 0;
        }

        if (recordingTime == null) {
            return finalVideoLength * frameRate * shutterInterval;
        }

        if (finalVideoLength == null) {
            return recordingTime / (shutterInterval * frameRate);
        }

        if (shutterInterval == null) {
            return recordingTime / (finalVideoLength * frameRate);
        }

        return 0;
    }

}
