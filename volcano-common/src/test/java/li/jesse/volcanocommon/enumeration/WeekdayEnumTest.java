package li.jesse.volcanocommon.enumeration;

import org.junit.jupiter.api.Test;

public class WeekdayEnumTest {

    @Test
    public void testWeekdayEnum() {
        WeekdayEnum day = WeekdayEnum.SATURDAY;
        WeekdayEnum day2 = WeekdayEnum.getNextName(day);
        WeekdayEnum day3 = WeekdayEnum.getNextName(day2);

        System.out.println(day);
        System.out.println(day2);
        System.out.println(day3);
    }

    @Test
    public void testWeekdayEnumGetter() {
        WeekdayEnum day = WeekdayEnum.MONDAY;
        System.out.println(day.getCode() + " " + day.getDescription());
    }
}
