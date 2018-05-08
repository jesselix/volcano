package org.junyingli.code.util;

import org.junyingli.code.enumeration.CommonEnum;

import java.util.*;

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

    public static int[] intersectionArray(int[] arr1, int[] arr2) {
        Set<Integer> resultSet = new HashSet<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int i = 0; i < arr1.length; i++) {
            set1.add(Integer.valueOf(arr1[i]));
        }

        for (int i = 0; i < arr2.length; i++) {
            set2.add(Integer.valueOf(arr2[i]));
        }

        resultSet.clear();
        resultSet.addAll(set1);
        resultSet.retainAll(set2);

        int[] resultArray = new int[resultSet.size()];

        int i = 0;
        for (Integer integer : resultSet) {
            resultArray[i] = integer.intValue();
            i++;
        }

        return resultArray;
    }

    public static int[] intersectionArray(List<int[]> arrayList) {
        Set<Integer> resultSet = new HashSet<>();
        Set<Integer> set1 = new HashSet<>();

        boolean x = true;

        for (int i = 0; i < arrayList.size(); i++) {
            int[] arr = arrayList.get(i);

            for (int j = 0; j < arr.length; j++) {
                set1.add(Integer.valueOf(arr[j]));
            }

            if (x) {
                resultSet.addAll(set1);
            } else {
                resultSet.retainAll(set1);
            }
            x = false;

            set1.clear();
        }

        int[] resultArray = new int[resultSet.size()];

        int i = 0;
        for (Integer integer : resultSet) {
            resultArray[i] = integer.intValue();
            i++;
        }

        return resultArray;
    }

    public static int[] unionArray(int[] arr1, int[] arr2) {
        Set<Integer> resultSet = new HashSet<>();
        Set<Integer> set1 = new HashSet<>();

        for (int i = 0; i < arr1.length; i++) {
            set1.add(Integer.valueOf(arr1[i]));
        }

        resultSet.addAll(set1);
        set1.clear();

        for (int i = 0; i < arr2.length; i++) {
            set1.add(Integer.valueOf(arr2[i]));
        }

        resultSet.addAll(set1);

        int[] resultArray = new int[resultSet.size()];

        int i = 0;
        for (Integer integer : resultSet) {
            resultArray[i] = integer.intValue();
            i++;
        }

        return resultArray;
    }

    public static int[] unionArray(List<int[]> arrayList) {
        Set<Integer> resultSet = new HashSet<>();
        Set<Integer> set1 = new HashSet<>();

        for (int i = 0; i < arrayList.size(); i++) {
            int[] arr = arrayList.get(i);

            for (int j = 0; j < arr.length; j++) {
                set1.add(Integer.valueOf(arr[j]));
            }

            resultSet.addAll(set1);
            set1.clear();
        }

        int[] resultArray = new int[resultSet.size()];

        int i = 0;
        for (Integer integer : resultSet) {
            resultArray[i] = integer.intValue();
            i++;
        }

        return resultArray;
    }

}
