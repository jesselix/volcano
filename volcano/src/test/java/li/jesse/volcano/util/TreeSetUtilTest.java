package li.jesse.volcano.util;

import org.junit.jupiter.api.Test;

import java.util.TreeSet;

public class TreeSetUtilTest {

    @Test
    public void testPrintTreeSet() {
        TreeSet treeSet = new TreeSet();
        treeSet.add(105);
        treeSet.add(2);
        treeSet.add(3);
        treeSet.add(100);
        TreeSetUtil.printHashSet(treeSet);

        TreeSet treeSet2 = new TreeSet();
        treeSet2.add("banana");
        treeSet2.add("orange");
        treeSet2.add("apple");
        treeSet2.add("peach");
        TreeSetUtil.printHashSet(treeSet2);
    }

}
