package com.blogspot.ostas.leetcode.all.easy.repeated_substring_pattern;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "abab"
    Output: true
    Explanation: It is the substring "ab" twice.
    Example 2:
    Input: s = "aba"
    Output: false
    Example 3:
    Input: s = "abcabcabcabc"
    Output: true
    Explanation: It is the substring "abc" four times or the substring "abcabc" twice.
      Constraints:
    1 <= s.length <= 104
    s consists of lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "abab";
        boolean expected = true;
        var result = solution.repeatedSubstringPattern(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "aba";
        boolean expected = false;
        var result = solution.repeatedSubstringPattern(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "abcabcabcabc";
        boolean expected = true;
        var result = solution.repeatedSubstringPattern(s);
        assertThat(result).isEqualTo(expected);
    }

}
