package arrays.problems;

import java.util.Arrays;
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
 */
public class LeetCode1 {

    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        int remainder;
        int[] output = new int[2];

        for (int i = 0; i < nums.length; i++) {

            remainder = target - nums[i];
            map.put(remainder, i);
        }

        System.out.println(map);

        for (int i = 0; i < nums.length; i++) {

            System.out.println("====>" + i);
            if (map.containsKey(nums[i])) {

                System.out.println("true");
                output[0] = i;
                output[1] = map.get(nums[i]);
                break;
            }
        }

        System.out.println(Arrays.toString(output));
        return output;
    }
}
