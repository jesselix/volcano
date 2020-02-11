package li.jesse.volcanocommon.util;

import li.jesse.volcanocommon.enumeration.SimpleEnum;

import java.util.*;

public class ArrayUtil {

    /**
     * print int array
     * @param array
     */
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);

            if (i < array.length - 1) {
                System.out.print(" ");
            }
        }
    }

    /**
     * swap two elements
     * @param array
     * @param index1
     * @param index2
     */
    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    /**
     * reverse the array
     * @param array
     */
    public static void reverse(int[] array) {
        int length = array.length;
        for (int i = 0; i < length * 0.5; i++) {
            swap(array, i, length - 1 - i);
        }
    }

    /**
     * generate array with random numbers
     * @param length
     * @param lowerLimit
     * @param upperLimit
     */
    public static int[] generateArrayWithRandomNumbers(int length, int lowerLimit, int upperLimit, boolean isRepeatAllowed) {
        if (length < 1 || lowerLimit >= upperLimit) {
            return null;
        }

        int[] array = new int[length];

        if (isRepeatAllowed) {
            for (int i = 0; i < length; i++) {
                array[i] = RandomUtil.randomNumberInRange(lowerLimit, upperLimit);
            }
        } else {
            HashSet hashSet = new HashSet();
            while (hashSet.size() != length) {
                hashSet.add(RandomUtil.randomNumberInRange(lowerLimit, upperLimit));
            }
            array = ArrayUtil.convertSetIntoArray(hashSet);
        }

        return array;
    }

    /**
     * shuffle the array
     * @param array
     * @return
     */
    public static int[] shuffleArray(int[] array) {
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            int p = random.nextInt(array.length);
            swap(array, array[i], array[p]);
        }

        return array;
    }

    /**
     * fin minimum or maximum number
     * @param array
     * @param minMax
     * @return
     */
    public static int findMinMax(int[] array, SimpleEnum.MinMaxEnum minMax) {
        if (SimpleEnum.MinMaxEnum.MIN.equals(minMax)) {
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

    /**
     * is elements repeat
     * @param array
     * @return
     */
    public static boolean isRepeat(int[] array) {
        Set set = new HashSet();

        for (int i = 0; i < array.length; i++) {
            set.add(array[i]);
            if (set.size() < i + 1) {
                return true;
            }
        }

        return false;
    }

    /**
     * convert set into array
     * @param set
     * @return
     */
    public static int[] convertSetIntoArray(Set set) {
        int[] array = new int[set.size()];

        int i = 0;
        for(Iterator iterator = set.iterator(); iterator.hasNext(); ) {
            array[i] = (int)iterator.next();
            i++;
        }

        return array;
    }

    /**
     * convert string into array
     * @param str
     * @return
     */
    public static int[] convertStringIntoArray(String str) {
        String[] splitArray = str.split(",");
        int[] array = new int[splitArray.length];

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(splitArray[i]);
        }

        return array;
    }

    /**
     * intersection of two arrays
     * @param arr1
     * @param arr2
     * @return
     */
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

    /**
     * intersection of a list of arrays
     * @param arrayList
     * @return
     */
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

    /**
     * union of two arrays
     * @param arr1
     * @param arr2
     * @return
     */
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

    /**
     * union of a list of arrays
     * @param arrayList
     * @return
     */
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
