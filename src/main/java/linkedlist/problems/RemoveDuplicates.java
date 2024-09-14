package linkedlist.problems;

import linkedlist.base.GhostSinglyLinkedList;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

    public static GhostSinglyLinkedList removeDups(GhostSinglyLinkedList myList) {

        Set<GhostSinglyLinkedList.Node> nodes = new HashSet<>();
        GhostSinglyLinkedList.Node curr = myList.getHead();
        GhostSinglyLinkedList.Node prev = null;

        while (null != curr && null != curr.getNext()) {

            if (nodes.contains(curr)) {

                prev.setNext(curr.getNext());
                curr = curr.getNext();
            } else {

                nodes.add(curr);
                prev = curr;
                curr = curr.getNext();
            }

            if (null != prev && prev.getNext() == null) {

                myList.setTail(prev);
                break;
            }
        }

        if (null != curr && nodes.contains(curr)) {

            prev.setNext(null);
            myList.setTail(prev);
        }

        return myList;
    }
}
