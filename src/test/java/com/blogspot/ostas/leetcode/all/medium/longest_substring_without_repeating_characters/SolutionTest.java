package com.blogspot.ostas.leetcode.all.medium.longest_substring_without_repeating_characters;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "abcabcbb"
    Output: 3
    Explanation: The answer is "abc", with the length of 3.
    Example 2:
    Input: s = "bbbbb"
    Output: 1
    Explanation: The answer is "b", with the length of 1.
    Example 3:
    Input: s = "pwwkew"
    Output: 3
    Explanation: The answer is "wke", with the length of 3.
    Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
      Constraints:
    0 <= s.length <= 5 * 104
    s consists of English letters, digits, symbols and spaces.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "abcabcbb";
        int expected = 3;
        var result = solution.lengthOfLongestSubstring(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "bbbbb";
        int expected = 1;
        var result = solution.lengthOfLongestSubstring(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "pwwkew";
        int expected = 3;
        var result = solution.lengthOfLongestSubstring(s);
        assertThat(result).isEqualTo(expected);
    }

}
