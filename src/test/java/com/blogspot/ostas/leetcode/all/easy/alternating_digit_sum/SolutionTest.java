package com.blogspot.ostas.leetcode.all.easy.alternating_digit_sum;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 521
    Output: 4
    Explanation: (+5) + (-2) + (+1) = 4.
    Example 2:
    Input: n = 111
    Output: 1
    Explanation: (+1) + (-1) + (+1) = 1.
    Example 3:
    Input: n = 886996
    Output: 0
    Explanation: (+8) + (-8) + (+6) + (-9) + (+9) + (-6) = 0.
      Constraints:
    1 <= n <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 521;
        int expected = 4;
        var result = solution.alternateDigitSum(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 111;
        int expected = 1;
        var result = solution.alternateDigitSum(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int n = 886996;
        int expected = 0;
        var result = solution.alternateDigitSum(n);
        assertThat(result).isEqualTo(expected);
    }
    @Test
    void example_3() {
        var solution = new Solution();
        int n = 4321;
        int expected = 2;
        var result = solution.alternateDigitSum(n);
        assertThat(result).isEqualTo(expected);
    }

}
