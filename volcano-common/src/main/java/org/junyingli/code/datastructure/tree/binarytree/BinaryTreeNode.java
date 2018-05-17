package org.junyingli.code.datastructure.tree.binarytree;

public class BinaryTreeNode<V> {

    private V value;
    private BinaryTreeNode<V> leftChild;
    private BinaryTreeNode<V> rightChild;

    public BinaryTreeNode() {
    }

    public BinaryTreeNode(V value) {
        this.value = value;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public BinaryTreeNode<V> getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(BinaryTreeNode<V> leftChild) {
        this.leftChild = leftChild;
    }

    public BinaryTreeNode<V> getRightChild() {
        return rightChild;
    }

    public void setRightChild(BinaryTreeNode<V> rightChild) {
        this.rightChild = rightChild;
    }

}
