package com.blogspot.ostas.leetcode.all.hard.valid_number;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "0"
    Output: true
    Example 2:
    Input: s = "e"
    Output: false
    Example 3:
    Input: s = "."
    Output: false
      Constraints:
    1 <= s.length <= 20
    s consists of only English letters (both uppercase and lowercase), digits (0-9), plus '+', minus '-', or dot '.'.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "0";
        boolean expected = true;
        var result = solution.isNumber(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "e";
        boolean expected = false;
        var result = solution.isNumber(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = ".";
        boolean expected = false;
        var result = solution.isNumber(s);
        assertThat(result).isEqualTo(expected);
    }

}
