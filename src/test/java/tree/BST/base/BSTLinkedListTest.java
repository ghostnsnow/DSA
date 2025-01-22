package tree.BST.base;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class BSTLinkedListTest {

    @Test
    public void inserting() {

        BSTLinkedList tree = new BSTLinkedList();
        tree.preOrderTraversal(tree.root);
        tree.insertElementInBT(70, tree.root);
        tree.insertElementInBT(50, tree.root);
        tree.insertElementInBT(90, tree.root);
        tree.insertElementInBT(30, tree.root);
        tree.insertElementInBT(60, tree.root);
        tree.insertElementInBT(80, tree.root);
        tree.insertElementInBT(100, tree.root);
        tree.insertElementInBT(20, tree.root);
        tree.insertElementInBT(40, tree.root);
        tree.preOrderTraversal(tree.root);
    }

    @Test
    public void preorder() {

        BSTLinkedList tree = new BSTLinkedList();
        tree.preOrderTraversal(tree.root);
        tree.insertElementInBT(70, tree.root);
        tree.insertElementInBT(50, tree.root);
        tree.insertElementInBT(90, tree.root);
        tree.insertElementInBT(30, tree.root);
        tree.insertElementInBT(60, tree.root);
        tree.insertElementInBT(80, tree.root);
        tree.insertElementInBT(100, tree.root);
        tree.insertElementInBT(20, tree.root);
        tree.insertElementInBT(40, tree.root);
        tree.preOrderTraversal(tree.root);//70 50 30 20 40 60 90 80 100
    }

    @Test
    public void inorder() {

        BSTLinkedList tree = new BSTLinkedList();
        tree.insertElementInBT(70, tree.root);
        tree.insertElementInBT(50, tree.root);
        tree.insertElementInBT(90, tree.root);
        tree.insertElementInBT(30, tree.root);
        tree.insertElementInBT(60, tree.root);
        tree.insertElementInBT(80, tree.root);
        tree.insertElementInBT(100, tree.root);
        tree.insertElementInBT(20, tree.root);
        tree.insertElementInBT(40, tree.root);
        tree.inOrderTraversal(tree.root);//20 30 40 50 60 70 80 90 100
    }

    @Test
    public void postorder() {

        BSTLinkedList tree = new BSTLinkedList();
        tree.insertElementInBT(70, tree.root);
        tree.insertElementInBT(50, tree.root);
        tree.insertElementInBT(90, tree.root);
        tree.insertElementInBT(30, tree.root);
        tree.insertElementInBT(60, tree.root);
        tree.insertElementInBT(80, tree.root);
        tree.insertElementInBT(100, tree.root);
        tree.insertElementInBT(20, tree.root);
        tree.insertElementInBT(40, tree.root);
        tree.postOrderTraversal(tree.root);//20 40 30 60 50 80 100 90 70
    }

    @Test
    public void levelorder() {

        BSTLinkedList tree = new BSTLinkedList();
        tree.insertElementInBT(70, tree.root);
        tree.insertElementInBT(50, tree.root);
        tree.insertElementInBT(90, tree.root);
        tree.insertElementInBT(30, tree.root);
        tree.insertElementInBT(60, tree.root);
        tree.insertElementInBT(80, tree.root);
        tree.insertElementInBT(100, tree.root);
        tree.insertElementInBT(20, tree.root);
        tree.insertElementInBT(40, tree.root);
        tree.levelOrderTraversal(tree.root);//70 50 90 30 60 80 100 20 40
    }

    @Test
    public void search() {

        BSTLinkedList tree = new BSTLinkedList();
        tree.insertElementInBT(70, tree.root);
        tree.insertElementInBT(50, tree.root);
        tree.insertElementInBT(90, tree.root);
        tree.insertElementInBT(30, tree.root);
        tree.insertElementInBT(60, tree.root);
        tree.insertElementInBT(80, tree.root);
        tree.insertElementInBT(100, tree.root);
        tree.insertElementInBT(20, tree.root);
        tree.insertElementInBT(40, tree.root);

        Assertions.assertEquals(70, tree.searchElementInBT(70, tree.root).data);
        Assertions.assertEquals(50, tree.searchElementInBT(50, tree.root).data);
        Assertions.assertEquals(90, tree.searchElementInBT(90, tree.root).data);
        Assertions.assertEquals(40, tree.searchElementInBT(40, tree.root).data);
        Assertions.assertNull(tree.searchElementInBT(10, tree.root));
        Assertions.assertNull(tree.searchElementInBT(25, tree.root));
        Assertions.assertNull(tree.searchElementInBT(35, tree.root));
        Assertions.assertNull(tree.searchElementInBT(45, tree.root));
        Assertions.assertNull(tree.searchElementInBT(55, tree.root));
        Assertions.assertNull(tree.searchElementInBT(65, tree.root));
        Assertions.assertEquals(100, tree.searchElementInBT(100, tree.root).data);
        Assertions.assertNull(tree.searchElementInBT(85, tree.root));
        Assertions.assertNull(tree.searchElementInBT(105, tree.root));
    }

    @Test
    public void searchElementAndParentInBT() {

        BSTLinkedList tree = new BSTLinkedList();
        tree.insertElementInBT(70, tree.root);
        tree.insertElementInBT(50, tree.root);
        tree.insertElementInBT(90, tree.root);
        tree.insertElementInBT(30, tree.root);
        tree.insertElementInBT(60, tree.root);
        tree.insertElementInBT(80, tree.root);
        tree.insertElementInBT(100, tree.root);
        tree.insertElementInBT(20, tree.root);
        tree.insertElementInBT(40, tree.root);

        Map<String, BSTNode> map = tree.searchElementAndParentInBT(70, tree.root, tree.root);
        Assertions.assertEquals(70, map.get("P").data);
        Assertions.assertEquals(70, map.get("C").data);

        map = tree.searchElementAndParentInBT(50, tree.root, tree.root);
        Assertions.assertEquals(70, map.get("P").data);
        Assertions.assertEquals(50, map.get("C").data);

        map = tree.searchElementAndParentInBT(90, tree.root, tree.root);
        Assertions.assertEquals(70, map.get("P").data);
        Assertions.assertEquals(90, map.get("C").data);

        map = tree.searchElementAndParentInBT(30, tree.root, tree.root);
        Assertions.assertEquals(50, map.get("P").data);
        Assertions.assertEquals(30, map.get("C").data);

        map = tree.searchElementAndParentInBT(60, tree.root, tree.root);
        Assertions.assertEquals(50, map.get("P").data);
        Assertions.assertEquals(60, map.get("C").data);

        map = tree.searchElementAndParentInBT(80, tree.root, tree.root);
        Assertions.assertEquals(90, map.get("P").data);
        Assertions.assertEquals(80, map.get("C").data);

        map = tree.searchElementAndParentInBT(100, tree.root, tree.root);
        Assertions.assertEquals(90, map.get("P").data);
        Assertions.assertEquals(100, map.get("C").data);

        map = tree.searchElementAndParentInBT(20, tree.root, tree.root);
        Assertions.assertEquals(30, map.get("P").data);
        Assertions.assertEquals(20, map.get("C").data);

        map = tree.searchElementAndParentInBT(40, tree.root, tree.root);
        Assertions.assertEquals(30, map.get("P").data);
        Assertions.assertEquals(40, map.get("C").data);

        map = tree.searchElementAndParentInBT(500, tree.root, tree.root);
        Assertions.assertNull(map);
    }

    @Test
    public void delete() {

        BSTLinkedList tree = new BSTLinkedList();
        tree.insertElementInBT(70, tree.root);
        tree.insertElementInBT(50, tree.root);
        tree.insertElementInBT(90, tree.root);
        tree.insertElementInBT(30, tree.root);
        tree.insertElementInBT(60, tree.root);
        tree.insertElementInBT(80, tree.root);
        tree.insertElementInBT(100, tree.root);
        tree.insertElementInBT(20, tree.root);
        tree.insertElementInBT(40, tree.root);

        tree.levelOrderTraversal(tree.root);

        System.out.println("==========");
        tree.deleteElementInBT(20);
        tree.levelOrderTraversal(tree.root);
    }
}