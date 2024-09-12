package arrays.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LeetCode26Test {

    @Test
    void removeDuplicates() {

        int[] input = {1, 1, 2};
        int expected = 2;

        Assertions.assertEquals(expected, LeetCode26.removeDuplicates(input));

        int[] input2 = {1, 1, 2, 2, 3, 3, 3};
        expected = 3;

        Assertions.assertEquals(expected, LeetCode26.removeDuplicates(input2));

        int[] input3 = {1, 1, 2, 2, 3, 3, 3, 4, 5, 8, 8};
        expected = 6;

        Assertions.assertEquals(expected, LeetCode26.removeDuplicates(input3));

        int[] input4 = {0,0,1,1,1,2,2,3,3,4};
        expected = 5;

        Assertions.assertEquals(expected, LeetCode26.removeDuplicates(input4));
    }
}