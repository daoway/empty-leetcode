package com.blogspot.ostas.leetcode.all.easy.find_the_longest_balanced_substring_of_a_binary_string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "01000111"
    Output: 6
    Explanation: The longest balanced substring is "000111", which has length 6.
    Example 2:
    Input: s = "00111"
    Output: 4
    Explanation: The longest balanced substring is "0011", which has length 4.
    Example 3:
    Input: s = "111"
    Output: 0
    Explanation: There is no balanced substring except the empty substring, so the answer is 0.
      Constraints:
    1 <= s.length <= 50
    '0' <= s[i] <= '1'
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "01000111";
        int expected = 6;
        var result = solution.findTheLongestBalancedSubstring(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "00111";
        int expected = 4;
        var result = solution.findTheLongestBalancedSubstring(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "111";
        int expected = 0;
        var result = solution.findTheLongestBalancedSubstring(s);
        assertThat(result).isEqualTo(expected);
    }

}
