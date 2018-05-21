package org.junyingli.code.util;

import org.junit.Test;
import org.junyingli.code.datastructure.tree.binarytree.BinaryTree;
import org.junyingli.code.datastructure.tree.binarytree.BinaryTreeNode;

public class BinaryTreeUtilTest {

    BinaryTreeNode node1 = new BinaryTreeNode(1);
    BinaryTreeNode node2 = new BinaryTreeNode(2);
    BinaryTreeNode node3 = new BinaryTreeNode(3);
    BinaryTreeNode node4 = new BinaryTreeNode(4);
    BinaryTreeNode node5 = new BinaryTreeNode(5);

    {
        node1.setLeftChild(node2);
        node2.setLeftChild(node4);
        node2.setRightChild(node5);
        node1.setRightChild(node3);

        BinaryTree binaryTree = new BinaryTree();
        binaryTree.insertNode(11);
        binaryTree.insertNode(12);
        binaryTree.insertNode(13);
        binaryTree.insertNode(14);
        binaryTree.insertNode(15);

        BinaryTreeNode node01 = binaryTree.getRoot();
    }

    // ********************************* depth-first traversal recursion **********************************

    @Test
    public void testPreOrderTraversal() {
        BinaryTreeUtil.preOrderTraversal(node1);
    }

    @Test
    public void testInOrderTraversal() {
        BinaryTreeUtil.inOrderTraversal(node1);
    }

    @Test
    public void testPostOrderTraversal() {
        BinaryTreeUtil.postOrderTraversal(node1);
    }

    // ******************************* depth-first traversal non-recursion ********************************

    @Test
    public void testPreOrderTraversal2() {
        BinaryTreeUtil.preOrderTraversal2(node1);
    }

    @Test
    public void testInOrderTraversal2() {
        BinaryTreeUtil.inOrderTraversal2(node1);
    }

    @Test
    public void testPostOrderTraversal2() {
        BinaryTreeUtil.postOrderTraversal2(node1);
    }

    // ************************************* breadth-first traversal **************************************

    @Test
    public void testLevelOrderTraversal() {
        BinaryTreeUtil.levelOrderTraversal(node1);
    }

}
