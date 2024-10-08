package arrays.problems;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * Examples
 *
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Output: Because nums[0] + nums[1] == 9, we return [0, 1]
 *
 *
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 *
 *
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 */
public class LeetCode1 {

    public static int[] twoSum(int[] nums, int target) {

        int remainder;
        int[] output = new int[2];
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            remainder = target - nums[i];

            if (map.containsKey(remainder)) {

                output[0] = map.get(remainder);
                output[1] = i;

                break;
            } else {

                map.put(nums[i], i);
            }
        }

        return output;
    }
}
