package li.jesse.volcanocommon.util;

import org.junit.jupiter.api.Test;

import java.text.ParseException;

public class DateTimeUtilTest {

    @Test
    public void testTimeStampNow() {
        System.out.println(DateTimeUtil.timeStampNow());
        System.out.println(DateTimeUtil.timeStampNow2());
    }



    @Test
    public void testDateToStamp() {
        try {
            System.out.println(DateTimeUtil.dateToStamp("2056-01-01 08:00:00:111"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testDateAfterMonths() {
        String date = "2019-08-25";
        String date2 = "2019-01-31";
        System.out.println(DateTimeUtil.dateAfterMonths(date, 1));
        System.out.println(DateTimeUtil.dateAfterMonths(date2, 1));
    }

}
