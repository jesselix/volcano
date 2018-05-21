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

    //    public BinaryTree(int[] values) {
//        System.out.print("新建binaryTree:");
//        for (int i : values) {
//            System.out.print(i);
//        }
//        System.out.println();
//        boolean isLeft = true;
//        int len = values.length;
//        if (len == 0)
//            return ;
//        LinkedList<BinaryTreeNode<Integer>> queue = new LinkedList<BinaryTreeNode<Integer>>();
//        root = new BinaryTreeNode<Integer>(values[0]);
//        queue.addLast(root);
//        BinaryTreeNode parent = null;
//        BinaryTreeNode current = null;
//        for (int i=1; i<len; i++) {
//            current = new BinaryTreeNode<Integer>(values[i]);
//            queue.addLast(current);
//            if (isLeft)
//                parent = queue.getFirst();
//            else
//                parent = queue.removeFirst();
//            if (isLeft) {
//                parent.setLeftChild(current);
//                isLeft = false;
//            }else {
//                parent.setRightChild(current);
//                isLeft = true;
//            }
//        }
//    }

//    public void inorder() {
//        System.out.print("binaryTree递归中序遍历:");
//        inorderTraverseRecursion(root);
//        System.out.println();
//    }
//
//    private void inorderTraverseRecursion(BinaryTreeNode<Integer> node) {
//
//        if (node.getLeftChild() != null)
//            inorderTraverseRecursion(node.getLeftChild());
//        System.out.print(node.getValue());
//        if (node.getRightChild() != null)
//            inorderTraverseRecursion(node.getRightChild());
//    }
//
//    //层次遍历
//    public void layerOrder() {
//        System.out.print("binaryTree层次遍历:");
//        LinkedList<BinaryTreeNode<Integer>> queue = new LinkedList<BinaryTreeNode<Integer>>();
//        queue.addLast(root);
//        BinaryTreeNode<Integer> current = null;
//        while(!queue.isEmpty()) {
//            current = queue.removeFirst();
//            if (current.getLeftChild() != null)
//                queue.addLast(current.getLeftChild());
//            if (current.getRightChild() != null)
//                queue.addLast(current.getRightChild());
//            System.out.print(current.getValue());
//        }
//        System.out.println();
//    }
//
//    public static void main(String[] args) {
//        BinaryTree bt = new BinaryTree(new int[]{1,2,3,4,5,6,7,8});
//        bt.inorder();
////        bt.preorder();
//        bt.layerOrder();
////        bt.preorderNoRecursion();
////        bt.inorderNoRecursion();
////        bt.postorderNoRecursion();
////        System.out.println("深度为：" + bt.getDepth());
//    }
}
