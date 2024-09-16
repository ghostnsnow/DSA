package linkedlist.problems;

/**
 * Construct an in-place algorithm (without the need for extra memory) to reverse a linked list!
 *
 * For example: 1 -> 2 -> 3 -> 4 should be transformed into 4 -> 3 -> 2 -> 1
 */
public class ReverseLinkedList {

    public static void main(String[] args) {

        RevLinkedList list = new RevLinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);

        list.traverse();
        list.reverse();
        list.traverse();
    }


}

class RevLinkedList implements RevList {

    // this is the head node or root node
    private RevNode root;
    private int numOfItems;

    @Override
    public void reverse() {

        // this is where you implement the algorithm !!!
        if(root==null) return;

        RevNode actualNode = root;

        reverseNode(actualNode, actualNode);

        actualNode.setNextNode(null);
    }

    private void reverseNode(RevNode node, RevNode prevNode) {
        if (null != node.getNextNode()) {
            reverseNode(node.getNextNode(), node);
        } else {
            root = node;
        }

        node.setNextNode(prevNode);
    }

    @Override
    public RevNode get(int index) {

        int counter = 0;
        RevNode node = this.root;

        while(node != null) {
            if(index == counter)
                return node;

            counter++;
            node = node.getNextNode();
        }

        return null;
    }

    @Override
    public void insert(int data) {

        if(root==null) {
            // this is the first item in the linked list
            root = new RevNode(data);
        } else {
            // we know that this is not the first item in the linked list
            insertBeginning(data);
        }
    }

    // we just have to update the references O(1)
    private void insertBeginning(int data) {
        RevNode newNode = new RevNode(data);
        newNode.setNextNode(root);
        root = newNode;
    }

    // because we have to start with the root node
    // first we have to find the last node in O(N)
    private void insertEnd(int data, RevNode node) {

        // this is when we keep looking for the last node O(N)
        if(node.getNextNode() != null) {
            insertEnd(data, node.getNextNode());
        } else {
            // we have found the last node
            RevNode newNode = new RevNode(data);
            node.setNextNode(newNode);
        }
    }

    @Override
    public void traverse() {

        if(root==null) return;

        RevNode actualNode = root;

        while(actualNode != null) {
            System.out.println(actualNode);
            actualNode = actualNode.getNextNode();
        }
        System.out.println("=======================");
    }

    @Override
    public int size() {
        return numOfItems;
    }
}

interface RevList {
    public RevNode get(int index);
    public void reverse();
    public void insert(int data);
    public void traverse();
    public int size();
}

class RevNode {

    private int data;
    private RevNode nextNode;

    public RevNode(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public RevNode getNextNode() {
        return nextNode;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setNextNode(RevNode nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return "" + this.data;
    }
}
