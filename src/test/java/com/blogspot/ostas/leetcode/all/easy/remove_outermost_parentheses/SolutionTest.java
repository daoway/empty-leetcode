package com.blogspot.ostas.leetcode.all.easy.remove_outermost_parentheses;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "(()())(())"
    Output: "()()()"
    Explanation:
    The input string is "(()())(())", with primitive decomposition "(()())" + "(())".
    After removing outer parentheses of each part, this is "()()" + "()" = "()()()".
    Example 2:
    Input: s = "(()())(())(()(()))"
    Output: "()()()()(())"
    Explanation:
    The input string is "(()())(())(()(()))", with primitive decomposition "(()())" + "(())" + "(()(()))".
    After removing outer parentheses of each part, this is "()()" + "()" + "()(())" = "()()()()(())".
    Example 3:
    Input: s = "()()"
    Output: ""
    Explanation:
    The input string is "()()", with primitive decomposition "()" + "()".
    After removing outer parentheses of each part, this is "" + "" = "".
      Constraints:
    1 <= s.length <= 105
    s[i] is either '(' or ')'.
    s is a valid parentheses string.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "(()())(())";
        String expected = "()()()";
        var result = solution.removeOuterParentheses(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "(()())(())(()(()))";
        String expected = "()()()()(())";
        var result = solution.removeOuterParentheses(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "()()";
        String expected = "";
        var result = solution.removeOuterParentheses(s);
        assertThat(result).isEqualTo(expected);
    }

}
