package com.blogspot.ostas.leetcode.all.easy.complement_of_base_one_zero_integer;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 5
    Output: 2
    Explanation: 5 is "101" in binary, with complement "010" in binary, which is 2 in base-10.
    Example 2:
    Input: n = 7
    Output: 0
    Explanation: 7 is "111" in binary, with complement "000" in binary, which is 0 in base-10.
    Example 3:
    Input: n = 10
    Output: 5
    Explanation: 10 is "1010" in binary, with complement "0101" in binary, which is 5 in base-10.
      Constraints:
    0 <= n < 109
      Note: This question is the same as 476: https://leetcode.com/problems/number-complement/
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 5;
        int expected = 2;
        var result = solution.bitwiseComplement(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 7;
        int expected = 0;
        var result = solution.bitwiseComplement(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int n = 10;
        int expected = 5;
        var result = solution.bitwiseComplement(n);
        assertThat(result).isEqualTo(expected);
    }

}
