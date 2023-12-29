package com.blogspot.ostas.leetcode.all.medium.minimum_remove_to_make_valid_parentheses;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "lee(t(c)o)de)"
    Output: "lee(t(c)o)de"
    Explanation: "lee(t(co)de)" , "lee(t(c)ode)" would also be accepted.
    Example 2:
    Input: s = "a)b(c)d"
    Output: "ab(c)d"
    Example 3:
    Input: s = "))(("
    Output: ""
    Explanation: An empty string is also valid.
      Constraints:
    1 <= s.length <= 105
    s[i] is either'(' , ')', or lowercase English letter.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "lee(t(c)o)de)";
        String expected = "lee(t(c)o)de";
        var result = solution.minRemoveToMakeValid(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "a)b(c)d";
        String expected = "ab(c)d";
        var result = solution.minRemoveToMakeValid(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "))((";
        String expected = "";
        var result = solution.minRemoveToMakeValid(s);
        assertThat(result).isEqualTo(expected);
    }

}
