package li.jesse.volcanocommon.util;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class ArrayListUtilTest {

    ArrayList<Integer> array1 = new ArrayList<>();

    {
        array1.add(0);
        array1.add(1);
        array1.add(null);
        array1.add(2);
        array1.add(null);
    }

    @Test
    public void testIteratorArrayList() {
        ArrayListUtil.printArrayList(array1);
        System.out.println();
    }

    @Test
    public void testNullValueCount() {
        System.out.println(ArrayListUtil.nullValueCount(array1));
    }
}
