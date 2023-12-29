package com.blogspot.ostas.leetcode.all.hard.find_longest_awesome_substring;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "3242415"
    Output: 5
    Explanation: "24241" is the longest awesome substring, we can form the palindrome "24142" with some swaps.
    Example 2:
    Input: s = "12345678"
    Output: 1
    Example 3:
    Input: s = "213123"
    Output: 6
    Explanation: "213123" is the longest awesome substring, we can form the palindrome "231132" with some swaps.
      Constraints:
    1 <= s.length <= 105
    s consists only of digits.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "3242415";
        int expected = 5;
        var result = solution.longestAwesome(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "12345678";
        int expected = 1;
        var result = solution.longestAwesome(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "213123";
        int expected = 6;
        var result = solution.longestAwesome(s);
        assertThat(result).isEqualTo(expected);
    }

}
