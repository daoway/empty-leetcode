package com.blogspot.ostas.leetcode.all.hard.distinct_echo_substrings;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: text = "abcabcabc"
    Output: 3
    Explanation: The 3 substrings are "abcabc", "bcabca" and "cabcab".
    Example 2:
    Input: text = "leetcodeleetcode"
    Output: 2
    Explanation: The 2 substrings are "ee" and "leetcodeleetcode".
      Constraints:
    1 <= text.length <= 2000
    text has only lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String text = "abcabcabc";
        int expected = 3;
        var result = solution.distinctEchoSubstrings(text);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String text = "leetcodeleetcode";
        int expected = 2;
        var result = solution.distinctEchoSubstrings(text);
        assertThat(result).isEqualTo(expected);
    }

}
