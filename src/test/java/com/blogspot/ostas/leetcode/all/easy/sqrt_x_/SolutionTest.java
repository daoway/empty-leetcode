package com.blogspot.ostas.leetcode.all.easy.sqrt_x_;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: x = 4
    Output: 2
    Explanation: The square root of 4 is 2, so we return 2.
    Example 2:
    Input: x = 8
    Output: 2
    Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.
      Constraints:
    0 <= x <= 231 - 1
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int x = 4;
        int expected = 2;
        var result = solution.mySqrt(x);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int x = 8;
        int expected = 2;
        var result = solution.mySqrt(x);
        assertThat(result).isEqualTo(expected);
    }

}
