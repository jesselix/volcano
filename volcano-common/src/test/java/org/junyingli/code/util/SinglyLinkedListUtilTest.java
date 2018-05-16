package org.junyingli.code.util;

import org.junit.Test;
import org.junyingli.code.data.SinglyLinkedList;
import org.junyingli.code.data.SinglyLinkedListNode;

public class SinglyLinkedListUtilTest {

    int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    SinglyLinkedList singlyLinkedList = SinglyLinkedListUtil.createSinglyLinkedListByIntArray(arr);

    // ****************************************** initialization ******************************************

    @Test
    public void testCreateSinglyLinkedListByIntArray() {
        SinglyLinkedList linkedList = new SinglyLinkedList();

        linkedList = SinglyLinkedListUtil.createSinglyLinkedListByIntArray(arr);
        SinglyLinkedListUtil.printSinglyLinkedList(linkedList);
    }

    @Test
    public void testCreateIntArrayBySinglyLinkedList() {
        SinglyLinkedListNode node1 = new SinglyLinkedListNode(1);
        SinglyLinkedListNode node2 = new SinglyLinkedListNode(2);
        SinglyLinkedListNode node3 = new SinglyLinkedListNode(3);
        SinglyLinkedListNode node4 = new SinglyLinkedListNode(4);

        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);

        int[] arr = SinglyLinkedListUtil.createIntArrayBySinglyLinkedList(node1);
        ArrayUtil.printArray(arr);
    }

    @Test
    public void testCreateSinglyLinkedListByListNodeArrayWithNullNext() {
        SinglyLinkedListNode node1 = new SinglyLinkedListNode(1);
        SinglyLinkedListNode node2 = new SinglyLinkedListNode(2);
        SinglyLinkedListNode node3 = new SinglyLinkedListNode(3);
        SinglyLinkedListNode node4 = new SinglyLinkedListNode(4);
        SinglyLinkedListNode[] array = {node1, node2, node3, node4};

        SinglyLinkedList linkedList = SinglyLinkedListUtil.createSinglyLinkedListByListNodeArrayWithNullNext(array);

        SinglyLinkedListUtil.printSinglyLinkedList(linkedList);
    }

    // ****************************************** CRUD functions ******************************************

    @Test
    public void testAddHeadNode() {
        SinglyLinkedListUtil.addHeadNode(singlyLinkedList, -1);
        SinglyLinkedListUtil.printSinglyLinkedList(singlyLinkedList);
    }

    @Test
    public void testDeleteHeadNode() {
        SinglyLinkedListNode newHeadNode = SinglyLinkedListUtil.deleteHeadNode(singlyLinkedList);
        System.out.println(newHeadNode.getValue());
        SinglyLinkedListUtil.printSinglyLinkedList(singlyLinkedList);
    }

    @Test
    public void testInsertNode() {
        SinglyLinkedListUtil.insertNode(singlyLinkedList, 5, 100);
        SinglyLinkedListUtil.printSinglyLinkedList(singlyLinkedList);
    }

    @Test
    public void testFindByPosition() {
        SinglyLinkedListNode node = new SinglyLinkedListNode();
        node = SinglyLinkedListUtil.findByPosition(singlyLinkedList, 3);
        System.out.println(node.getValue());
    }
}
