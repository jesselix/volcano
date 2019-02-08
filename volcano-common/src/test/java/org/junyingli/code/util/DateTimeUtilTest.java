package org.junyingli.code.util;

import org.junit.Test;

import java.text.ParseException;

public class DateTimeUtilTest {

    @Test
    public void testDateToStamp() {
        try {
            System.out.println(DateTimeUtil.dateToStamp("2015-01-02 10:00:01"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

}
