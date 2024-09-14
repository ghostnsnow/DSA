package linkedlist.base;

import java.util.Iterator;
import java.util.Objects;

public class GhostSinglyLinkedList<T>{

    private Node<T> head;
    private Node<T> tail;

    //@Override
    public Iterator<T> iterator() {//Implementing this only to use Assertions.assertIterableEquals. Don't use this, or override this.
        return null;
    }

    public class Node<T> {

        T value;
        Node<T> next;

        public Node(T value) {
            this.value = value;
        }

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node<?> node = (Node<?>) o;
            return Objects.equals(value, node.value);
        }

        @Override
        public int hashCode() {
            return Objects.hash(value);
        }
    }

    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }

    public Node<T> getTail() {
        return tail;
    }

    public void setTail(Node<T> tail) {
        this.tail = tail;
    }

    public GhostSinglyLinkedList() {
        head = null;
        tail = null;
    }

    public void addAtEnd(T value) {

        if (null != head) {

            Node<T> last = head;

            while (last.next != null) {

                last = last.next;
            }

            Node<T> node = new Node<>(value);

            node.next = null;
            last.next = node;
            tail = node;
        } else {

            Node<T> node = new Node<>(value);
            node.next = null;

            this.head = node;
            this.tail = node;
        }
    }

    public void addAtBeginning(T value) {

        if (null != head) {

            Node<T> node = new Node<>(value);

            node.next = head;
            head = node;
        } else {

            Node<T> node = new Node<>(value);
            node.next = null;

            this.head = node;
            this.tail = node;
        }
    }

    public boolean addInMiddle(T value, T after) {

        if (null != head) {

            Node<T> node = null;
            Node<T> current = head;

            do {

                if (current.value.equals(after)) {

                    node = new Node<>(value);
                    node.next = current.next;
                    current.next = node;
                    break;
                }

                current = current.next;
            } while (current != null || current.next != null);

            if (node == null) {
                return false;
            } else {

                if (node.next == null)
                    tail = node;

                return true;
            }
        } else {

            System.out.println("The list is empty. no insert");
            return false;
        }
    }

    public T deleteFromBeginning() {

        if (null != head) {

            Node<T> delete = head;

            if (head.next == null) {

                head = null;
                tail = null;
                return delete.value;
            } else {

                head = head.next;
                delete.next = null;
                return delete.value;
            }
        } else {

            System.out.println("List is empty");
            return null;
        }
    }

    public T deleteFromEnd() {

        if (null != head) {

            Node<T> delete = null;
            Node<T> curr = null;
            Node<T> prev = null;

            if (head.next == null) {

                delete = head;
                head = null;
                tail = null;
                return delete.value;
            } else {

                curr = head;

                while (curr.next != null) {

                    prev = curr;
                    curr = curr.next;
                }

                delete = curr;

                prev.next = null;
                tail = prev;

                return delete.value;
            }
        } else {

            System.out.println("List is empty");
            return null;
        }
    }

    public boolean deleteElement(T value) {

        Node<T> delete = null;
        Node<T> curr = null;
        Node<T> prev = null;

        if (null != head) {

            if (head.next == null) {

                head = null;
                tail = null;

                return true;
            } else {

                curr = head;
                prev = head;

                do {

                    if (curr.value == value) {

                        if (prev.equals(head)) {

                            head.next = curr.next;
                        } else {

                            prev.next = curr.next;

                            if (curr.equals(tail)) {
                                tail = prev;
                            }
                        }

                        curr = null;
                        return true;
                    } else {

                        prev =  curr;
                        curr = curr.next;
                    }
                } while (curr.next != null);

                return false;
            }
        } else {

            System.out.println("List is empty");
            return false;
        }
    }

    public void print() {

        Node<T> last = head;

        if (last != null) {

            System.out.print("Head => ");
            while (last.next != null) {

                System.out.print(last.value + " => ");
                last = last.next;
            }

            System.out.println(last.value + " <= Tail");
        } else {

            System.out.println("The linkedlist is empty");
        }
    }


    public static void main(String[] args) {

        GhostSinglyLinkedList<Integer> myList = new GhostSinglyLinkedList<>();

        myList.addAtEnd(50);
        myList.addAtEnd(40);
        myList.addAtEnd(80);
        myList.addAtEnd(60);
        myList.addAtEnd(90);

        myList.print();

        myList.addAtBeginning(50);
        myList.addAtBeginning(40);
        myList.addAtBeginning(80);
        myList.addAtBeginning(60);
        myList.addAtBeginning(90);

        myList.print();

        GhostSinglyLinkedList<String> myList2 = new GhostSinglyLinkedList<>();

        myList2.addAtEnd("ABC");
        myList2.addAtEnd("DEF");
        myList2.addAtEnd("GHI");
        myList2.addAtEnd("JKL");
        myList2.addAtEnd("MNO");

        myList2.print();

        GhostSinglyLinkedList<String> myList3 = new GhostSinglyLinkedList<>();
        myList3.print();

        GhostSinglyLinkedList<Integer> myList4 = new GhostSinglyLinkedList<>();

        myList4.addAtEnd(50);
        myList4.addAtEnd(40);
        myList4.addAtEnd(80);

        myList4.print();
        myList4.addInMiddle(5, 50);
        myList4.addInMiddle(8, 80);
        myList4.print();
    }
}
