package org.junyingli.code.datastructure.list.linkedlist;

public class SinglyLinkedList {

    // head node
    private SinglyLinkedListNode headNode;
    // position of the node
    private int position = 0;

    // ******************************************* constructors *******************************************

    public SinglyLinkedList() {
        this.headNode = null;
    }

    public SinglyLinkedList(SinglyLinkedListNode headNode) {
        this.headNode = headNode;
    }

    // **************************************** getters & setters *****************************************

    public SinglyLinkedListNode getHeadNode() {
        return headNode;
    }

    public void setHeadNode(SinglyLinkedListNode headNode) {
        this.headNode = headNode;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
