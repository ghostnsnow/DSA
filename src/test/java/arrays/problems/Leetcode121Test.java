package arrays.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Leetcode121Test {

    @Test
    void maxProfit() {

        int expected = 5;
        int[] prices = {7, 1, 5, 3, 6, 4};
        int actual = Leetcode121.maxProfit(prices);
        Assertions.assertEquals(expected, actual);

        expected = 1;
        int[] prices2 = {1, 1, 2, 2};
        actual = Leetcode121.maxProfit(prices2);
        Assertions.assertEquals(expected, actual);
    }
}