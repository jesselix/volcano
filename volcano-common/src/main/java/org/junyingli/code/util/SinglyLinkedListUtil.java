package org.junyingli.code.util;

import org.junyingli.code.data.SinglyLinkedList;
import org.junyingli.code.data.SinglyListNode;

public class SinglyLinkedListUtil {

    /**
     * build singly linked list from array
     * @param array
     * @return
     */
    public static SinglyLinkedList buildSinglyLinkedListFromIntArray(int[] array) {

        SinglyListNode[] array2 = new SinglyListNode[array.length];

        for (int i = array.length - 1; i >= 0; i--) {
            SinglyListNode tempNode = new SinglyListNode();
            tempNode.setValue(array[i]);

            if (i == array.length - 1) {
                tempNode.setNext(null);
            }
            else {
                tempNode.setNext(array2[i + 1]);
            }

            array2[i] = tempNode;
        }

        SinglyListNode headNode = array2[0];
        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.setHeadNode(headNode);

        return linkedList;
    }

    /**
     * build singly linked list from list node array with null next
     * @param array
     * @return
     */
    public static SinglyLinkedList buildSinglyLinkedListFromListNodeArrayWithNullNext(SinglyListNode[] array) {
        SinglyListNode[] array2 = new SinglyListNode[array.length];

        for (int i = array.length - 1; i >= 0; i--) {
            SinglyListNode tempNode = new SinglyListNode();
            tempNode.setValue(array[i].getValue());

            if (i == array.length - 1) {
                tempNode.setNext(null);
            }
            else {
                tempNode.setNext(array2[i + 1]);
            }

            array2[i] = tempNode;
        }

        SinglyListNode headNode = array2[0];
        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.setHeadNode(headNode);

        return linkedList;
    }

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
