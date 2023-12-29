package com.blogspot.ostas.leetcode.all.hard.number_of_digit_one;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 13
    Output: 6
    Example 2:
    Input: n = 0
    Output: 0
      Constraints:
    0 <= n <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 13;
        int expected = 6;
        var result = solution.countDigitOne(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 0;
        int expected = 0;
        var result = solution.countDigitOne(n);
        assertThat(result).isEqualTo(expected);
    }

}
