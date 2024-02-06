package com.blogspot.ostas.leetcode.all.medium.coin_change;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: coins = [1,2,5], amount = 11
    Output: 3
    Explanation: 11 = 5 + 5 + 1
    Example 2:
    Input: coins = [2], amount = 3
    Output: -1
    Example 3:
    Input: coins = [1], amount = 0
    Output: 0
      Constraints:
    1 <= coins.length <= 12
    1 <= coins[i] <= 231 - 1
    0 <= amount <= 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] coins = new int[]{1, 2, 5};
        int amount = 11;
        int expected = 3;
        var result = solution.coinChange(coins, amount);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] coins = new int[]{2};
        int amount = 3;
        int expected = -1;
        var result = solution.coinChange(coins, amount);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] coins = new int[]{1};
        int amount = 0;
        int expected = 0;
        var result = solution.coinChange(coins, amount);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_3() {
        var solution = new Solution();
        int[] coins = new int[]{1, 2, 5, 10, 25, 50};
        int amount = 100;
        int expected = 2;
        var result = solution.coinChange(coins, amount);
        assertThat(result).isEqualTo(expected);
    }
}
