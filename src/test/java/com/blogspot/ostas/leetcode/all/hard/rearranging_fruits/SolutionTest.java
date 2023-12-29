package com.blogspot.ostas.leetcode.all.hard.rearranging_fruits;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: basket1 = [4,2,2,2], basket2 = [1,4,1,2]
    Output: 1
    Explanation: Swap index 1 of basket1 with index 0 of basket2, which has cost 1. Now basket1 = [4,1,2,2] and basket2 = [2,4,1,2]. Rearranging both the arrays makes them equal.
    Example 2:
    Input: basket1 = [2,3,4,1], basket2 = [3,2,5,1]
    Output: -1
    Explanation: It can be shown that it is impossible to make both the baskets equal.
      Constraints:
    basket1.length == basket2.length
    1 <= basket1.length <= 105
    1 <= basket1[i],basket2[i] <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] basket1 = new int[]{4, 2, 2, 2};
        int[] basket2 = new int[]{1, 4, 1, 2};
        long expected = 1;
        var result = solution.minCost(basket1, basket2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] basket1 = new int[]{2, 3, 4, 1};
        int[] basket2 = new int[]{3, 2, 5, 1};
        long expected = -1;
        var result = solution.minCost(basket1, basket2);
        assertThat(result).isEqualTo(expected);
    }

}
