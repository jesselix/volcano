package li.jesse.code.util;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetUtil {

    public static void printHashSet(HashSet set) {
        for(Iterator iterator = set.iterator(); iterator.hasNext(); ) {
            System.out.printf("iterator: %s\n", iterator.next());
        }
    }


    public static HashSet convertArrayIntoHashSet(int[] array) {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < array.length; i++) {
            hashSet.add(array[i]);
        }

        return hashSet;
    }
}
