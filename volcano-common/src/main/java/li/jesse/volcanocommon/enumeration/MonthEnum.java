package li.jesse.volcanocommon.enumeration;

import li.jesse.volcanocommon.util.EnumUtil;

public enum MonthEnum {

    JANUARY(1, "January"),
    FEBRUARY(2, "February"),
    MARCH(3, "March"),
    APRIL(4, "April"),
    MAY(5, "May"),
    JUNE(6, "June"),
    JULY(7, "July"),
    AUGUST(8, "August"),
    SEPTEMBER(9, "September"),
    OCTOBER(10, "October"),
    NOVEMBER(11, "November"),
    DECEMBER(12, "December");

    private int code;
    private String description;

    MonthEnum(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public static MonthEnum getNextName(MonthEnum current) {
        return getEnumNameByCode(EnumUtil.getNextCode(current.code, MonthEnum.values().length, 1));
    }

    public static MonthEnum getEnumNameByCode(int code) {
        for (MonthEnum c : MonthEnum.values()) {
            if (c.code == code) {
                return c;
            }
        }

        return null;
    }
}
