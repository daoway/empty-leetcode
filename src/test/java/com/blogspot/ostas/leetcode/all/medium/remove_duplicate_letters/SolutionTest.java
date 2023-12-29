package com.blogspot.ostas.leetcode.all.medium.remove_duplicate_letters;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "bcabc"
    Output: "abc"
    Example 2:
    Input: s = "cbacdcbc"
    Output: "acdb"
      Constraints:
    1 <= s.length <= 104
    s consists of lowercase English letters.
      Note: This question is the same as 1081: https://leetcode.com/problems/smallest-subsequence-of-distinct-characters/
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "bcabc";
        String expected = "abc";
        var result = solution.removeDuplicateLetters(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "cbacdcbc";
        String expected = "acdb";
        var result = solution.removeDuplicateLetters(s);
        assertThat(result).isEqualTo(expected);
    }

}
