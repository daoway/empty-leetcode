package com.blogspot.ostas.leetcode.all.easy.number_complement;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: num = 5
    Output: 2
    Explanation: The binary representation of 5 is 101 (no leading zero bits), and its complement is 010. So you need to output 2.
    Example 2:
    Input: num = 1
    Output: 0
    Explanation: The binary representation of 1 is 1 (no leading zero bits), and its complement is 0. So you need to output 0.
      Constraints:
    1 <= num < 231
      Note: This question is the same as 1009: https://leetcode.com/problems/complement-of-base-10-integer/
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int num = 5;
        int expected = 2;
        var result = solution.findComplement(num);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int num = 1;
        int expected = 0;
        var result = solution.findComplement(num);
        assertThat(result).isEqualTo(expected);
    }

}
