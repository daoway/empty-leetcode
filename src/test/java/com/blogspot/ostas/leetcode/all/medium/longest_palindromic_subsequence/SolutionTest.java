package com.blogspot.ostas.leetcode.all.medium.longest_palindromic_subsequence;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "bbbab"
    Output: 4
    Explanation: One possible longest palindromic subsequence is "bbbb".
    Example 2:
    Input: s = "cbbd"
    Output: 2
    Explanation: One possible longest palindromic subsequence is "bb".
      Constraints:
    1 <= s.length <= 1000
    s consists only of lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "bbbab";
        int expected = 4;
        var result = solution.longestPalindromeSubseq(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "cbbd";
        int expected = 2;
        var result = solution.longestPalindromeSubseq(s);
        assertThat(result).isEqualTo(expected);
    }

}
