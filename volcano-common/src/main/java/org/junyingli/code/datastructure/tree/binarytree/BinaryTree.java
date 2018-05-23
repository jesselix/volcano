package org.junyingli.code.datastructure.tree.binarytree;

import java.util.LinkedList;

public class BinaryTree<E extends Comparable<E>> {

    private BinaryTreeNode<E> root;

    private int size;

    public BinaryTree() {
        root = null;
    }

    public BinaryTreeNode<E> getRoot() {
        return root;
    }

    public void insertNode(E value) {
        if (root == null) {
            root = new BinaryTreeNode<E>(value);
            return;
        }
        BinaryTreeNode<E> currentNode = root;
        while (true) {
            if (value.compareTo(currentNode.getValue()) > 0) {
                if (currentNode.getRightChild() == null) {
                    currentNode.setRightChild(new BinaryTreeNode<E>(value));
                    break;
                }
                currentNode = currentNode.getRightChild();
            } else {
                if (currentNode.getLeftChild() == null) {
                    currentNode.setLeftChild(new BinaryTreeNode<E>(value));
                    break;
                }
                currentNode = currentNode.getLeftChild();
            }
        }
    }

}
