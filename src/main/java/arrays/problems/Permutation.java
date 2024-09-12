package arrays.problems;

import java.util.HashMap;
import java.util.Map;

/**
 * You are given two integer arrays. Write a program to check if they are permutation of each other.
 *
 * Example
 *
 * int[] array1 = {1,2,3,4,5};
 * int[] array2 = {5,1,2,3,4};
 * permutation(array1, array2) = true
 */
public class Permutation { //A better solution in the 2nd method

    public static boolean permutation(int[] array1, int[] array2){

        Map<Integer, Integer> map = new HashMap<>();
        boolean isPerm = true;

        for (int val : array1) {

            if (map.containsKey(val)) {

                map.put(val, map.get(val) + 1);
            } else {

                map.put(val, 1);
            }
        }

        System.out.println(map);

        for (int val : array2) {

            if (map.containsKey(val)) {

                if (map.get(val) == 1) {

                    map.remove(val);
                } else {

                    map.put(val, (map.get(val) - 1));
                }
            } else {

                return false;
            }
        }

        System.out.println(map);

        if (map.size() > 0) isPerm = false;

        return isPerm;
    }

    /**
     * Better solution with single loop
     */
    public static boolean permutationwithaddmultiply(int[] array1, int[] array2){

        if (array1.length != array2.length)
            return false;

        int sum1 = 0, sum2 = 0, multiply1 = 1, multiply2 = 1;

        for (int i = 0; i < array1.length; i++) {

            sum1 = sum1 + array1[i];
            multiply1 = multiply1 * array1[i];

            sum2 = sum2 + array2[i];
            multiply2 = multiply2 * array2[i];
        }

        if (sum1 == sum2 && multiply1 == multiply2)
            return true;
        else
            return false;
    }
}
