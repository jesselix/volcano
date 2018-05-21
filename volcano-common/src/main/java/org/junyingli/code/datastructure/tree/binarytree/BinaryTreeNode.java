package org.junyingli.code.datastructure.tree.binarytree;

public class BinaryTreeNode<E extends Comparable<E>> {

    private E value;
    private BinaryTreeNode<E> leftChild;
    private BinaryTreeNode<E> rightChild;


    public BinaryTreeNode(E value) {
        this.value = value;
        leftChild = null;
        rightChild = null;
    }

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }

    public BinaryTreeNode<E> getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(BinaryTreeNode<E> leftChild) {
        this.leftChild = leftChild;
    }

    public BinaryTreeNode<E> getRightChild() {
        return rightChild;
    }

    public void setRightChild(BinaryTreeNode<E> rightChild) {
        this.rightChild = rightChild;
    }

}
