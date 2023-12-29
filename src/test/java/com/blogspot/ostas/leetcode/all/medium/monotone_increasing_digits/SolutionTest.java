package com.blogspot.ostas.leetcode.all.medium.monotone_increasing_digits;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 10
    Output: 9
    Example 2:
    Input: n = 1234
    Output: 1234
    Example 3:
    Input: n = 332
    Output: 299
      Constraints:
    0 <= n <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 10;
        int expected = 9;
        var result = solution.monotoneIncreasingDigits(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 1234;
        int expected = 1234;
        var result = solution.monotoneIncreasingDigits(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int n = 332;
        int expected = 299;
        var result = solution.monotoneIncreasingDigits(n);
        assertThat(result).isEqualTo(expected);
    }

}
