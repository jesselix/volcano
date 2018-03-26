package org.junying.code.util;

import org.junit.Test;
import org.junyingli.code.util.ArrayUtil;

public class ArrayUtilTest {

    private int[] testArray = {4, 9, 5, 8, 7, 0, 1, 3, 2, 6};
    private int[] orderedTestArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

    @Test
    public void testPrintArray() {
        ArrayUtil.printArray(testArray);
    }

    @Test
    public void testSwap() {
        ArrayUtil.swap(orderedTestArray, 1, 8);
        ArrayUtil.printArray(orderedTestArray);
    }
}
