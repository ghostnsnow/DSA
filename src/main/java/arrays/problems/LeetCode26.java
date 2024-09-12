package arrays.problems;

import java.util.Arrays;

/**
 * Remove Duplicates from Sorted Array - LeetCode 26
 * Given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns the new length.
 * Do not allocate extra space for another array; you must do this by modifying the input array in-place with O(1) extra memory.
 *
 * Example 1:
 *
 * Input: nums = [1,1,2]
 * Output: 2, nums = [1,2,_]
 * Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
 * It does not matter what you leave beyond the returned k (hence they are underscores).
 * Example 2:
 *
 * Input: nums = [0,0,1,1,1,2,2,3,3,4]
 * Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
 * Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
 * It does not matter what you leave beyond the returned k (hence they are underscores).
 */
public class LeetCode26 {

    public static int removeDuplicates(int[] nums) {

        int count = 1;

        for (int i = 0, j = 1; j < nums.length; j++) {

            if (nums[i] != nums[j]) {

                ++count;
                i = i + 1;
                nums[i] = nums[j];
            }
        }

        System.out.println(Arrays.toString(nums));

        return count;

    }
}
