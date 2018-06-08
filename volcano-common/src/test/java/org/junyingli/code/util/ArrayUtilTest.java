package org.junyingli.code.util;

import org.junit.Test;
import org.junyingli.code.enumeration.CommonEnum;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

public class ArrayUtilTest {

    String strGG = "4,10,17,20,22,23,31,42,44,50,54,56,57,66,128,133,139,140,146,155,158," +
            "159,162,163,166,173,200,208,212,214,218,224,228,230,231,239,240,246," +
            "247,249,251,253,257,259,261,266,269,270,271,272,274,276,279,280,281," +
            "282,284,286,288,289,293,294,295,297,298,302,305,308,309,310,312,313," +
            "314,315,316,317,318,320,321,323,324,326,327,329,330,331,332,336,340," +
            "341,345,346,348,351,353,354,356,357,358,359,360,361,362,363,368,369," +
            "370,373,374,375,377,378,379,380,382,388,389,391,393,394,397,399,400," +
            "401,402,406,407,408,409,411,415,417,418,421,422,425,444,447,448,451," +
            "459,460,463,465,469,471,474,475,480,481,482,483,484,485,486,487,490,493,494,498,501,503," +
            "505,506,514,520,521,522,524,526,527,530,531,533,534,535,541,542,543," +
            "544,545,551,552,560,562,568,569,572";
    String strMS = "1,2,4,5,8,13,15,20,21,23,24,25,26,28,33,46,47,48,53,54,55,56,71,73,75,79,88,91,94,98,101,102,103,106,112,114,116,117,121,124,125,138,141,146,151,153,160,162,165,168,171,173,174,186,189,191,200,204,206,208,212,213,215,218,232,235,236,237,238,258,268,270,273,285,297,300,333,348,365,387,419,445,452,513,567";
    String strZ  = "1,2,3,5,8,15,1,20,21,23,42,48,49,73,78,89,98,102,119,121,126,127,138,139,141,146,155,160,167,186,199,200,204,206,215,234,235,236,238,239,240,242,297,355,380,387,396,414,438,449,451,459,460,508,516,517,529,532,534,535,536,537,538,545,579";
    String strIn = "1,21,23,33,34,46,47,50,53,56,57,65,68,76,101,102,103,104,127,149,150,152,156,170,173,18,198,205,236,238,243,244,245,254,256,277,297,311,339,364,366,367,464,515";

    private int[] randomArray = {4, 9, 5, 8, 7, 0, 1, 3, 2, 6};
    private int[] orderedArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    private int[] orderedArray2 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    @Test
    public void testPrintArray() {
        ArrayUtil.printArray(randomArray);
    }

    @Test
    public void testSwap() {
        ArrayUtil.swap(orderedArray, 1, 8);
        ArrayUtil.printArray(orderedArray);
    }

    @Test
    public void testReverse() {
        ArrayUtil.reverse(orderedArray);
        ArrayUtil.printArray(orderedArray);
    }

    @Test
    public void testGenerateArrayWithRandomNumbers() {
        ArrayUtil.printArray(Objects.requireNonNull(ArrayUtil.generateArrayWithRandomNumbers(10, 20, 40, true)));
        System.out.println();
        ArrayUtil.printArray(Objects.requireNonNull(ArrayUtil.generateArrayWithRandomNumbers(10, 20, 40, false)));
        System.out.println();
    }

    @Test
    public void testShuffleArray() {
        ArrayUtil.printArray(orderedArray);
        System.out.println();
        ArrayUtil.printArray(ArrayUtil.shuffleArray(orderedArray));
        System.out.println();
    }

    @Test
    public void testFindMinMax() {
        System.out.println(ArrayUtil.findMinMax(randomArray, CommonEnum.MinMax.MIN));
        System.out.println(ArrayUtil.findMinMax(randomArray, CommonEnum.MinMax.MAX));
    }

    @Test
    public void testIsRepeat() {
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] array2 = {1, 2, 3, 4, 5, 6, 5, 8};

        System.out.println(ArrayUtil.isRepeat(array1));
        System.out.println(ArrayUtil.isRepeat(array2));
    }

    @Test
    public void testConvertStringIntoArray() {
        int[] aryGG = ArrayUtil.convertStringIntoArray(strGG);
//        ArrayUtil.printArray(aryGG);
        System.out.println("gg: " + aryGG.length);

        int[] aryMS = ArrayUtil.convertStringIntoArray(strMS);
//        ArrayUtil.printArray(aryMS);
        System.out.println("ms: " + aryMS.length);

        int[] aryZ = ArrayUtil.convertStringIntoArray(strZ);
//        ArrayUtil.printArray(aryZ);
        System.out.println("z:  " + aryZ.length);

        int[] aryIn = ArrayUtil.convertStringIntoArray(strIn);
//        ArrayUtil.printArray(aryIn);
        System.out.println("in: " + aryIn.length);
    }

    @Test
    public void testIntersectionAndUnionArray() {
        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {2, 4, 6, 8, 10};
        int[] arr3 = {5, 6, 7, 8};

        int[] array1 = SortingUtil.bubbleSort(ArrayUtil.unionArray(arr1, arr2));
        ArrayUtil.printArray(array1);
        System.out.println();
        int[] array2 = SortingUtil.bubbleSort(ArrayUtil.unionArray(arr1, arr3));
        ArrayUtil.printArray(array2);
    }

    @Test
    public void testIntersectionAndUnionArray2() {
        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {2, 4, 6, 8, 10, 5, 7};
        int[] arr3 = {5, 6, 7, 8};

        List<int[]> arrayList = new ArrayList<>();
        arrayList.add(arr1);
        arrayList.add(arr2);
        arrayList.add(arr3);

        int[] array1 = SortingUtil.bubbleSort(ArrayUtil.intersectionArray(arrayList));
        ArrayUtil.printArray(array1);

        int[] array2 = SortingUtil.bubbleSort(ArrayUtil.unionArray(arrayList));
        ArrayUtil.printArray(array2);
    }

    @Test
    public void testIntersectionAndUnionArrayForLeetCode() {
        int[] array1 = SortingUtil.bubbleSort(ArrayUtil.intersectionArray(ArrayUtil.convertStringIntoArray(strMS), ArrayUtil.convertStringIntoArray(strZ)));
        ArrayUtil.printArray(array1);
        System.out.println("\nintersectionArray length: " + array1.length);

        int[] array2 = SortingUtil.bubbleSort(ArrayUtil.unionArray(ArrayUtil.convertStringIntoArray(strMS), ArrayUtil.convertStringIntoArray(strZ)));
        ArrayUtil.printArray(array2);
        System.out.println("\nunionArray length: " + array2.length);
    }


    public void testGo() {

        ArrayList<int[]> arrayList = new ArrayList<>();
        int[] a1 = {1, 2, 3};
        int[] b1 = {2, 3, 4, 5};

        arrayList.add(a1);
        arrayList.add(b1);
    }

}
