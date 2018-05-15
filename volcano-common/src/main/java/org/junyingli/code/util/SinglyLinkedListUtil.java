package org.junyingli.code.util;

import org.junyingli.code.data.SinglyLinkedList;
import org.junyingli.code.data.SinglyListNode;

public class SinglyLinkedListUtil {

    /**
     * print elements of the linked List
     * @param linkedList
     */
    public static void printSinglyLinkedList(SinglyLinkedList linkedList) {
        SinglyListNode currentNode = linkedList.getHeadNode();

        while (currentNode != null) {
            currentNode.display();
            currentNode = currentNode.getNext();
        }

        System.out.println();
    }

    /**
     * create singly linked list by array
     * @param array
     * @return
     */
    public static SinglyLinkedList createSinglyLinkedListByIntArray(int[] array) {
        SinglyListNode rootNode = new SinglyListNode(array[0]);
        SinglyListNode goNode = rootNode;

        for (int i = 1; i < array.length; i++) {
            SinglyListNode tempNode = new SinglyListNode(array[i]);
            goNode.setNext(tempNode);
            goNode = tempNode;
        }

        SinglyLinkedList linkedList = new SinglyLinkedList(rootNode);
        return linkedList;
    }

    /**
     * create int array by Singly linked list
     * @param node
     * @return
     */
    public static int[] createIntArrayBySinglyLinkedList(SinglyListNode node) {
        int[] array = new int[getLength(node)];

        SinglyListNode currentNode = node;
        int i = 0;
        while (currentNode.getNext() != null) {
            currentNode = currentNode.getNext();
            array[i] = currentNode.getValue();
            i++;
        }

        return array;
    }

    /**
     * create singly linked list by list node array with null next
     * @param array
     * @return
     */
    public static SinglyLinkedList createSinglyLinkedListByListNodeArrayWithNullNext(SinglyListNode[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            array[i].setNext(array[i + 1]);
        }

        SinglyLinkedList linkedList = new SinglyLinkedList(array[0]);
        return linkedList;
    }

    /**
     * add head node
     * @param linkedList
     * @param value
     */
    public static void addHeadNode(SinglyLinkedList linkedList, int value) {
        SinglyListNode node = new SinglyListNode(value);
        node.setNext(linkedList.getHeadNode());
        linkedList.setHeadNode(node);
    }

    /**
     * delete first node
     * @param linkedList
     * @return
     */
    public static SinglyListNode deleteHeadNode(SinglyLinkedList linkedList) {
        SinglyListNode tempNode = linkedList.getHeadNode();
        linkedList.setHeadNode(tempNode.getNext());
        return tempNode;
    }

    /**
     * insert node
     * @param linkedList
     * @param index
     * @param value
     */
    public static void insertNode(SinglyLinkedList linkedList, int index, int value) {
        SinglyListNode node = new SinglyListNode(value);
        SinglyListNode currentNode = linkedList.getHeadNode();
        SinglyListNode previousNode = linkedList.getHeadNode();

        while (linkedList.getPosition() != index) {
            previousNode = currentNode;
            currentNode = currentNode.getNext();
            linkedList.setPosition(linkedList.getPosition() + 1);
        }

        node.setNext(currentNode);
        previousNode.setNext(node);
        linkedList.setPosition(0);
    }

    /**
     * find node by position
     * @param linkedList
     * @param index
     * @return
     */
    public static SinglyListNode findByPosition(SinglyLinkedList linkedList, int index) {
        SinglyListNode currentNode = linkedList.getHeadNode();

        while (linkedList.getPosition() != index) {
            currentNode = currentNode.getNext();
            linkedList.setPosition(linkedList.getPosition() + 1);
        }

        return currentNode;
    }

    /**
     * find node by value
     * @param linkedList
     * @param value
     * @return
     */
    public static SinglyListNode findByValue(SinglyLinkedList linkedList, int value) {
        SinglyListNode currentNode = linkedList.getHeadNode();

        while (currentNode.getValue() != value) {
            if (currentNode.getNext() == null)
                return null;
            currentNode = currentNode.getNext();
        }

        return currentNode;
    }

    /**
     * get length of the linked list from head node
     * @param head
     * @return
     */
    public static int getLength(SinglyListNode head) {
        int length = 0;

        while (head != null) {
            length++;
            head = head.getNext();
        }

        return length;
    }

}
