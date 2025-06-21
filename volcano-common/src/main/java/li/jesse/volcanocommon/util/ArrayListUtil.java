package li.jesse.volcanocommon.util;

import java.util.ArrayList;
import java.util.List;

public class ArrayListUtil {

    public static void printArrayList(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }

    public static int nullValueCount(ArrayList<Integer> arrayList) {
        int count = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) == null) {
                count++;
            }
        }

        return count;
    }
}
