package com.blogspot.ostas.leetcode.all.easy.add_binary;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: a = "11", b = "1"
    Output: "100"
    Example 2:
    Input: a = "1010", b = "1011"
    Output: "10101"
      Constraints:
    1 <= a.length, b.length <= 104
    a and b consist only of '0' or '1' characters.
    Each string does not contain leading zeros except for the zero itself.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String a = "11";
        String b = "1";
        String expected = "100";
        var result = solution.addBinary(a, b);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String a = "1010";
        String b = "1011";
        String expected = "10101";
        var result = solution.addBinary(a, b);
        assertThat(result).isEqualTo(expected);
    }

}
