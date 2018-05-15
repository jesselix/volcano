package org.junyingli.code.util;

import org.junit.Test;
import org.junyingli.code.data.SinglyLinkedList;
import org.junyingli.code.data.SinglyListNode;

public class SinglyLinkedListUtilTest {

    @Test
    public void testSinglyLinkedListUtil() {
        SinglyLinkedList linkedList = new SinglyLinkedList();
        SinglyLinkedListUtil.addHeadNode(linkedList, 100);
        SinglyLinkedListUtil.addHeadNode(linkedList, 200);

        SinglyLinkedListUtil.insertNode(linkedList, 2, 300);

        SinglyLinkedListUtil.printSinglyLinkedList(linkedList);

        SinglyListNode node1 = SinglyLinkedListUtil.findByPosition(linkedList, 0);
        System.out.println(node1.getValue());
    }

    @Test
    public void testBuildSinglyLinkedListFromIntArray() {
        SinglyLinkedList linkedList = new SinglyLinkedList();
        int[] array = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19};

        linkedList = SinglyLinkedListUtil.createSinglyLinkedListByIntArray(array);
        SinglyLinkedListUtil.printSinglyLinkedList(linkedList);
    }

    @Test
    public void testCreateSinglyLinkedListByListNodeArrayWithNullNext() {
        SinglyListNode node1 = new SinglyListNode(1);
        SinglyListNode node2 = new SinglyListNode(2);
        SinglyListNode node3 = new SinglyListNode(3);
        SinglyListNode node4 = new SinglyListNode(4);
        SinglyListNode[] array = {node1, node2, node3, node4};

        SinglyLinkedList linkedList = SinglyLinkedListUtil.createSinglyLinkedListByListNodeArrayWithNullNext(array);

        SinglyLinkedListUtil.printSinglyLinkedList(linkedList);
    }

}
