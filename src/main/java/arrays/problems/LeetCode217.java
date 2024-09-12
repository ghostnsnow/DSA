package arrays.problems;

import java.util.HashMap;
import java.util.Map;

/**
 * Write a program to check if an array is unique or not.
 *
 * Example 1:
 * int[] intArray = {1,2,3,4,5,6};
 * isUnique(intArray) // true
 *
 * Example 2:
 * Input: nums = [1,2,3,1]
 * Output: false
 * Explanation:
 * The element 1 occurs at the indices 0 and 3.
 *
 * Example 3:
 * Input: nums = [1,2,3,4]
 * Output: true
 * Explanation:
 * All elements are distinct.
 *
 * Example 4:
 * Input: nums = [1,1,1,3,3,4,3,2,4,2]
 * Output: false
 */
public class LeetCode217 {

    /****
     * Other than this solution I personally can think of another solution where first the array needs to be sorted. Then every element is compared with the next element. If match found then non-unique.
     * The following solution can also be done using Hashset by dumping all the elements into the Set. Then comparing the size of both the bags. If equal size then unique.
     * Or using Hashset similar to the below contains(which is technically the same solution as HashSet internally is HashMap only)
     */
    public static boolean isUnique(int[] intArray) {

        boolean isUnique = true;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < intArray.length; i++) {

            if (!map.containsKey(intArray[i])) {

                map.put(intArray[i], i);
            } else {

                isUnique = false;
                break;
            }
        }

        return isUnique;
    }
}
