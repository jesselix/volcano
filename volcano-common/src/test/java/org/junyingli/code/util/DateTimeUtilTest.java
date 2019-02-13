package org.junyingli.code.util;

import org.junit.Test;

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

}
