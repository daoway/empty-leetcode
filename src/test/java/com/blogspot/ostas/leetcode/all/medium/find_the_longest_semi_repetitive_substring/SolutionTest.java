package com.blogspot.ostas.leetcode.all.medium.find_the_longest_semi_repetitive_substring;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "52233"
    Output: 4
    Explanation: The longest semi-repetitive substring is "5223", which starts at i = 0 and ends at j = 3.
    Example 2:
    Input: s = "5494"
    Output: 4
    Explanation: s is a semi-reptitive string, so the answer is 4.
    Example 3:
    Input: s = "1111111"
    Output: 2
    Explanation: The longest semi-repetitive substring is "11", which starts at i = 0 and ends at j = 1.
      Constraints:
    1 <= s.length <= 50
    '0' <= s[i] <= '9'
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "52233";
        int expected = 4;
        var result = solution.longestSemiRepetitiveSubstring(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "5494";
        int expected = 4;
        var result = solution.longestSemiRepetitiveSubstring(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "1111111";
        int expected = 2;
        var result = solution.longestSemiRepetitiveSubstring(s);
        assertThat(result).isEqualTo(expected);
    }

}
