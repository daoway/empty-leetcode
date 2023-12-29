package com.blogspot.ostas.leetcode.all.medium.sell_diminishing_valued_colored_balls;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: inventory = [2,5], orders = 4
    Output: 14
    Explanation: Sell the 1st color 1 time (2) and the 2nd color 3 times (5 + 4 + 3).
    The maximum total value is 2 + 5 + 4 + 3 = 14.
    Example 2:
    Input: inventory = [3,5], orders = 6
    Output: 19
    Explanation: Sell the 1st color 2 times (3 + 2) and the 2nd color 4 times (5 + 4 + 3 + 2).
    The maximum total value is 3 + 2 + 5 + 4 + 3 + 2 = 19.
      Constraints:
    1 <= inventory.length <= 105
    1 <= inventory[i] <= 109
    1 <= orders <= min(sum(inventory[i]), 109)
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] inventory = new int[]{2, 5};
        int orders = 4;
        int expected = 14;
        var result = solution.maxProfit(inventory, orders);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] inventory = new int[]{3, 5};
        int orders = 6;
        int expected = 19;
        var result = solution.maxProfit(inventory, orders);
        assertThat(result).isEqualTo(expected);
    }

}
