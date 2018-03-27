package org.junyingli.code.util;

import java.util.Random;

public class ArrayUtil {

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);

            if (i < array.length - 1) {
                System.out.print(" ");
            }
        }
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void generateArrayWithRandomNumber(int length, int lowerLimit, int upperLimit) {
        System.out.println();
    }

    public static int[] shuffleArray(int[] array) {
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            int p = random.nextInt(array.length);
            swap(array, array[i], array[p]);
        }

        random = null;
        return array;
    }

}
