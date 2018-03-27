package org.junyingli.code.util;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetUtil {

    public static void printHashSet(HashSet set) {
        for(Iterator iterator = set.iterator(); iterator.hasNext(); ) {
            System.out.printf("iterator: %s\n", iterator.next());
        }
    }
}
