package com.blogspot.ostas.leetcode.all.hard.shortest_palindrome;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "aacecaaa"
    Output: "aaacecaaa"
    Example 2:
    Input: s = "abcd"
    Output: "dcbabcd"
      Constraints:
    0 <= s.length <= 5 * 104
    s consists of lowercase English letters only.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "aacecaaa";
        String expected = "aaacecaaa";
        var result = solution.shortestPalindrome(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "abcd";
        String expected = "dcbabcd";
        var result = solution.shortestPalindrome(s);
        assertThat(result).isEqualTo(expected);
    }

}
