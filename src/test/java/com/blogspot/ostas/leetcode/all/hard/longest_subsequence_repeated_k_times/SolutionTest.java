package com.blogspot.ostas.leetcode.all.hard.longest_subsequence_repeated_k_times;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "letsleetcode", k = 2
    Output: "let"
    Explanation: There are two longest subsequences repeated 2 times: "let" and "ete".
    "let" is the lexicographically largest one.
    Example 2:
    Input: s = "bb", k = 2
    Output: "b"
    Explanation: The longest subsequence repeated 2 times is "b".
    Example 3:
    Input: s = "ab", k = 2
    Output: ""
    Explanation: There is no subsequence repeated 2 times. Empty string is returned.
      Constraints:
    n == s.length
    2 <= n, k <= 2000
    2 <= n < k * 8
    s consists of lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "letsleetcode";
        int k = 2;
        String expected = "let";
        var result = solution.longestSubsequenceRepeatedK(s, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "bb";
        int k = 2;
        String expected = "b";
        var result = solution.longestSubsequenceRepeatedK(s, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "ab";
        int k = 2;
        String expected = "";
        var result = solution.longestSubsequenceRepeatedK(s, k);
        assertThat(result).isEqualTo(expected);
    }

}
