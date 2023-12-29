package com.blogspot.ostas.leetcode.all.medium.longest_palindromic_substring;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "babad"
    Output: "bab"
    Explanation: "aba" is also a valid answer.
    Example 2:
    Input: s = "cbbd"
    Output: "bb"
      Constraints:
    1 <= s.length <= 1000
    s consist of only digits and English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "babad";
        String expected = "bab";
        var result = solution.longestPalindrome(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "cbbd";
        String expected = "bb";
        var result = solution.longestPalindrome(s);
        assertThat(result).isEqualTo(expected);
    }

}
