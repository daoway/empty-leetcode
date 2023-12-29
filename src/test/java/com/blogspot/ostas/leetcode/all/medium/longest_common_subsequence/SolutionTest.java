package com.blogspot.ostas.leetcode.all.medium.longest_common_subsequence;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: text1 = "abcde", text2 = "ace"
    Output: 3
    Explanation: The longest common subsequence is "ace" and its length is 3.
    Example 2:
    Input: text1 = "abc", text2 = "abc"
    Output: 3
    Explanation: The longest common subsequence is "abc" and its length is 3.
    Example 3:
    Input: text1 = "abc", text2 = "def"
    Output: 0
    Explanation: There is no such common subsequence, so the result is 0.
      Constraints:
    1 <= text1.length, text2.length <= 1000
    text1 and text2 consist of only lowercase English characters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String text1 = "abcde";
        String text2 = "ace";
        int expected = 3;
        var result = solution.longestCommonSubsequence(text1, text2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String text1 = "abc";
        String text2 = "abc";
        int expected = 3;
        var result = solution.longestCommonSubsequence(text1, text2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String text1 = "abc";
        String text2 = "def";
        int expected = 0;
        var result = solution.longestCommonSubsequence(text1, text2);
        assertThat(result).isEqualTo(expected);
    }

}
