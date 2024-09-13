package linkedlist.base;

/**
 * Circular Singly Linked List is exactly same as Linear Singly Linked List. Only thing varies is the last node's next pointer points to the first node making it circular.So no pointer is null for any node.
 * Go-ahead & write similar add, delete methods as available in GhostSinglyLinkedList.
 */
public class GhostSinglyLinkedListCircular<T> {

    private Node<T> head;
    private Node<T> tail;

    class Node<T> {

        T value;
        Node<T> next;

        public Node(T value) {
            this.value = value;
        }
    }

    public GhostSinglyLinkedListCircular() {
        head = null;
        tail = null;
    }

}
