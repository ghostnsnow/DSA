package tree.binarytree.base;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeLinkedListTest {

    @Test
    public void traversal() {
        BinaryTreeLinkedList<String> tree = new BinaryTreeLinkedList<>();

        BinaryTreeNode<String> N1 = new BinaryTreeNode<>("N1");
        BinaryTreeNode<String> N2 = new BinaryTreeNode<>("N2");
        BinaryTreeNode<String> N3 = new BinaryTreeNode<>("N3");
        BinaryTreeNode<String> N4 = new BinaryTreeNode<>("N4");
        BinaryTreeNode<String> N5 = new BinaryTreeNode<>("N5");
        BinaryTreeNode<String> N6 = new BinaryTreeNode<>("N6");
        BinaryTreeNode<String> N7 = new BinaryTreeNode<>("N7");
        BinaryTreeNode<String> N8 = new BinaryTreeNode<>("N8");
        BinaryTreeNode<String> N9 = new BinaryTreeNode<>("N9");


        N1.left = N2;
        N1.right = N3;

        N2.left = N4;
        N2.right = N5;

        N3.left = N6;
        N3.right = N7;

        N4.left = N8;
        N4.right = N9;

        tree.preOrderTraversal(N1);
        System.out.println("==============");
        tree.inOrderTraversal(N1);
        System.out.println("==============");
        tree.postOrderTraversal(N1);
        System.out.println("==============");
        tree.printLevelOrder(N1);
        System.out.println("==============");
        tree.levelOrderTraversal(N1);
        System.out.println("==============");
        System.out.println(tree.searchElementInBT("N9", N1));
    }

    @Test
    public void searching() {

        BinaryTreeLinkedList<String> tree = new BinaryTreeLinkedList<>();

        BinaryTreeNode<String> N1 = new BinaryTreeNode<>("N1");
        BinaryTreeNode<String> N2 = new BinaryTreeNode<>("N2");
        BinaryTreeNode<String> N3 = new BinaryTreeNode<>("N3");
        BinaryTreeNode<String> N4 = new BinaryTreeNode<>("N4");
        BinaryTreeNode<String> N5 = new BinaryTreeNode<>("N5");
        BinaryTreeNode<String> N6 = new BinaryTreeNode<>("N6");
        BinaryTreeNode<String> N7 = new BinaryTreeNode<>("N7");
        BinaryTreeNode<String> N8 = new BinaryTreeNode<>("N8");
        BinaryTreeNode<String> N9 = new BinaryTreeNode<>("N9");


        N1.left = N2;
        N1.right = N3;

        N2.left = N4;
        N2.right = N5;

        N3.left = N6;
        N3.right = N7;

        N4.left = N8;
        N4.right = N9;

        Assertions.assertNotNull(tree.searchElementInBT("N9", N1));
        Assertions.assertNotNull(tree.searchElementInBT("N1", N1));
        Assertions.assertNull(tree.searchElementInBT("err", N1));
    }

    @Test
    public void insert() {

        BinaryTreeLinkedList<String> tree = new BinaryTreeLinkedList<>();
        tree.insertElementInBT("N1");
        tree.insertElementInBT("N2");
        tree.insertElementInBT("N3");
        tree.insertElementInBT("N4");
        tree.insertElementInBT("N5");
        tree.insertElementInBT("N6");
        tree.insertElementInBT("N7");
        tree.insertElementInBT("N8");
        tree.insertElementInBT("N9");

        tree.levelOrderTraversal(tree.root);
    }

}