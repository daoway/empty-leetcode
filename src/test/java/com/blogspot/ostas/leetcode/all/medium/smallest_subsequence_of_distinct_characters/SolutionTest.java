package com.blogspot.ostas.leetcode.all.medium.smallest_subsequence_of_distinct_characters;

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
    1 <= s.length <= 1000
    s consists of lowercase English letters.
      Note: This question is the same as 316: https://leetcode.com/problems/remove-duplicate-letters/
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "bcabc";
        String expected = "abc";
        var result = solution.smallestSubsequence(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "cbacdcbc";
        String expected = "acdb";
        var result = solution.smallestSubsequence(s);
        assertThat(result).isEqualTo(expected);
    }

}
