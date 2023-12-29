package com.blogspot.ostas.leetcode.all.medium.best_time_to_buy_and_sell_stock_with_cooldown;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: prices = [1,2,3,0,2]
    Output: 3
    Explanation: transactions = [buy, sell, cooldown, buy, sell]
    Example 2:
    Input: prices = [1]
    Output: 0
      Constraints:
    1 <= prices.length <= 5000
    0 <= prices[i] <= 1000
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] prices = new int[]{1, 2, 3, 0, 2};
        int expected = 3;
        var result = solution.maxProfit(prices);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] prices = new int[]{1};
        int expected = 0;
        var result = solution.maxProfit(prices);
        assertThat(result).isEqualTo(expected);
    }

}
