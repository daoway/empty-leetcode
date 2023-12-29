package com.blogspot.ostas.leetcode.all.easy.valid_parentheses;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "()"
    Output: true
    Example 2:
    Input: s = "()[]{}"
    Output: true
    Example 3:
    Input: s = "(]"
    Output: false
      Constraints:
    1 <= s.length <= 104
    s consists of parentheses only '()[]{}'.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "()";
        boolean expected = true;
        var result = solution.isValid(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "()[]{}";
        boolean expected = true;
        var result = solution.isValid(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "(]";
        boolean expected = false;
        var result = solution.isValid(s);
        assertThat(result).isEqualTo(expected);
    }

}
