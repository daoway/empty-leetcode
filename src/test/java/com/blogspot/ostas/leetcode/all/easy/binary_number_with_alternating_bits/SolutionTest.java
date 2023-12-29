package com.blogspot.ostas.leetcode.all.easy.binary_number_with_alternating_bits;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 5
    Output: true
    Explanation: The binary representation of 5 is: 101
    Example 2:
    Input: n = 7
    Output: false
    Explanation: The binary representation of 7 is: 111.
    Example 3:
    Input: n = 11
    Output: false
    Explanation: The binary representation of 11 is: 1011.
      Constraints:
    1 <= n <= 231 - 1
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 5;
        boolean expected = true;
        var result = solution.hasAlternatingBits(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 7;
        boolean expected = false;
        var result = solution.hasAlternatingBits(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int n = 11;
        boolean expected = false;
        var result = solution.hasAlternatingBits(n);
        assertThat(result).isEqualTo(expected);
    }

}
