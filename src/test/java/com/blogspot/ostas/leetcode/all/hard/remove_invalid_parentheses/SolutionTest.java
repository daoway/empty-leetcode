package com.blogspot.ostas.leetcode.all.hard.remove_invalid_parentheses;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "()())()"
    Output: ["(())()","()()()"]
    Example 2:
    Input: s = "(a)())()"
    Output: ["(a())()","(a)()()"]
    Example 3:
    Input: s = ")("
    Output: [""]
      Constraints:
    1 <= s.length <= 25
    s consists of lowercase English letters and parentheses '(' and ')'.
    There will be at most 20 parentheses in s.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "()())()";
        List<String> expected = List.of("(())()", "()()()");
        var result = solution.removeInvalidParentheses(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "(a)())()";
        List<String> expected = List.of("(a())()", "(a)()()");
        var result = solution.removeInvalidParentheses(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = ")(";
        List<String> expected = List.of("");
        var result = solution.removeInvalidParentheses(s);
        assertThat(result).isEqualTo(expected);
    }

}
