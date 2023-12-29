package com.blogspot.ostas.leetcode.all.medium.valid_parenthesis_string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "()"
    Output: true
    Example 2:
    Input: s = "(*)"
    Output: true
    Example 3:
    Input: s = "(*))"
    Output: true
      Constraints:
    1 <= s.length <= 100
    s[i] is '(', ')' or '*'.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "()";
        boolean expected = true;
        var result = solution.checkValidString(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "(*)";
        boolean expected = true;
        var result = solution.checkValidString(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "(*))";
        boolean expected = true;
        var result = solution.checkValidString(s);
        assertThat(result).isEqualTo(expected);
    }

}
