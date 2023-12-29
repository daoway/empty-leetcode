package com.blogspot.ostas.leetcode.all.easy.buy_two_chocolates;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: prices = [1,2,2], money = 3
    Output: 0
    Explanation: Purchase the chocolates priced at 1 and 2 units respectively. You will have 3 - 3 = 0 units of money afterwards. Thus, we return 0.
    Example 2:
    Input: prices = [3,2,3], money = 3
    Output: 3
    Explanation: You cannot buy 2 chocolates without going in debt, so we return 3.
      Constraints:
    2 <= prices.length <= 50
    1 <= prices[i] <= 100
    1 <= money <= 100
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] prices = new int[]{1, 2, 2};
        int money = 3;
        int expected = 0;
        var result = solution.buyChoco(prices, money);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] prices = new int[]{3, 2, 3};
        int money = 3;
        int expected = 3;
        var result = solution.buyChoco(prices, money);
        assertThat(result).isEqualTo(expected);
    }

}
