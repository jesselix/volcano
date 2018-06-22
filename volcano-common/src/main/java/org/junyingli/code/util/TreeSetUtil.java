package org.junyingli.code.util;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetUtil {

    public static void printHashSet(TreeSet set) {
        for(Iterator iterator = set.iterator(); iterator.hasNext(); ) {
            System.out.printf("iterator: %s\n", iterator.next());
        }
    }
}
