package com.blogspot.ostas.leetcode.all.medium.perfect_squares;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 12
    Output: 3
    Explanation: 12 = 4 + 4 + 4.
    Example 2:
    Input: n = 13
    Output: 2
    Explanation: 13 = 4 + 9.
      Constraints:
    1 <= n <= 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 12;
        int expected = 3;
        var result = solution.numSquares(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 13;
        int expected = 2;
        var result = solution.numSquares(n);
        assertThat(result).isEqualTo(expected);
    }

}
