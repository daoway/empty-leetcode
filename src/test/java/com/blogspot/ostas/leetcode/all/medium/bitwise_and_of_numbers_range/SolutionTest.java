package com.blogspot.ostas.leetcode.all.medium.bitwise_and_of_numbers_range;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: left = 5, right = 7
    Output: 4
    Example 2:
    Input: left = 0, right = 0
    Output: 0
    Example 3:
    Input: left = 1, right = 2147483647
    Output: 0
      Constraints:
    0 <= left <= right <= 231 - 1
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int left = 5;
        int right = 7;
        int expected = 4;
        var result = solution.rangeBitwiseAnd(left, right);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int left = 0;
        int right = 0;
        int expected = 0;
        var result = solution.rangeBitwiseAnd(left, right);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int left = 1;
        int right = 2147483647;
        int expected = 0;
        var result = solution.rangeBitwiseAnd(left, right);
        assertThat(result).isEqualTo(expected);
    }

}
