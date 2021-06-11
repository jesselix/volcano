package li.jesse.volcano.util;

import org.junit.jupiter.api.Test;

import java.util.HashSet;

public class HashSetUtilTest {

    @Test
    public void testPrintHashSet() {
        HashSet hashSet = new HashSet();
        hashSet.add(105);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(100);
        HashSetUtil.printHashSet(hashSet);

        HashSet hashSet2 = new HashSet();
        hashSet2.add("banana");
        hashSet2.add("orange");
        hashSet2.add("apple");
        hashSet2.add("peach");
        HashSetUtil.printHashSet(hashSet2);
    }


    @Test
    public void testConvertArrayIntoHashSet() {
        int[] testArray = {109, 108, 107, 107, 106, 105, 0, 1, 1, 2, 3, 4, 4, 4, 5};

        HashSetUtil.printHashSet(HashSetUtil.convertArrayIntoHashSet(testArray));
    }
}
