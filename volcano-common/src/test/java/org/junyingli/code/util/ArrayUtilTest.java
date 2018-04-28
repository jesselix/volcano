package org.junyingli.code.util;

import org.junit.Test;
import org.junyingli.code.enumeration.CommonEnum;

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

    @Test
    public void testShuffleArray() {
        ArrayUtil.printArray(orderedTestArray);
        System.out.println();
        ArrayUtil.printArray(ArrayUtil.shuffleArray(orderedTestArray));
        System.out.println();
    }

    @Test
    public void testFindMinMax() {
        System.out.println(ArrayUtil.findMinMax(testArray, CommonEnum.MinMax.MIN));
        System.out.println(ArrayUtil.findMinMax(testArray, CommonEnum.MinMax.MAX));
    }

    @Test
    public void testConvertStringIntoArray() {
        String ss = "2,33";
        ArrayUtil.printArray(ArrayUtil.convertStringIntoArray(ss));
    }

    @Test
    public void testIntersectionAndUnionArray() {
        String strMS = "1,2,4,5,8,13,15,20,21,23,24,25,26,28,33,46,47,48,53,54,55,56,71,73,75,79,88,91,94,98,101,102,103,106,112,114,116,117,121,124,125,138,141,146,151,153,160,162,165,168,171,173,174,186,189,191,200,204,206,208,212,213,215,218,232,235,236,237,238,258,268,270,273,285,297,300,333,348,365,387,419,445,452,513,567";
        String strZ = "1,2,3,5,8,15,1,20,21,23,42,48,49,73,78,89,98,102,119,121,126,127,138,139,141,146,155,160,167,186,199,200,204,206,215,234,235,236,238,239,240,242,297,355,380,387,396,414,438,449,451,459,460,508,516,517,529,532,534,535,536,537,538,545,579";

        int[] array1 = SortingUtil.bubbleSort(ArrayUtil.intersectionArray(ArrayUtil.convertStringIntoArray(strMS), ArrayUtil.convertStringIntoArray(strZ)));
        ArrayUtil.printArray(array1);
        System.out.println("\nintersectionArray length:" + array1.length);

        int[] array2 = SortingUtil.bubbleSort(ArrayUtil.unionArray(ArrayUtil.convertStringIntoArray(strMS), ArrayUtil.convertStringIntoArray(strZ)));
        ArrayUtil.printArray(array2);
        System.out.println("\nunionArray length:" + array2.length);
    }
}
