package com.blogspot.ostas.leetcode.all.hard.regular_expression_matching;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "aa", p = "a"
    Output: false
    Explanation: "a" does not match the entire string "aa".
    Example 2:
    Input: s = "aa", p = "a*"
    Output: true
    Explanation: '*' means zero or more of the preceding element, 'a'. Therefore, by repeating 'a' once, it becomes "aa".
    Example 3:
    Input: s = "ab", p = ".*"
    Output: true
    Explanation: ".*" means "zero or more (*) of any character (.)".
      Constraints:
    1 <= s.length <= 20
    1 <= p.length <= 20
    s contains only lowercase English letters.
    p contains only lowercase English letters, '.', and '*'.
    It is guaranteed for each appearance of the character '*', there will be a previous valid character to match.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "aa";
        String p = "a";
        boolean expected = false;
        var result = solution.isMatch(s, p);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "aa";
        String p = "a*";
        boolean expected = true;
        var result = solution.isMatch(s, p);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "ab";
        String p = ".*";
        boolean expected = true;
        var result = solution.isMatch(s, p);
        assertThat(result).isEqualTo(expected);
    }

}
