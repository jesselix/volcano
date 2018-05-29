package org.junyingli.code.datastructure.list.linkedlist;

public class DoublyLinkedListNode {

    // value of the node
    private int value;
    // pointer to the previous node
    private SinglyLinkedListNode previous;
    // pointer to the next node
    private SinglyLinkedListNode next;


    public DoublyLinkedListNode() {
    }

    public DoublyLinkedListNode(int value) {
        this.value = value;
    }

    public DoublyLinkedListNode(int value, SinglyLinkedListNode previous, SinglyLinkedListNode next) {
        this.value = value;
        this.previous = previous;
        this.next = next;
    }


}
