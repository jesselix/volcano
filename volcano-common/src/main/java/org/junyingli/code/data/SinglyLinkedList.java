package org.junyingli.code.data;

public class SinglyLinkedList {

    // head node
    private SinglyListNode headNode;
    // position of the node
    private int position = 0;

    // ******************************************* constructors *******************************************
    public SinglyLinkedList() {
        this.headNode = null;
    }

    public SinglyLinkedList(SinglyListNode headNode) {
        this.headNode = headNode;
    }

    // **************************************** getters & setters *****************************************
    public SinglyListNode getHeadNode() {
        return headNode;
    }

    public void setHeadNode(SinglyListNode headNode) {
        this.headNode = headNode;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
