package li.jesse.volcanocommon.enumeration;

import org.junit.jupiter.api.Test;

public class LoginResponseEnumTest {

    @Test
    public void testLoginResponseEnum() {
        LoginResponseEnum response = LoginResponseEnum.ERROR;
        LoginResponseEnum response2 = LoginResponseEnum.getNextName(response);
        LoginResponseEnum response3 = LoginResponseEnum.getNextName(response2);
        LoginResponseEnum response4 = LoginResponseEnum.getNextName(response3);
        LoginResponseEnum response5 = LoginResponseEnum.getNextName(response4);

        System.out.println(response);
        System.out.println(response2);
        System.out.println(response3);
        System.out.println(response4);
        System.out.println(response5);
    }
}
