package com.blogspot.ostas.leetcode.all.medium.length_of_the_longest_alphabetical_continuous_substring;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "abacaba"
    Output: 2
    Explanation: There are 4 distinct continuous substrings: "a", "b", "c" and "ab".
    "ab" is the longest continuous substring.
    Example 2:
    Input: s = "abcde"
    Output: 5
    Explanation: "abcde" is the longest continuous substring.
      Constraints:
    1 <= s.length <= 105
    s consists of only English lowercase letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "abacaba";
        int expected = 2;
        var result = solution.longestContinuousSubstring(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "abcde";
        int expected = 5;
        var result = solution.longestContinuousSubstring(s);
        assertThat(result).isEqualTo(expected);
    }

}
