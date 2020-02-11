package li.jesse.volcanocommon.enumeration;

import li.jesse.volcanocommon.util.EnumUtil;

public enum LoginResponseEnum {

    ILLEGAL_ARGUMENT(-2, "ILLEGAL_ARGUMENT"),
    NEED_LOGIN(-1, "NEED_LOGIN"),
    ERROR(0, "ERROR"),
    SUCCESS(1, "SUCCESS");

    private int code;
    private String description;

    LoginResponseEnum(int code, String desc) {
        this.code = code;
        this.description = desc;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public static LoginResponseEnum getNextName(LoginResponseEnum current) {
        return getEnumNameByCode(EnumUtil.getNextCode(current.code, LoginResponseEnum.values().length, -2));
    }

    public static LoginResponseEnum getEnumNameByCode(int code) {
        for (LoginResponseEnum c : LoginResponseEnum.values()) {
            if (c.code == code) {
                return c;
            }
        }

        return null;
    }
}
