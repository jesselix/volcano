package org.junyingli.code.data;

public class SinglyListNode {

    // value of the node
    private int value;
    // pointer to the next node
    private SinglyListNode next;

    // *********************** constructors ***********************
    public SinglyListNode() {

    }

    public SinglyListNode(int value) {
        this.value = value;
        this.next = null;
    }

    public SinglyListNode(int value, SinglyListNode next) {
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

    public SinglyListNode getNext() {
        return next;
    }

    public void setNext(SinglyListNode next) {
        this.next = next;
    }

    public void display() {
        System.out.print( value + " ");
    }
}