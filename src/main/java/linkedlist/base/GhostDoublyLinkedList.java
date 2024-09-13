package linkedlist.base;

/**
 * Each node in Doubly Linked List contains an extra information i.e. the Previous pointer which points to the previous node. This helps in all sorts of operation e.g. traversal, insert, delete.
 * Else in each scenario to traverse(in case of Singly linked list) we needed to store the previous node while moving ahead in the list as there was no way to move back.
 * The prev pointer of 1st node is null. The next pointer of last node also is null. Remaining all pointers should point to their respective previous or next nodes.
 * Go-ahead & write similar add, delete methods as available in GhostSinglyLinkedList.
 */
public class GhostDoublyLinkedList<T> {

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

    public GhostDoublyLinkedList() {
        head = null;
        tail = null;
    }

}
