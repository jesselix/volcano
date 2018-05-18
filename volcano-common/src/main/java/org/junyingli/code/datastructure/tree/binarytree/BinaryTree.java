package org.junyingli.code.datastructure.tree.binarytree;

import java.util.LinkedList;

public class BinaryTree {

    private BinaryTreeNode<Integer> root;

    private int size;

    public BinaryTree() {
        root = new BinaryTreeNode<>();
    }

    public BinaryTree(int[] values) {
        System.out.print("新建binaryTree:");
        for (int i : values) {
            System.out.print(i);
        }
        System.out.println();
        boolean isLeft = true;
        int len = values.length;
        if (len == 0)
            return ;
        LinkedList<BinaryTreeNode<Integer>> queue = new LinkedList<BinaryTreeNode<Integer>>();
        root = new BinaryTreeNode<Integer>(values[0]);
        queue.addLast(root);
        BinaryTreeNode parent = null;
        BinaryTreeNode current = null;
        for (int i=1; i<len; i++) {
            current = new BinaryTreeNode<Integer>(values[i]);
            queue.addLast(current);
            if (isLeft)
                parent = queue.getFirst();
            else
                parent = queue.removeFirst();
            if (isLeft) {
                parent.setLeftChild(current);
                isLeft = false;
            }else {
                parent.setRightChild(current);
                isLeft = true;
            }
        }
    }
}
