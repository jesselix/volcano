package org.junyingli.code.util;

import org.junyingli.code.datastructure.tree.binarytree.BinaryTreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTreeUtil {

    // ********************************* depth-first traversal recursion **********************************

    public static void preOrderTraversal(BinaryTreeNode root) {
        if (root != null) {
            System.out.print(root.getValue() + " ");
            preOrderTraversal(root.getLeftChild());
            preOrderTraversal(root.getRightChild());
        }
    }

    public static void inOrderTraversal(BinaryTreeNode root) {
        if (root != null) {
            inOrderTraversal(root.getLeftChild());
            System.out.print(root.getValue() + " ");
            inOrderTraversal(root.getRightChild());
        }
    }

    public static void postOrderTraversal(BinaryTreeNode root) {
        if (root != null) {
            postOrderTraversal(root.getLeftChild());
            postOrderTraversal(root.getRightChild());
            System.out.print(root.getValue() + " ");
        }
    }

    // ******************************* depth-first traversal non-recursion ********************************

    public static void preOrderTraversal2(BinaryTreeNode root) {
        LinkedList<BinaryTreeNode> stack = new LinkedList<BinaryTreeNode>();
        BinaryTreeNode currentNode = null;
        stack.push(root);
        while (!stack.isEmpty()) {
            currentNode = stack.pop();
            System.out.print(currentNode.getValue() + " ");
            if (currentNode.getRightChild() != null)
                stack.push(currentNode.getRightChild());
            if (currentNode.getLeftChild() != null)
                stack.push(currentNode.getLeftChild());
        }
    }

    public static void inOrderTraversal2(BinaryTreeNode root) {
        LinkedList<BinaryTreeNode> stack = new LinkedList<BinaryTreeNode>();
        BinaryTreeNode currentNode = root;
        while (currentNode != null || !stack.isEmpty()) {
            while (currentNode != null) {
                stack.push(currentNode);
                currentNode = currentNode.getLeftChild();
            }
            currentNode = stack.pop();
            System.out.print(currentNode.getValue() + " ");
            currentNode = currentNode.getRightChild();
        }
    }

    public static void postOrderTraversal2(BinaryTreeNode root) {
        LinkedList<BinaryTreeNode> stack = new LinkedList<BinaryTreeNode>();
        BinaryTreeNode currentNode = root;
        BinaryTreeNode rightNode = null;
        while (currentNode != null || !stack.isEmpty()) {
            while (currentNode != null) {
                stack.push(currentNode);
                currentNode = currentNode.getLeftChild();
            }
            currentNode = stack.pop();
            while (currentNode.getRightChild() == null || currentNode.getRightChild() == rightNode) {
                System.out.print(currentNode.getValue() + " ");
                rightNode = currentNode;
                if (stack.isEmpty()) {
                    return;
                }
                currentNode = stack.pop();
            }
            stack.push(currentNode);
            currentNode = currentNode.getRightChild();
        }
    }

    // ************************************* breadth-first traversal **************************************

    /**
     * level order traversal
     * @param root
     * @return
     */
    public static void levelOrderTraversal(BinaryTreeNode root) {
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        BinaryTreeNode currentNode;
        queue.offer(root);
        while (!queue.isEmpty()) {
            currentNode = queue.poll();
            System.out.print(currentNode.getValue() + " ");
            if (currentNode.getLeftChild() != null)
                queue.offer(currentNode.getLeftChild());
            if (currentNode.getRightChild() != null)
                queue.offer(currentNode.getRightChild());
        }
    }





}
