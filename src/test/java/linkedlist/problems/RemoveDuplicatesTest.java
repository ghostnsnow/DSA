package linkedlist.problems;

import linkedlist.base.GhostSinglyLinkedList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesTest {

    @Test
    void removeDupsBaseCase() {

        GhostSinglyLinkedList<Integer> inputList = new GhostSinglyLinkedList<>();

        inputList.addAtEnd(1);
        inputList.addAtEnd(2);
        inputList.addAtEnd(1);
        inputList.addAtEnd(3);

        GhostSinglyLinkedList<Integer> expectedList = new GhostSinglyLinkedList<>();

        expectedList.addAtEnd(1);
        expectedList.addAtEnd(2);
        expectedList.addAtEnd(3);

        System.out.print("Input : ");
        inputList.print();
        System.out.print("Expected : ");
        expectedList.print();

        RemoveDuplicates.removeDups(inputList);
        System.out.print("Input after duplicates removed: ");
        inputList.print();
    }

    @Test
    void removeDupsSingleElement() {

        GhostSinglyLinkedList<Integer> inputList = new GhostSinglyLinkedList<>();
        inputList.addAtEnd(1);

        GhostSinglyLinkedList<Integer> expectedList = new GhostSinglyLinkedList<>();
        expectedList.addAtEnd(1);

        System.out.print("Input : ");
        inputList.print();
        System.out.print("Expected : ");
        expectedList.print();

        RemoveDuplicates.removeDups(inputList);
        System.out.print("Input after duplicates removed: ");
        inputList.print();
    }

    @Test
    void removeDupsTwoDifferentElement() {

        GhostSinglyLinkedList<Integer> inputList = new GhostSinglyLinkedList<>();

        inputList.addAtEnd(1);
        inputList.addAtEnd(2);

        GhostSinglyLinkedList<Integer> expectedList = new GhostSinglyLinkedList<>();

        expectedList.addAtEnd(1);
        expectedList.addAtEnd(2);

        System.out.print("Input : ");
        inputList.print();
        System.out.print("Expected : ");
        expectedList.print();

        RemoveDuplicates.removeDups(inputList);
        System.out.print("Input after duplicates removed: ");
        inputList.print();
    }

    @Test
    void removeDupsTwoSameElement() {

        GhostSinglyLinkedList<Integer> inputList = new GhostSinglyLinkedList<>();

        inputList.addAtEnd(1);
        inputList.addAtEnd(1);

        GhostSinglyLinkedList<Integer> expectedList = new GhostSinglyLinkedList<>();

        expectedList.addAtEnd(1);

        System.out.print("Input : ");
        inputList.print();
        System.out.print("Expected : ");
        expectedList.print();

        RemoveDuplicates.removeDups(inputList);
        System.out.print("Input after duplicates removed: ");
        inputList.print();

        //Assertions.assertIterableEquals(expectedList, inputList);
    }
}