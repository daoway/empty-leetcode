package com.blogspot.ostas.leetcode.all.hard.longest_duplicate_substring;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "banana"
    Output: "ana"
    Example 2:
    Input: s = "abcd"
    Output: ""
      Constraints:
    2 <= s.length <= 3 * 104
    s consists of lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "banana";
        String expected = "ana";
        var result = solution.longestDupSubstring(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "abcd";
        String expected = "";
        var result = solution.longestDupSubstring(s);
        assertThat(result).isEqualTo(expected);
    }

}
