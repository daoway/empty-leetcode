package com.blogspot.ostas.leetcode.all.hard.best_time_to_buy_and_sell_stock_iv;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: k = 2, prices = [2,4,1]
    Output: 2
    Explanation: Buy on day 1 (price = 2) and sell on day 2 (price = 4), profit = 4-2 = 2.
    Example 2:
    Input: k = 2, prices = [3,2,6,5,0,3]
    Output: 7
    Explanation: Buy on day 2 (price = 2) and sell on day 3 (price = 6), profit = 6-2 = 4. Then buy on day 5 (price = 0) and sell on day 6 (price = 3), profit = 3-0 = 3.
      Constraints:
    1 <= k <= 100
    1 <= prices.length <= 1000
    0 <= prices[i] <= 1000
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int k = 2;
        int[] prices = new int[]{2, 4, 1};
        int expected = 2;
        var result = solution.maxProfit(k, prices);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int k = 2;
        int[] prices = new int[]{3, 2, 6, 5, 0, 3};
        int expected = 7;
        var result = solution.maxProfit(k, prices);
        assertThat(result).isEqualTo(expected);
    }

}
