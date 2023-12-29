package com.blogspot.ostas.leetcode.all.medium.score_of_parentheses;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "()"
    Output: 1
    Example 2:
    Input: s = "(())"
    Output: 2
    Example 3:
    Input: s = "()()"
    Output: 2
      Constraints:
    2 <= s.length <= 50
    s consists of only '(' and ')'.
    s is a balanced parentheses string.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "()";
        int expected = 1;
        var result = solution.scoreOfParentheses(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "(())";
        int expected = 2;
        var result = solution.scoreOfParentheses(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "()()";
        int expected = 2;
        var result = solution.scoreOfParentheses(s);
        assertThat(result).isEqualTo(expected);
    }

}
