package com.blogspot.ostas.leetcode.all.hard.best_time_to_buy_and_sell_stock_iii;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: prices = [3,3,5,0,0,3,1,4]
    Output: 6
    Explanation: Buy on day 4 (price = 0) and sell on day 6 (price = 3), profit = 3-0 = 3.
    Then buy on day 7 (price = 1) and sell on day 8 (price = 4), profit = 4-1 = 3.
    Example 2:
    Input: prices = [1,2,3,4,5]
    Output: 4
    Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
    Note that you cannot buy on day 1, buy on day 2 and sell them later, as you are engaging multiple transactions at the same time. You must sell before buying again.
    Example 3:
    Input: prices = [7,6,4,3,1]
    Output: 0
    Explanation: In this case, no transaction is done, i.e. max profit = 0.
      Constraints:
    1 <= prices.length <= 105
    0 <= prices[i] <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] prices = new int[]{3, 3, 5, 0, 0, 3, 1, 4};
        int expected = 6;
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
