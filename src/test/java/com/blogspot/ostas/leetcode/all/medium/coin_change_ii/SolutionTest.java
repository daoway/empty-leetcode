package com.blogspot.ostas.leetcode.all.medium.coin_change_ii;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: amount = 5, coins = [1,2,5]
    Output: 4
    Explanation: there are four ways to make up the amount:
    5=5
    5=2+2+1
    5=2+1+1+1
    5=1+1+1+1+1
    Example 2:
    Input: amount = 3, coins = [2]
    Output: 0
    Explanation: the amount of 3 cannot be made up just with coins of 2.
    Example 3:
    Input: amount = 10, coins = [10]
    Output: 1
      Constraints:
    1 <= coins.length <= 300
    1 <= coins[i] <= 5000
    All the values of coins are unique.
    0 <= amount <= 5000
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int amount = 5;
        int[] coins = new int[]{1, 2, 5};
        int expected = 4;
        var result = solution.change(amount, coins);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int amount = 3;
        int[] coins = new int[]{2};
        int expected = 0;
        var result = solution.change(amount, coins);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int amount = 10;
        int[] coins = new int[]{10};
        int expected = 1;
        var result = solution.change(amount, coins);
        assertThat(result).isEqualTo(expected);
    }

}
