package linkedlist.base;

/**
 * Circular Doubly Linked List is exactly same as Linear Doubly Linked List. Only thing varies is the last node's next pointer points to the first node & first node's previous pointer points to the last node making it bi-direction circular.
 * All the pointers for all the nodes(prev & next) are non-null.
 * Go-ahead & write similar add, delete methods as available in GhostSinglyLinkedList.
 */
public class GhostDoublyLinkedListCircular<T> {

    private Node<T> head;
    private Node<T> tail;

    class Node<T> {

        T value;

        Node<T> next;
        Node<T> prev;

        public Node(T value) {
            this.value = value;
        }
    }

    public GhostDoublyLinkedListCircular() {
        head = null;
        tail = null;
    }

}
