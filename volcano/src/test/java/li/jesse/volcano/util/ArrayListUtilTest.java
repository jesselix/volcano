package li.jesse.volcano.util;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class ArrayListUtilTest {

    ArrayList<Integer> array1 = new ArrayList<>();

    {
        array1.add(0);
        array1.add(1);
    }

    @Test
    public void testIteratorArrayList() {
        ArrayListUtil.printArrayList(array1);
    }
}
