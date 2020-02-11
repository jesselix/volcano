package li.jesse.volcanocommon.enumeration;

import li.jesse.volcanocommon.util.EnumUtil;

public enum WeekdayEnum {

    SUNDAY(0, "Sunday"),
    MONDAY(1, "Monday"),
    TUESDAY(2, "Tuesday"),
    WEDNESDAY(3, "Wednesday"),
    THURSDAY(4, "Thursday"),
    FRIDAY(5, "Friday"),
    SATURDAY(6, "Saturday");

    private int code;
    private String description;

    WeekdayEnum(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public static WeekdayEnum getNextName(WeekdayEnum current) {
        return getEnumNameByCode(EnumUtil.getNextCode(current.code, WeekdayEnum.values().length));
    }

    public static WeekdayEnum getEnumNameByCode(int code) {
        for (WeekdayEnum c : WeekdayEnum.values()) {
            if (c.code == code) {
                return c;
            }
        }

        return null;
    }
}
