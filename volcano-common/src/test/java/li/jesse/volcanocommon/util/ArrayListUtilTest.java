package li.jesse.volcanocommon.util;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class ArrayListUtilTest {

    ArrayList<Integer> al = new ArrayList<>();

    {
        al.add(0);
        al.add(1);
    }

    @Test
    public void testIteratorArrayList() {
        ArrayListUtil.printArrayList(al);
    }
}
