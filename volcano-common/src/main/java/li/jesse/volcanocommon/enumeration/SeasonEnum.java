package li.jesse.volcanocommon.enumeration;

import li.jesse.volcanocommon.util.EnumUtil;

public enum SeasonEnum {

    SPRING(1, "Spring"),
    SUMMER(2, "Summer"),
    AUTUMN(3, "Autumn"),
    WINTER(4, "Winter");

    private int code;
    private String description;

    SeasonEnum(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public static SeasonEnum getNextName(SeasonEnum current) {
        return getEnumNameByCode(EnumUtil.getNextCode(current.code, SeasonEnum.values().length, 1));
    }

    public static SeasonEnum getEnumNameByCode(int code) {
        for (SeasonEnum c : SeasonEnum.values()) {
            if (c.code == code) {
                return c;
            }
        }

        return null;
    }
}
