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
        LinkedList<BinaryTreeNode> stack = new LinkedList<>();
        BinaryTreeNode pNode = root;
        while (pNode != null || !stack.isEmpty()) {
            if (pNode != null) {
                System.out.print(pNode.getValue()+"  ");
                stack.push(pNode);
                pNode = pNode.getLeftChild();
            } else { //pNode == null && !stack.isEmpty()
                BinaryTreeNode node = stack.pop();
                pNode = node.getRightChild();
            }
        }
    }

    public static void inOrderTraversal2(BinaryTreeNode root) {
        LinkedList<BinaryTreeNode> stack = new LinkedList<>();
        BinaryTreeNode pNode = root;
        while (pNode != null || !stack.isEmpty()) {
            if (pNode != null) {
                stack.push(pNode);
                pNode = pNode.getLeftChild();
            } else { //pNode == null && !stack.isEmpty()
                BinaryTreeNode node = stack.pop();
                System.out.print(node.getValue()+"  ");
                pNode = node.getRightChild();
            }
        }
    }

    public static void postOrderTraversal2(BinaryTreeNode root) {
        LinkedList<BinaryTreeNode> stack = new LinkedList<BinaryTreeNode>();
        BinaryTreeNode currentNode = root;
        BinaryTreeNode rightNode = null;
        while (currentNode != null || !stack.isEmpty()) {
            // 一直循环到二叉排序树最左端的叶子结点（currentNode是null）
            while (currentNode != null) {
                stack.push(currentNode);
                currentNode = currentNode.getLeftChild();
            }
            currentNode = stack.pop();
            // 当前结点没有右结点或上一个结点（已经输出的结点）是当前结点的右结点，则输出当前结点
            while (currentNode.getRightChild() == null || currentNode.getRightChild() == rightNode) {
                System.out.print(currentNode.getValue() + " ");
                rightNode = currentNode;
                if (stack.isEmpty()) {
                    return;
                }
                currentNode = stack.pop();
            }
            stack.push(currentNode); //还有右结点没有遍历
            currentNode = currentNode.getRightChild();
        }
    }

    // ************************************* breadth-first traversal **************************************

    /**
     * level order traversal
     * @param root
     * @return
     */
    public static ArrayList<Integer> levelOrderTraversal(BinaryTreeNode root) {
        ArrayList arrayList = new ArrayList<Integer>();
        if (root == null) {
            return arrayList;
        }

        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            BinaryTreeNode binaryTreeNode = queue.poll();
            if (binaryTreeNode.getLeftChild() != null) {
                queue.offer(binaryTreeNode.getLeftChild());
            }
            if (binaryTreeNode.getRightChild() != null) {
                queue.offer(binaryTreeNode.getRightChild());
            }
            arrayList.add(binaryTreeNode.getValue());
        }

        return arrayList;
    }

}
