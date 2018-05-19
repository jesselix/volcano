package org.junyingli.code.util;

import org.junit.Test;
import org.junyingli.code.datastructure.tree.binarytree.BinaryTreeNode;

import java.util.ArrayList;

public class BinaryTreeUtilTest {

    BinaryTreeNode node1 = new BinaryTreeNode(11);
    BinaryTreeNode node2 = new BinaryTreeNode(12);
    BinaryTreeNode node3 = new BinaryTreeNode(13);
    BinaryTreeNode node4 = new BinaryTreeNode(14);
    BinaryTreeNode node5 = new BinaryTreeNode(15);

    {
        node1.setLeftChild(node2);
        node2.setLeftChild(node4);
        node2.setRightChild(node5);
        node1.setRightChild(node3);
    }


    @Test
    public void testLevelOrderTraversal() {
        ArrayList<Integer> al = BinaryTreeUtil.levelOrderTraversal(node1);

        for (Integer list : al) {
            System.out.print(list + " ");
        }
    }

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

}
