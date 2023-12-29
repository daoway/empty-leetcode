package com.blogspot.ostas.leetcode.all.medium.best_time_to_buy_and_sell_stock_ii;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: prices = [7,1,5,3,6,4]
    Output: 7
    Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
    Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
    Total profit is 4 + 3 = 7.
    Example 2:
    Input: prices = [1,2,3,4,5]
    Output: 4
    Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
    Total profit is 4.
    Example 3:
    Input: prices = [7,6,4,3,1]
    Output: 0
    Explanation: There is no way to make a positive profit, so we never buy the stock to achieve the maximum profit of 0.
      Constraints:
    1 <= prices.length <= 3 * 104
    0 <= prices[i] <= 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
        int expected = 7;
        var result = solution.maxProfit(prices);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] prices = new int[]{1, 2, 3, 4, 5};
        int expected = 4;
        var result = solution.maxProfit(prices);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] prices = new int[]{7, 6, 4, 3, 1};
        int expected = 0;
        var result = solution.maxProfit(prices);
        assertThat(result).isEqualTo(expected);
    }

}
