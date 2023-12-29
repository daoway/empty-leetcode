package com.blogspot.ostas.leetcode.all.hard.count_different_palindromic_subsequences;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "bccb"
    Output: 6
    Explanation: The 6 different non-empty palindromic subsequences are 'b', 'c', 'bb', 'cc', 'bcb', 'bccb'.
    Note that 'bcb' is counted only once, even though it occurs twice.
    Example 2:
    Input: s = "abcdabcdabcdabcdabcdabcdabcdabcddcbadcbadcbadcbadcbadcbadcbadcba"
    Output: 104860361
    Explanation: There are 3104860382 different non-empty palindromic subsequences, which is 104860361 modulo 109 + 7.
      Constraints:
    1 <= s.length <= 1000
    s[i] is either 'a', 'b', 'c', or 'd'.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "bccb";
        int expected = 6;
        var result = solution.countPalindromicSubsequences(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "abcdabcdabcdabcdabcdabcdabcdabcddcbadcbadcbadcbadcbadcbadcbadcba";
        int expected = 104860361;
        var result = solution.countPalindromicSubsequences(s);
        assertThat(result).isEqualTo(expected);
    }

}
