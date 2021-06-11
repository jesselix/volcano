package li.jesse.volcano.util;

import org.junit.jupiter.api.Test;

import java.util.Locale;

public class LanguageUtilTest {

    @Test
    public void testLanguage() {
        Locale locale = Locale.getDefault();
        System.out.println(locale.getLanguage());
        System.out.println(locale.getCountry());
    }
}
