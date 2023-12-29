package com.blogspot.ostas.leetcode.all.medium.best_time_to_buy_and_sell_stock_with_transaction_fee;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: prices = [1,3,2,8,4,9], fee = 2
    Output: 8
    Explanation: The maximum profit can be achieved by:
    - Buying at prices[0] = 1
    - Selling at prices[3] = 8
    - Buying at prices[4] = 4
    - Selling at prices[5] = 9
    The total profit is ((8 - 1) - 2) + ((9 - 4) - 2) = 8.
    Example 2:
    Input: prices = [1,3,7,5,10,3], fee = 3
    Output: 6
      Constraints:
    1 <= prices.length <= 5 * 104
    1 <= prices[i] < 5 * 104
    0 <= fee < 5 * 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] prices = new int[]{1, 3, 2, 8, 4, 9};
        int fee = 2;
        int expected = 8;
        var result = solution.maxProfit(prices, fee);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] prices = new int[]{1, 3, 7, 5, 10, 3};
        int fee = 3;
        int expected = 6;
        var result = solution.maxProfit(prices, fee);
        assertThat(result).isEqualTo(expected);
    }

}
