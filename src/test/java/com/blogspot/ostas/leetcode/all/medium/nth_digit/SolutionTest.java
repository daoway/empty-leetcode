package com.blogspot.ostas.leetcode.all.medium.nth_digit;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 3
    Output: 3
    Example 2:
    Input: n = 11
    Output: 0
    Explanation: The 11th digit of the sequence 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ... is a 0, which is part of the number 10.
      Constraints:
    1 <= n <= 231 - 1
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 3;
        int expected = 3;
        var result = solution.findNthDigit(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 11;
        int expected = 0;
        var result = solution.findNthDigit(n);
        assertThat(result).isEqualTo(expected);
    }

}
