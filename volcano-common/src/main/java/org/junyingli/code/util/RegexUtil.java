package org.junyingli.code.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexUtil {

    public static boolean isPhoneNumber(String content) {
        String regex = "^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(content);
        return matcher.matches();
    }

    public static boolean isEmail(String content) {
        String regex = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(content);
        return matcher.matches();
    }

    public static boolean isSSN(String content) {
        String regex = "^\\d{3}[- ]?\\d{2}[- ]?\\d{4}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(content);
        return matcher.matches();
    }

    public static boolean isNumeric(String content) {
        String regex = "^[-+]?[0-9]*\\.?[0-9]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(content);
        return matcher.matches();
    }

    public static boolean isChineseId(String content) {
        String regex = "";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(content);
        return matcher.matches();
    }
}
