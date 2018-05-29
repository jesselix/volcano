package org.junyingli.code.datastructure.list.linkedlist;

public class SinglyLinkedListNode {

    // value of the node
    private int value;
    // pointer to the next node
    private SinglyLinkedListNode next;

    // *********************** constructors ***********************
    public SinglyLinkedListNode() {
    }

    public SinglyLinkedListNode(int value) {
        this.value = value;
        this.next = null;
    }

    public SinglyLinkedListNode(int value, SinglyLinkedListNode next) {
        this.value = value;
        this.next = next;
    }

    // ******************** getters & setters *********************
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public SinglyLinkedListNode getNext() {
        return next;
    }

    public void setNext(SinglyLinkedListNode next) {
        this.next = next;
    }

    public void display() {
        System.out.print( value + " ");
    }
}