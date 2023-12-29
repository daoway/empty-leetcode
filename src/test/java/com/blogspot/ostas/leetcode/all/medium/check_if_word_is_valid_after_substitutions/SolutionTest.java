package com.blogspot.ostas.leetcode.all.medium.check_if_word_is_valid_after_substitutions;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "aabcbc"
    Output: true
    Explanation:
    "" -> "abc" -> "aabcbc"
    Thus, "aabcbc" is valid.
    Example 2:
    Input: s = "abcabcababcc"
    Output: true
    Explanation:
    "" -> "abc" -> "abcabc" -> "abcabcabc" -> "abcabcababcc"
    Thus, "abcabcababcc" is valid.
    Example 3:
    Input: s = "abccba"
    Output: false
    Explanation: It is impossible to get "abccba" using the operation.
      Constraints:
    1 <= s.length <= 2 * 104
    s consists of letters 'a', 'b', and 'c'
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "aabcbc";
        boolean expected = true;
        var result = solution.isValid(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "abcabcababcc";
        boolean expected = true;
        var result = solution.isValid(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "abccba";
        boolean expected = false;
        var result = solution.isValid(s);
        assertThat(result).isEqualTo(expected);
    }

}
