package com.blogspot.ostas.leetcode.all.easy.climbing_stairs;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 2
    Output: 2
    Explanation: There are two ways to climb to the top.
    1. 1 step + 1 step
    2. 2 steps
    Example 2:
    Input: n = 3
    Output: 3
    Explanation: There are three ways to climb to the top.
    1. 1 step + 1 step + 1 step
    2. 1 step + 2 steps
    3. 2 steps + 1 step
      Constraints:
    1 <= n <= 45
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 2;
        int expected = 2;
        var result = solution.climbStairs(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 3;
        int expected = 3;
        var result = solution.climbStairs(n);
        assertThat(result).isEqualTo(expected);
    }

}
