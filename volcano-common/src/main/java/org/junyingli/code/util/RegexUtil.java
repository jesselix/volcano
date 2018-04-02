package org.junyingli.code.util;

import java.util.regex.Pattern;

public class RegexUtil {

    public static boolean checkURL(String content) {
        String regex = "";
        return Pattern.matches(regex, content);
    }

    public static boolean checkEmail(String content) {
        String regex = "";
        return Pattern.matches(regex, content);
    }
}
