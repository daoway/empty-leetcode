package com.blogspot.ostas.leetcode.all.hard.wildcard_matching;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "aa", p = "a"
    Output: false
    Explanation: "a" does not match the entire string "aa".
    Example 2:
    Input: s = "aa", p = "*"
    Output: true
    Explanation: '*' matches any sequence.
    Example 3:
    Input: s = "cb", p = "?a"
    Output: false
    Explanation: '?' matches 'c', but the second letter is 'a', which does not match 'b'.
      Constraints:
    0 <= s.length, p.length <= 2000
    s contains only lowercase English letters.
    p contains only lowercase English letters, '?' or '*'.
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
        String p = "*";
        boolean expected = true;
        var result = solution.isMatch(s, p);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "cb";
        String p = "?a";
        boolean expected = false;
        var result = solution.isMatch(s, p);
        assertThat(result).isEqualTo(expected);
    }

}
