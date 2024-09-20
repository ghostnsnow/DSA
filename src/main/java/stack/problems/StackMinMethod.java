package stack.problems;

/**
 * How would you design a stack which, in addition to push and pop, has a function min which returns the minimum element?
 * Push, pop and min should all operate in O(1).
 */
public class StackMinMethod {

    Node root;
    Node minNode;

    public StackMinMethod() {
        root = null;
    }

    public int min() {
        return minNode.value;
    }

    public void push(int value) {

        Node node = new Node(value);
        node.setNextNode(null);

        if (null != root) {

            node.setNextNode(root);
            root = node;

            if (node.value < minNode.getValue()) {

                node.setPrevMinNode(minNode);
                minNode = node;
            }
        } else {
            root = node;
            minNode = node;
            node.setPrevMinNode(node);
        }
    }

    public int pop() {

        int val = 0;

        if (null != root) {
            val = root.getValue();

            Node curr = root;
            root = root.nextNode;

            if (minNode == curr) {

                minNode = curr.getPrevMinNode();
            }

            curr = null;
        } else {

            System.out.println("The Stack is empty");
        }

        return val;
    }

}

class Node {
    int value;
    Node nextNode;
    Node prevMinNode;

    public Node(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    public Node getPrevMinNode() {
        return prevMinNode;
    }

    public void setPrevMinNode(Node prevMinNode) {
        this.prevMinNode = prevMinNode;
    }
}