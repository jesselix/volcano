package org.junyingli.code.util;

import org.junit.Test;

public class RegexUtilTest {

    String phone = "1234567890";
    String email = "_@g.com";
    String ssn = "123456789";
    String number = "-4554";
    String chineseId = "440784199010824819";

    @Test
    public void testIsPhoneNumber() {
        System.out.println(RegexUtil.isPhoneNumber(phone));
    }

    @Test
    public void testIsEmail() {
        System.out.println(RegexUtil.isEmail(email));
    }

    @Test
    public void testIsSSN() {
        System.out.println(RegexUtil.isSSN(ssn));
    }

    @Test
    public void testIsNumeric() {
        System.out.println(RegexUtil.isNumeric(number));
    }

    @Test
    public void testIsChineseId() {
        System.out.println(RegexUtil.isNumeric(chineseId));
    }
}
