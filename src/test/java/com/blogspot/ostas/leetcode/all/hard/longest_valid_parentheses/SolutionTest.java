package com.blogspot.ostas.leetcode.all.hard.longest_valid_parentheses;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "(()"
    Output: 2
    Explanation: The longest valid parentheses substring is "()".
    Example 2:
    Input: s = ")()())"
    Output: 4
    Explanation: The longest valid parentheses substring is "()()".
    Example 3:
    Input: s = ""
    Output: 0
      Constraints:
    0 <= s.length <= 3 * 104
    s[i] is '(', or ')'.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "(()";
        int expected = 2;
        var result = solution.longestValidParentheses(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = ")()())";
        int expected = 4;
        var result = solution.longestValidParentheses(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "";
        int expected = 0;
        var result = solution.longestValidParentheses(s);
        assertThat(result).isEqualTo(expected);
    }

}
