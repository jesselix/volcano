package org.junyingli.code.util;

import org.junyingli.code.enumeration.CommonEnum;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

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

        return array;
    }

    public static int findMinMax(int[] array, CommonEnum.MinMax minMax) {
        if (CommonEnum.MinMax.MIN.equals(minMax)) {
            int min = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] < min) {
                    min = array[i];
                }
            }

            return min;
        } else {
            int max = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
            }

            return  max;
        }
    }

    public static int[] convertStringIntoArray(String str) {
        String[] splitArray = str.split(",");
        int[] array = new int[splitArray.length];

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(splitArray[i]);
        }

        return array;
    }

    public static int[] commonElements(ArrayList<int[]> arrayList) {
        Set<Integer> result = new HashSet<>();
        for (int i = 0; i < arrayList.size(); i++) {

        }

        return null;
    }

}
