package tree.binarytree.base;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeLinkedList<T> {

    BinaryTreeNode<T> root;

    public BinaryTreeLinkedList() {

        root = null;
    }

    public void preOrderTraversal(BinaryTreeNode<T> node) {

        if (node == null) return;

        node.visit();
        preOrderTraversal(node.getLeft());
        preOrderTraversal(node.getRight());
    }

    public void inOrderTraversal(BinaryTreeNode<T> node) {

        if (node == null) return;

        inOrderTraversal(node.getLeft());
        node.visit();
        inOrderTraversal(node.getRight());
    }

    public void postOrderTraversal(BinaryTreeNode<T> node) {

        if (node == null) return;

        postOrderTraversal(node.getLeft());
        postOrderTraversal(node.getRight());
        node.visit();
    }

    public void levelOrderTraversal(BinaryTreeNode<T> root) {

        Queue<BinaryTreeNode<T>> queue = new LinkedList<BinaryTreeNode<T>>();
        BinaryTreeNode<T> node;

        if (root == null) return;

        queue.offer(root);

        while((node = queue.poll()) != null) {

            node.visit();

            if (null != node.left) queue.offer(node.left);
            if (null != node.right) queue.offer(node.right);
        }
    }

    public BinaryTreeNode<T> searchElementInBT(T valueToSearch, BinaryTreeNode<T> root) {

        if (null == root || null == valueToSearch) return null;

        Queue<BinaryTreeNode<T>> queue = new LinkedList<BinaryTreeNode<T>>();
        BinaryTreeNode<T> temp;
        boolean isFound = false;

        queue.offer(root);

        while((temp = queue.poll()) != null) {

            if(temp.data.equals(valueToSearch)) {

                isFound = true;
                break;
            }

            if (null != temp.left) queue.offer(temp.left);
            if (null != temp.right) queue.offer(temp.right);
        }

        return temp;
    }

    public void insertElementInBT(T valueToInsert) {

        if (null == root) {

            root = new BinaryTreeNode<T>(valueToInsert);
            return;
        } else {

            Queue<BinaryTreeNode<T>> queue = new LinkedList<BinaryTreeNode<T>>();
            BinaryTreeNode<T> temp;

            queue.offer(root);

            while((temp = queue.poll()) != null) {

                if (null == temp.left) {

                    BinaryTreeNode<T> node = new BinaryTreeNode<T>(valueToInsert);
                    temp.left = node;
                    return;
                } else {

                    queue.offer(temp.left);
                }

                if (null == temp.right) {

                    BinaryTreeNode<T> node = new BinaryTreeNode<T>(valueToInsert);
                    temp.right = node;
                    return;
                } else {

                    queue.offer(temp.right);
                }
            }
        }
    }

    public T getDeepestNodeInBT(BinaryTreeNode<T> root) {

        Queue<BinaryTreeNode<T>> queue = new LinkedList<BinaryTreeNode<T>>();
        BinaryTreeNode<T> currNode = null, prevNode = null;
        T deepestNodeVal = null;

        if (root == null) return null;

        queue.offer(root);

        while(!queue.isEmpty()) {

            prevNode = currNode;

            currNode = queue.poll();

            if (currNode.left == null) {

                //if (prevNode == null) {} --> This option would never come as in the delete method I am eliminating this condition

                if (prevNode.right != null) {

                    deepestNodeVal = prevNode.right.data;
                    prevNode.right = null;
                    break;
                } else if (prevNode.left != null) {

                    deepestNodeVal = prevNode.left.data;
                    prevNode.left = null;
                    break;
                }
            } else if (currNode.right == null) {

                deepestNodeVal = currNode.left.data;
                currNode.left = null;
                break;
            } else {

                queue.offer(currNode.left);
                queue.offer(currNode.right);
            }
        }

        return deepestNodeVal;
    }
    public void deleteElementInBT(T valueToDelete) {

        BinaryTreeNode<T> node = searchElementInBT(valueToDelete, root);

        if (null != node) {

            int height = height(root);

            if (height == 1) {

                root = null;
            } else {

                T val = getDeepestNodeInBT(root);

                node.setData(val);
            }
        } else {

            System.out.println("Element not found");
        }
    }

    public void deleteBT() {

        root = null;
    }

    /**
     * Inefficient way to do Level order traversal is the following brute force
     */

    public void printLevelOrder(BinaryTreeNode root) {

        int h = height(root);
        int i;
        for (i = 1; i <= h; i++)
            printCurrentLevel(root, i);
    }

    // Compute the "height" of a tree
    static int height(BinaryTreeNode root) {
        if (root == null)
            return 0;
        else {
            int lheight = height(root.left);
            int rheight = height(root.right);
            if (lheight > rheight)
                return (lheight + 1);
            else
                return (rheight + 1);
        }
    }

    // Print nodes at the current level
    static void printCurrentLevel(BinaryTreeNode root, int level) {
        if (root == null)
            return;
        if (level == 1)
            System.out.print(root.data + " ");
        else if (level > 1) {
            printCurrentLevel(root.left, level - 1);
            printCurrentLevel(root.right, level - 1);
        }
    }

}

class BinaryTreeNode<T> {

    T data;
    BinaryTreeNode<T> left;
    BinaryTreeNode<T> right;

    public BinaryTreeNode(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public BinaryTreeNode<T> getLeft() {
        return left;
    }

    public void setLeft(BinaryTreeNode<T> left) {
        this.left = left;
    }

    public BinaryTreeNode<T> getRight() {
        return right;
    }

    public void setRight(BinaryTreeNode<T> right) {
        this.right = right;
    }

    public void visit() {
        System.out.print(data + " ");
    }
}