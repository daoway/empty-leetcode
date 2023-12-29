package com.blogspot.ostas.leetcode.all.medium.maximum_ice_cream_bars;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: costs = [1,3,2,4,1], coins = 7
    Output: 4
    Explanation: The boy can buy ice cream bars at indices 0,1,2,4 for a total price of 1 + 3 + 2 + 1 = 7.
    Example 2:
    Input: costs = [10,6,8,7,7,8], coins = 5
    Output: 0
    Explanation: The boy cannot afford any of the ice cream bars.
    Example 3:
    Input: costs = [1,6,3,1,2,5], coins = 20
    Output: 6
    Explanation: The boy can buy all the ice cream bars for a total price of 1 + 6 + 3 + 1 + 2 + 5 = 18.
      Constraints:
    costs.length == n
    1 <= n <= 105
    1 <= costs[i] <= 105
    1 <= coins <= 108
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] costs = new int[]{1, 3, 2, 4, 1};
        int coins = 7;
        int expected = 4;
        var result = solution.maxIceCream(costs, coins);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] costs = new int[]{10, 6, 8, 7, 7, 8};
        int coins = 5;
        int expected = 0;
        var result = solution.maxIceCream(costs, coins);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] costs = new int[]{1, 6, 3, 1, 2, 5};
        int coins = 20;
        int expected = 6;
        var result = solution.maxIceCream(costs, coins);
        assertThat(result).isEqualTo(expected);
    }

}
