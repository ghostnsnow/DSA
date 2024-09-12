package arrays.problems;

import java.util.Arrays;

/**
 * Write a program to to check if an array contains a number in Java.
 *
 * int[] intArray = {1,2,3,4,5,6};
 * searchInArray(intArray, 6); // 5
 */
public class FindNumber {

    public static int searchInArray(int[] intArray, int valueToSearch) {

        //Assuming the array is sorted
        int from = 0, to = intArray.length;

        int mid = (to + from) / 2;

        while (intArray[mid] != valueToSearch) {

            if (intArray[mid] > valueToSearch) {

                to = mid;
            } else {

                from = mid;
            }

            mid = (to + from) / 2;
        }

        return mid;
    }
}
