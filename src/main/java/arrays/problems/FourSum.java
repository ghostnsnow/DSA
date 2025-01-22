package arrays.problems;

import java.util.*;

/**
 * Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:
 * 0 <= a, b, c, d < n
 * a, b, c, and d are distinct.
 * nums[a] + nums[b] + nums[c] + nums[d] == target
 * You may return the answer in any order.
 *
 * Example 1:
 * Input: nums = [1,0,-1,0,-2,2], target = 0
 * Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
 *
 * Example 2:
 * Input: nums = [2,2,2,2,2], target = 8
 * Output: [[2,2,2,2]]
 */
public class FourSum {

    public static Set<List<Integer>> get4Sum(List<Integer> input, Integer target) {

        int newTarget, low, high, n = input.size();
        Set<List<Integer>> output = new HashSet<>();
        Collections.sort(input);

        for (int i = 0; i < n-3; i++) {

            for (int j = i+1; j < n-2; j++) {

                newTarget = target - input.get(i) - input.get(j);
                low = j+1;
                high = n-1;

                while(low < high) {

                    if ((input.get(low) + input.get(high)) > newTarget) {

                        high = high - 1;
                    } else if ((input.get(low) + input.get(high)) < newTarget) {

                        low = low + 1;
                    } else {

                        List<Integer> combo = new ArrayList<>();
                        combo.add(input.get(i));
                        combo.add(input.get(j));
                        combo.add(input.get(low));
                        combo.add(input.get(high));

                        output.add(combo);

                        low = low + 1;
                        high = high - 1;
                    }
                }
            }
        }

        return output;
    }

    public static void testSet() {

        Set<List<Integer>> list = new HashSet<>();
        list.add(List.of(1, 2, 2, 3));
        list.add(List.of(1, 2, 2, 3));
        System.out.println(list);

        list.add(List.of(2, 1, 2, 3));
        System.out.println(list);
    }

    public static void main(String[] args) {

        System.out.println(FourSum.get4Sum(new ArrayList<>(List.of(2, 2, 2, 2, 1, 3)), 8));
    }
}
