package com.blogspot.ostas.leetcode.all.medium.append_characters_to_string_to_make_subsequence;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "coaching", t = "coding"
    Output: 4
    Explanation: Append the characters "ding" to the end of s so that s = "coachingding".
    Now, t is a subsequence of s ("coachingding").
    It can be shown that appending any 3 characters to the end of s will never make t a subsequence.
    Example 2:
    Input: s = "abcde", t = "a"
    Output: 0
    Explanation: t is already a subsequence of s ("abcde").
    Example 3:
    Input: s = "z", t = "abcde"
    Output: 5
    Explanation: Append the characters "abcde" to the end of s so that s = "zabcde".
    Now, t is a subsequence of s ("zabcde").
    It can be shown that appending any 4 characters to the end of s will never make t a subsequence.
      Constraints:
    1 <= s.length, t.length <= 105
    s and t consist only of lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "coaching";
        String t = "coding";
        int expected = 4;
        var result = solution.appendCharacters(s, t);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "abcde";
        String t = "a";
        int expected = 0;
        var result = solution.appendCharacters(s, t);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "z";
        String t = "abcde";
        int expected = 5;
        var result = solution.appendCharacters(s, t);
        assertThat(result).isEqualTo(expected);
    }

}
