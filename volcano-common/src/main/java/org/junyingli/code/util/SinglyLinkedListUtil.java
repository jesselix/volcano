package org.junyingli.code.util;

import org.junyingli.code.data.SinglyLinkedList;
import org.junyingli.code.data.SinglyLinkedListNode;

public class SinglyLinkedListUtil {

    /**
     * print elements of the linked List
     * @param linkedList
     */
    public static void printSinglyLinkedList(SinglyLinkedList linkedList) {
        SinglyLinkedListNode currentNode = linkedList.getHeadNode();

        while (currentNode != null) {
            currentNode.display();
            currentNode = currentNode.getNext();
        }

        System.out.println();
    }

    // ****************************************** initialization ******************************************

    /**
     * convert int array into singly linked list
     * @param array
     * @return
     */
    public static SinglyLinkedList convertIntArrayIntoSinglyLinkedList(int[] array) {
        SinglyLinkedListNode rootNode = new SinglyLinkedListNode(array[0]);
        SinglyLinkedListNode goNode = rootNode;

        for (int i = 1; i < array.length; i++) {
            SinglyLinkedListNode tempNode = new SinglyLinkedListNode(array[i]);
            goNode.setNext(tempNode);
            goNode = tempNode;
        }

        SinglyLinkedList linkedList = new SinglyLinkedList(rootNode);
        return linkedList;
    }

    /**
     * convert singly linked list into int array
     * @param node
     * @return
     */
    public static int[] convertSinglyLinkedListIntoIntArray(SinglyLinkedListNode node) {
        int[] array = new int[getLength(node)];
        SinglyLinkedListNode currentNode = node;
        int i = 0;
        while (currentNode != null) {
            array[i] = currentNode.getValue();
            currentNode = currentNode.getNext();
            i++;
        }

        return array;
    }

    /**
     * convert list node array with null next into singly linked list
     * @param array
     * @return
     */
    public static SinglyLinkedList convertListNodeArrayWithNullNextIntoSinglyLinkedList(SinglyLinkedListNode[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            array[i].setNext(array[i + 1]);
        }

        SinglyLinkedList linkedList = new SinglyLinkedList(array[0]);
        return linkedList;
    }

    // ******************************************** functions *********************************************

    /**
     * get length of the linked list
     * @param singlyLinkedList
     * @return
     */
    public static int getLength(SinglyLinkedList singlyLinkedList) {
        int length = 0;

        SinglyLinkedListNode head = singlyLinkedList.getHeadNode();

        while (head != null) {
            length++;
            head = head.getNext();
        }

        return length;
    }

    /**
     * get length of the linked list by head node
     * @param head
     * @return
     */
    public static int getLength(SinglyLinkedListNode head) {
        int length = 0;

        while (head != null) {
            length++;
            head = head.getNext();
        }

        return length;
    }

    // ****************************************** CRUD functions ******************************************

    /**
     * add head node
     * @param linkedList
     * @param value
     */
    public static void addHeadNode(SinglyLinkedList linkedList, int value) {
        SinglyLinkedListNode newHeadNode = new SinglyLinkedListNode(value);
        newHeadNode.setNext(linkedList.getHeadNode());
        linkedList.setHeadNode(newHeadNode);
    }

    /**
     * delete first node and return new head node
     * @param linkedList
     * @return
     */
    public static SinglyLinkedListNode deleteHeadNode(SinglyLinkedList linkedList) {
        SinglyLinkedListNode newHeadNode = linkedList.getHeadNode().getNext();
        linkedList.setHeadNode(newHeadNode);
        return newHeadNode;
    }

    /**
     * insert node after index
     * @param singlyLinkedList
     * @param index
     * @param value
     */
    public static void insertNode(SinglyLinkedList singlyLinkedList, int index, int value) {
        SinglyLinkedListNode insertNode = new SinglyLinkedListNode(value);
        SinglyLinkedListNode currentNode = singlyLinkedList.getHeadNode();

        while (singlyLinkedList.getPosition() != index) {
            currentNode = currentNode.getNext();
            singlyLinkedList.setPosition(singlyLinkedList.getPosition() + 1);
        }

        insertNode.setNext(currentNode.getNext());
        currentNode.setNext(insertNode);
        singlyLinkedList.setPosition(0);
    }

    /**
     * find node by position
     * @param singlyLinkedList
     * @param index
     * @return
     */
    public static SinglyLinkedListNode findByPosition(SinglyLinkedList singlyLinkedList, int index) {
        SinglyLinkedListNode currentNode = singlyLinkedList.getHeadNode();

        while (singlyLinkedList.getPosition() != index) {
            currentNode = currentNode.getNext();
            singlyLinkedList.setPosition(singlyLinkedList.getPosition() + 1);
        }

        return currentNode;
    }

    /**
     * find node by value
     * @param singlyLinkedList
     * @param value
     * @return
     */
    public static SinglyLinkedListNode findByValue(SinglyLinkedList singlyLinkedList, int value) {
        SinglyLinkedListNode currentNode = singlyLinkedList.getHeadNode();

        while (currentNode.getValue() != value) {
            if (currentNode.getNext() == null)
                return null;
            currentNode = currentNode.getNext();
        }

        return currentNode;
    }

}
