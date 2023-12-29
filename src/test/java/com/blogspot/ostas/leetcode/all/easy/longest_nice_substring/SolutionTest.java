package com.blogspot.ostas.leetcode.all.easy.longest_nice_substring;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "YazaAay"
    Output: "aAa"
    Explanation: "aAa" is a nice string because 'A/a' is the only letter of the alphabet in s, and both 'A' and 'a' appear.
    "aAa" is the longest nice substring.
    Example 2:
    Input: s = "Bb"
    Output: "Bb"
    Explanation: "Bb" is a nice string because both 'B' and 'b' appear. The whole string is a substring.
    Example 3:
    Input: s = "c"
    Output: ""
    Explanation: There are no nice substrings.
      Constraints:
    1 <= s.length <= 100
    s consists of uppercase and lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "YazaAay";
        String expected = "aAa";
        var result = solution.longestNiceSubstring(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "Bb";
        String expected = "Bb";
        var result = solution.longestNiceSubstring(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "c";
        String expected = "";
        var result = solution.longestNiceSubstring(s);
        assertThat(result).isEqualTo(expected);
    }

}
