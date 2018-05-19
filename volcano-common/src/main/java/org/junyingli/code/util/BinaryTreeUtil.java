package org.junyingli.code.util;

import org.junyingli.code.datastructure.tree.binarytree.BinaryTreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeUtil {

    // ************************************** depth-first traversal ***************************************

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
