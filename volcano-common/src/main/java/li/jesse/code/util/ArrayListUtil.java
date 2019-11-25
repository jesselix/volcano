package li.jesse.code.util;

import java.util.List;

public class ArrayListUtil {

    public static void printArrayList(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
