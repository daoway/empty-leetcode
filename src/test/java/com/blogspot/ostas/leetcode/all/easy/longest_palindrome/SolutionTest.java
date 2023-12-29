package com.blogspot.ostas.leetcode.all.easy.longest_palindrome;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "abccccdd"
    Output: 7
    Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7.
    Example 2:
    Input: s = "a"
    Output: 1
    Explanation: The longest palindrome that can be built is "a", whose length is 1.
      Constraints:
    1 <= s.length <= 2000
    s consists of lowercase and/or uppercase English letters only.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "abccccdd";
        int expected = 7;
        var result = solution.longestPalindrome(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "a";
        int expected = 1;
        var result = solution.longestPalindrome(s);
        assertThat(result).isEqualTo(expected);
    }

}
