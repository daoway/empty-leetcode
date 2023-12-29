package com.blogspot.ostas.leetcode.all.easy.valid_palindrome_ii;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "aba"
    Output: true
    Example 2:
    Input: s = "abca"
    Output: true
    Explanation: You could delete the character 'c'.
    Example 3:
    Input: s = "abc"
    Output: false
      Constraints:
    1 <= s.length <= 105
    s consists of lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "aba";
        boolean expected = true;
        var result = solution.validPalindrome(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "abca";
        boolean expected = true;
        var result = solution.validPalindrome(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "abc";
        boolean expected = false;
        var result = solution.validPalindrome(s);
        assertThat(result).isEqualTo(expected);
    }

}
