package com.blogspot.ostas.leetcode.all.easy.min_cost_climbing_stairs;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: cost = [10,15,20]
    Output: 15
    Explanation: You will start at index 1.
    - Pay 15 and climb two steps to reach the top.
    The total cost is 15.
    Example 2:
    Input: cost = [1,100,1,1,1,100,1,1,100,1]
    Output: 6
    Explanation: You will start at index 0.
    - Pay 1 and climb two steps to reach index 2.
    - Pay 1 and climb two steps to reach index 4.
    - Pay 1 and climb two steps to reach index 6.
    - Pay 1 and climb one step to reach index 7.
    - Pay 1 and climb two steps to reach index 9.
    - Pay 1 and climb one step to reach the top.
    The total cost is 6.
      Constraints:
    2 <= cost.length <= 1000
    0 <= cost[i] <= 999
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] cost = new int[]{10, 15, 20};
        int expected = 15;
        var result = solution.minCostClimbingStairs(cost);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] cost = new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        int expected = 6;
        var result = solution.minCostClimbingStairs(cost);
        assertThat(result).isEqualTo(expected);
    }

}
