package com.blogspot.ostas.leetcode.all.medium.integer_break;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 2
    Output: 1
    Explanation: 2 = 1 + 1, 1 × 1 = 1.
    Example 2:
    Input: n = 10
    Output: 36
    Explanation: 10 = 3 + 3 + 4, 3 × 3 × 4 = 36.
      Constraints:
    2 <= n <= 58
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 2;
        int expected = 1;
        var result = solution.integerBreak(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 10;
        int expected = 36;
        var result = solution.integerBreak(n);
        assertThat(result).isEqualTo(expected);
    }

}
