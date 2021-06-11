package li.jesse.volcano.util;

public class SortingUtil {

    public static int[] bubbleSort(int[] array) {
        int i, j, temp, length = array.length;
        int x = 0;

        for (i = 0; i < length - 1; i++) {
            for (j = 0; j < length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
//					temp = array[j];
//					array[j] = array[j + 1];
//					array[j + 1] = temp;
                    ArrayUtil.swap(array, j, j + 1);
                }
                x++;
            }
        }

        return array;
    }
}
