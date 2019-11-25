package li.jesse.code.util;

import org.junit.Test;

public class SortingUtilTest {

    private int[] testArray = {4, 9, 5, 8, 7, 0, 1, 3, 2, 6};
    private int[] testArray2 = {4, 9, 5, 8, 7};
    private int[] orderedTestArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

    int length = testArray.length;

    @Test
    public void testBubbleSort() {
        testArray = SortingUtil.bubbleSort(testArray);
        ArrayUtil.printArray(testArray);
    }
}
