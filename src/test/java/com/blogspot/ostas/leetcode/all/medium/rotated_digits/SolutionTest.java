package com.blogspot.ostas.leetcode.all.medium.rotated_digits;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 10
    Output: 4
    Explanation: There are four good numbers in the range [1, 10] : 2, 5, 6, 9.
    Note that 1 and 10 are not good numbers, since they remain unchanged after rotating.
    Example 2:
    Input: n = 1
    Output: 0
    Example 3:
    Input: n = 2
    Output: 1
      Constraints:
    1 <= n <= 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 10;
        int expected = 4;
        var result = solution.rotatedDigits(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 1;
        int expected = 0;
        var result = solution.rotatedDigits(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int n = 2;
        int expected = 1;
        var result = solution.rotatedDigits(n);
        assertThat(result).isEqualTo(expected);
    }

}
