package linkedlist.problems;

import java.util.HashMap;
import java.util.Map;

/**
 * Suppose we have a standard linked list. Construct an in-place (without extra memory) algorithm that is able to find the middle node!
 *
 * Note: you should construct an O(N) linear running time algorithm
 *
 * For example: [1, 2, 3, 4] --> middle node is: 3,   [1, 2, 3, 4, 5] --> middle node is: 3
 *
 * WE ASSUME THAT WE STORE INTEGERS IN THE LINKED LIST - NO NEED TO USE GENERIC IMPLEMENTATION !!!
 */
public class FindMiddleElement {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);

        // 2 solutions : 1 using Hashmap, the other using 2 pointers(A slow pointer & A fast pointer which runs with double speed). So where the fast pointer stops, wherever slow pointer points that is the middle node.
        System.out.println(list.getMiddleNodeAnotherSoln());
    }
}

class LinkedList implements List {

    // this is the head node or root node
    private Node root;
    private int numOfItems;

    @Override
    public Node getMiddleNode() {

        if(root==null) return null;

        Map<Integer, Node> map = new HashMap<>();
        Node actualNode = root;
        int index = 0;

        while(actualNode != null) {
            //System.out.println(actualNode);
            map.put(index, actualNode);
            ++index;
            actualNode = actualNode.getNextNode();
        }

        System.out.println(size());
        int middleIndex = size() / 2;
        if (size() % 2 == 0) {
            middleIndex = middleIndex - 1;
        }
        System.out.println(middleIndex);
        System.out.println(map);

        return map.get(middleIndex);
    }

    public Node getMiddleNodeAnotherSoln() {

        Node slow = this.root;
        Node fast = this.root;

        // O(N/2) = O(N) linear running time
        while(fast.getNextNode() != null && fast.getNextNode().getNextNode() != null) {
            slow = slow.getNextNode();
            fast = fast.getNextNode().getNextNode();

            System.out.println(slow);
            System.out.println(fast);
        }

        return slow;
    }

    @Override
    public void insert(int data) {

        if(root==null) {
            // this is the first item in the linked list
            root = new Node(data);
        } else {
            // we know that this is not the first item in the linked list
            insertBeginning(data);
        }

        numOfItems++;
    }

    // we just have to update the references O(1)
    private void insertBeginning(int data) {
        Node newNode = new Node(data);
        newNode.setNextNode(root);
        root = newNode;
    }

    // because we have to start with the root node
    // first we have to find the last node in O(N)
    private void insertEnd(int data, Node node) {

        // this is when we keep looking for the last node O(N)
        if(node.getNextNode() != null) {
            insertEnd(data, node.getNextNode());
        } else {
            // we have found the last node
            Node newNode = new Node(data);
            node.setNextNode(newNode);
        }
    }

    @Override
    public void traverse() {

        if(root==null) return;

        Node actualNode = root;

        while(actualNode != null) {
            System.out.println(actualNode);
            actualNode = actualNode.getNextNode();
        }
    }

    @Override
    public int size() {
        return numOfItems;
    }
}

interface List {
    public Node getMiddleNode();
    public void insert(int data);
    public void traverse();
    public int size();
}

class Node {

    private int data;
    private Node nextNode;

    public Node(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return "" + this.data;
    }
}