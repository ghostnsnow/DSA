package arrays.problems;

import java.util.Arrays;

/**
 * Remove Duplicates from Sorted Array - LeetCode 26
 * Given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns the new length.
 * Do not allocate extra space for another array; you must do this by modifying the input array in-place with O(1) extra memory.
 *
 * Example:
 *
 * Input: nums = [1, 1, 2]
 * Output: 2
 */
public class Leetcode26 {

    public static int removeDuplicates(int[] nums) {

        /*int temp;
        int count = 1;

        for (int index = 0, jindex = 1; jindex < nums.length;jindex++) {

            if(nums[index] != nums[jindex]) {

                ++count;
                temp = nums[jindex];
                nums[jindex] = nums[index];
                nums[index] = temp;
            } else {

                index = jindex;
                //++jindex;
            }
        }

        return count;
        */

        if (nums.length == 0) {
            return 0;
        }

        int i = 0;

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }

        System.out.println(Arrays.toString(nums));
        return i + 1;

    }
}
