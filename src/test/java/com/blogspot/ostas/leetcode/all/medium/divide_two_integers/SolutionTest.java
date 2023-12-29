package com.blogspot.ostas.leetcode.all.medium.divide_two_integers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: dividend = 10, divisor = 3
    Output: 3
    Explanation: 10/3 = 3.33333.. which is truncated to 3.
    Example 2:
    Input: dividend = 7, divisor = -3
    Output: -2
    Explanation: 7/-3 = -2.33333.. which is truncated to -2.
      Constraints:
    -231 <= dividend, divisor <= 231 - 1
    divisor != 0
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int dividend = 10;
        int divisor = 3;
        int expected = 3;
        var result = solution.divide(dividend, divisor);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int dividend = 7;
        int divisor = -3;
        int expected = -2;
        var result = solution.divide(dividend, divisor);
        assertThat(result).isEqualTo(expected);
    }

}
