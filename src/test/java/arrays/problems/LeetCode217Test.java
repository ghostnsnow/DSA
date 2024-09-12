package arrays.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode217Test {

    @Test
    void isUnique() {

        int[] input = {1,2,3,4,5,6};
        Assertions.assertTrue(LeetCode217.isUnique(input));

        int[] input2 = {1,2,3,1};
        Assertions.assertFalse(LeetCode217.isUnique(input2));

        int[] input3 = {1,2,3,4};
        Assertions.assertTrue(LeetCode217.isUnique(input3));

        int[] input4 = {1,1,1,3,3,4,3,2,4,2};
        Assertions.assertFalse(LeetCode217.isUnique(input4));
    }
}