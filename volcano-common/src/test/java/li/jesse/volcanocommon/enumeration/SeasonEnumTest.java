package li.jesse.volcanocommon.enumeration;

import org.junit.jupiter.api.Test;

public class SeasonEnumTest {

    @Test
    public void testSeasonEnum() {
        SeasonEnum season = SeasonEnum.AUTUMN;
        SeasonEnum season2 = SeasonEnum.getNextName(season);
        SeasonEnum season3 = SeasonEnum.getNextName(season2);

        System.out.println(season);
        System.out.println(season2);
        System.out.println(season3);
    }
}
