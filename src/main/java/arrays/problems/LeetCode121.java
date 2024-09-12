package arrays.problems;

/**
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 *
 * Example:
 *
 * Input: prices = [7, 1, 5, 3, 6, 4]
 * Output: 5
 * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 */
public class LeetCode121 {

    public static int maxProfit(int[] prices) {

        int profit = 0;
        int buy = Integer.MAX_VALUE;
        int sell = Integer.MIN_VALUE;

        for (int i = 0; i < prices.length; i++) {

            if (prices[i] < buy)
                buy = prices[i];
            if(prices[i] > sell && prices[i] - buy > profit) {

                sell = prices[i];
                profit = sell - buy;
            }
        }

        return sell - buy;
    }
}
