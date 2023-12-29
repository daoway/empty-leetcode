package com.blogspot.ostas.leetcode.all.medium.factorial_trailing_zeroes;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 3
    Output: 0
    Explanation: 3! = 6, no trailing zero.
    Example 2:
    Input: n = 5
    Output: 1
    Explanation: 5! = 120, one trailing zero.
    Example 3:
    Input: n = 0
    Output: 0
      Constraints:
    0 <= n <= 104
      Follow up: Could you write a solution that works in logarithmic time complexity?
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 3;
        int expected = 0;
        var result = solution.trailingZeroes(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 5;
        int expected = 1;
        var result = solution.trailingZeroes(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int n = 0;
        int expected = 0;
        var result = solution.trailingZeroes(n);
        assertThat(result).isEqualTo(expected);
    }

}
