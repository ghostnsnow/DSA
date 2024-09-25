package tree.binarytree.base;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeArrayTest {

    @Test
    public void inserting() {

        BinaryTreeArray<String> tree = new BinaryTreeArray<>(9);
        tree.insertElementInBT("N1");
        tree.insertElementInBT("N2");
        tree.insertElementInBT("N3");
        tree.insertElementInBT("N4");
        System.out.println(Arrays.toString(tree.getNodes()));
        tree.insertElementInBT("N5");
        tree.insertElementInBT("N6");
        tree.insertElementInBT("N7");
        tree.insertElementInBT("N8");
        System.out.println(Arrays.toString(tree.getNodes()));
        tree.insertElementInBT("N9");
        System.out.println(Arrays.toString(tree.getNodes()));
    }

    @Test
    public void preOrderTraversal() {

        BinaryTreeArray<String> tree = new BinaryTreeArray<>(10);
        tree.insertElementInBT("N1");
        tree.insertElementInBT("N2");
        tree.insertElementInBT("N3");
        tree.insertElementInBT("N4");
        tree.insertElementInBT("N5");
        tree.insertElementInBT("N6");
        tree.insertElementInBT("N7");
        tree.insertElementInBT("N8");
        tree.insertElementInBT("N9");
        tree.insertElementInBT("N10");

        tree.preOrderTraversal(1);//N1 N2 N4 N8 N9 N5 N10 N3 N6 N7
    }

    @Test
    public void inOrderTraversal() {

        BinaryTreeArray<String> tree = new BinaryTreeArray<>(10);
        tree.insertElementInBT("N1");
        tree.insertElementInBT("N2");
        tree.insertElementInBT("N3");
        tree.insertElementInBT("N4");
        tree.insertElementInBT("N5");
        tree.insertElementInBT("N6");
        tree.insertElementInBT("N7");
        tree.insertElementInBT("N8");
        tree.insertElementInBT("N9");
        tree.insertElementInBT("N10");

        tree.inOrderTraversal(1);//N8 N4 N9 N2 N10 N5 N1 N6 N3 N7
    }

    @Test
    public void postOrderTraversal() {

        BinaryTreeArray<String> tree = new BinaryTreeArray<>(10);
        tree.insertElementInBT("N1");
        tree.insertElementInBT("N2");
        tree.insertElementInBT("N3");
        tree.insertElementInBT("N4");
        tree.insertElementInBT("N5");
        tree.insertElementInBT("N6");
        tree.insertElementInBT("N7");
        tree.insertElementInBT("N8");
        tree.insertElementInBT("N9");
        tree.insertElementInBT("N10");

        tree.postOrderTraversal(1);//N8 N9 N4 N10 N5 N2 N6 N7 N3 N1
    }
}