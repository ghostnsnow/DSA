package arrays.problems;

import java.util.Arrays;

/**
 * Given an arr[] containing n integers and a positive integer k. The problem is to find the longest subarray’s length with the sum of the elements divisible by the given value k.
 *
 * Examples:
 *
 * Input: arr[] = {2, 7, 6, 1, 4, 5}, k = 3
 * Output: 4
 * Explanation: The subarray is {7, 6, 1, 4} with sum 18, which is divisible by 3.
 *
 * Input: arr[] = {-2, 2, -5, 12, -11, -1, 7}, k = 3
 * Output: 5
 */
public class LongestSubArrayDivisible {

    public static int[] getSubArray(int[] arr, int el) {

        int sum = 0, temp = 0, first = 0, last = arr.length - 1, firstEl = 0, lastEl = 0;

        for (int i = 0; i < arr.length; i++) {

            sum = sum + arr[i];
        }

        while (first < last) {

            temp = sum - firstEl - lastEl;

            if (temp % el == 0) {

                break;
            }

            firstEl = arr[first];
            lastEl = arr[last];

            temp = sum - lastEl;

            if (temp % 3 == 0) {

                --last;
                break;
            }

            temp = sum - firstEl;

            if (temp % 3 == 0) {

                ++first;
                break;
            }

            --last;
            ++first;
        }

        int[] output = Arrays.copyOfRange(arr, first, last + 1);

        return output;
    }

    public static void main(String[] args) {

        //System.out.println(Arrays.toString(getSubArray(new int[]{2, 7, 6, 1, 4}, 3)));
        //System.out.println(Arrays.toString(getSubArray(new int[]{-2, 2, -5, 12, -11, -1, 7}, 3)));
        System.out.println(Arrays.toString(getSubArray(new int[]{4,5,0,-2,-3,1}, 5)));
    }
}
