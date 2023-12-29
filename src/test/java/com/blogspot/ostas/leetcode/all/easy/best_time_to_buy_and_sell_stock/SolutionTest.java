package com.blogspot.ostas.leetcode.all.easy.best_time_to_buy_and_sell_stock;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: prices = [7,1,5,3,6,4]
    Output: 5
    Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
    Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
    Example 2:
    Input: prices = [7,6,4,3,1]
    Output: 0
    Explanation: In this case, no transactions are done and the max profit = 0.
      Constraints:
    1 <= prices.length <= 105
    0 <= prices[i] <= 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
        int expected = 5;
        var result = solution.maxProfit(prices);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] prices = new int[]{7, 6, 4, 3, 1};
        int expected = 0;
        var result = solution.maxProfit(prices);
        assertThat(result).isEqualTo(expected);
    }

}
