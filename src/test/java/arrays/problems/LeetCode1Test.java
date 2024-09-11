package arrays.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode1Test {

    @Test
    void twoSumCase1() {

        int[] expected = {0,1};
        int[] input = {2,7,11,15};
        int[] actual = LeetCode1.twoSum(input, 9);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void twoSumCase2() {

        int[] expected = {1,2};
        int[] input = {3,2,4};
        int[] actual = LeetCode1.twoSum(input, 6);

        Assertions.assertArrayEquals(expected, actual);
    }
}