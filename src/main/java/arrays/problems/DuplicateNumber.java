package arrays.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Write a function which takes integer array as a parameter and returns a new integer array with unique elements. (remove duplicates)
 *
 * Example
 *
 * removeDuplicates({1, 1, 2, 2, 3, 4, 5})
 * Output : [1, 2, 3, 4, 5]
 */
public class DuplicateNumber {

    /**
     * This solution only if the iputarray is sorted. Else first need to sort the array & then process. Otherwise, complexity will be O(n^2)
     */
    public static int[] removeDuplicates(int[] arr) {

        int[] output = new int[arr.length];
        int counter = 0;

        output[counter++] = arr[0];

        for(int index = 0, jindex = 1; index < arr.length && jindex < arr.length; jindex++) {

            if (arr[index] != arr[jindex]) {

                output[counter++] = arr[jindex];
                index = jindex;
            }
        }

        return  Arrays.copyOf(output, counter);//Awesome method
    }
}
