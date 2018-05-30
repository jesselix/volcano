package org.junyingli.code.datastructure.list.linkedlist;

public class DoublyLinkedList {

    // head node
    private DoublyLinkedListNode headNode;
    // position of the node
    private int position = 0;

    // ******************************************* constructors *******************************************

    public DoublyLinkedList() {
        this.headNode = null;
    }

    public DoublyLinkedList(DoublyLinkedListNode headNode) {
        this.headNode = headNode;
    }
}
