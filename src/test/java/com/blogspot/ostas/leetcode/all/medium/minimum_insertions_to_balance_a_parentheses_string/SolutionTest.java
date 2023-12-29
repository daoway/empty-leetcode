package com.blogspot.ostas.leetcode.all.medium.minimum_insertions_to_balance_a_parentheses_string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "(()))"
    Output: 1
    Explanation: The second '(' has two matching '))', but the first '(' has only ')' matching. We need to add one more ')' at the end of the string to be "(())))" which is balanced.
    Example 2:
    Input: s = "())"
    Output: 0
    Explanation: The string is already balanced.
    Example 3:
    Input: s = "))())("
    Output: 3
    Explanation: Add '(' to match the first '))', Add '))' to match the last '('.
      Constraints:
    1 <= s.length <= 105
    s consists of '(' and ')' only.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "(()))";
        int expected = 1;
        var result = solution.minInsertions(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "())";
        int expected = 0;
        var result = solution.minInsertions(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "))())(";
        int expected = 3;
        var result = solution.minInsertions(s);
        assertThat(result).isEqualTo(expected);
    }

}
