package tree.BST.base;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class BSTLinkedList {

    BSTNode root;

    public BSTLinkedList() {

        root = null;
    }

    public void insertElementInBT(int valueToInsert, BSTNode node) {

        if (null == root) {

            root = new BSTNode(valueToInsert);
        } else {

            if (valueToInsert <= node.data) {

                if (node.left != null) {

                    insertElementInBT(valueToInsert, node.left);
                } else {

                    BSTNode temp = new BSTNode(valueToInsert);
                    node.left = temp;
                }
            } else {

                if (node.right != null) {

                    insertElementInBT(valueToInsert, node.right);
                } else {

                    BSTNode temp = new BSTNode(valueToInsert);
                    node.right = temp;
                }
            }
        }
    }

    public void preOrderTraversal(BSTNode node) {

        if (null == node) return;

        node.visit();
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }

    public void inOrderTraversal(BSTNode node) {

        if (null == node) return;

        inOrderTraversal(node.left);
        node.visit();
        inOrderTraversal(node.right);
    }

    public void postOrderTraversal(BSTNode node) {

        if (null == node) return;

        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        node.visit();
    }

    public void levelOrderTraversal(BSTNode node) {

        if (null == node) return;
        Queue<BSTNode> queue = new LinkedList<>();
        queue.offer(node);

        while (!queue.isEmpty()) {

            BSTNode temp = queue.poll();

            temp.visit();

            if (null != temp.left) queue.offer(temp.left);
            if (null != temp.right) queue.offer(temp.right);
        }
    }

    public BSTNode searchElementInBT(int value, BSTNode node) {

        if (node == null) return null;

        if (value == node.data) {
            return node;
        } else if (value < node.data) {
            return searchElementInBT(value, node.left);
        } else {
            return searchElementInBT(value, node.right);
        }
    }

    //This method was created assuming we need to assign a grandchild as a LEFT or RIGHT to a grandparent if the parent is deleted.
    //However, that is not needed as in case a parent needs to be deleted, whichever the successor node is that value can be copied to the parent & the successor node then deleted effectively creating same scenario of assigning grandchild to grandparent's LEFT or RIGHT
    @Deprecated
    public Map<String, BSTNode> searchElementAndParentInBT(int value, BSTNode currNode, BSTNode prevNode) {

        if (currNode == null) return null;

        Map<String, BSTNode> map = new HashMap<>();

        if (value == currNode.data) {
            map.put("P", prevNode);
            map.put("C", currNode);
            return map;
        } else if (value < currNode.data) {
            map = searchElementAndParentInBT(value, currNode.left, currNode);
            return map;
        } else {
            map = searchElementAndParentInBT(value, currNode.right, currNode);
            return map;
        }
    }

    public BSTNode getSuccessorOfNode(BSTNode node) {

        BSTNode successorNode, temp;

        Queue<BSTNode> queue = new LinkedList<>();
        queue.offer(node.right);
        successorNode = node.right;

        while (!queue.isEmpty()) {

            temp = queue.poll();

            if (temp.data < successorNode.data) {

                successorNode = temp;
            }

            if (null != temp.left) queue.offer(temp.left);
            if (null != temp.right) queue.offer(temp.right);
        }

        return successorNode;
    }

    public void deleteElementInBT(int value) {

        BSTNode node = searchElementInBT(value, root);
        BSTNode childNode;

        if (null == node) {        //Element Not Found

            System.out.println("Element not found");
            return;
        } else if (null == node.left && null == node.right) {        //Element having no child

            node = null;
        } else if ((null != node.left && null == node.right) || (null == node.left && null != node.right)) {        //Element having 1 child

            childNode = node.left == null ? node.right : node.left;
            node.data = childNode.data;
            childNode = null;
        } else if (null != node.left && null != node.right) {        //Element having 2 child

            childNode = getSuccessorOfNode(node);
            node.data = childNode.data;
            childNode = null;
        }
    }
}

class BSTNode {

    int data;
    BSTNode left;
    BSTNode right;

    public BSTNode(int data) {
        this.data = data;
    }

    public void visit() {
        System.out.println("Traversed Node : " + data);
    }
}