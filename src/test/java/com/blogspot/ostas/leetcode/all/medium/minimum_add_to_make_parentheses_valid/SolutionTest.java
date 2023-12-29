package com.blogspot.ostas.leetcode.all.medium.minimum_add_to_make_parentheses_valid;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "())"
    Output: 1
    Example 2:
    Input: s = "((("
    Output: 3
      Constraints:
    1 <= s.length <= 1000
    s[i] is either '(' or ')'.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "())";
        int expected = 1;
        var result = solution.minAddToMakeValid(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "(((";
        int expected = 3;
        var result = solution.minAddToMakeValid(s);
        assertThat(result).isEqualTo(expected);
    }

}
