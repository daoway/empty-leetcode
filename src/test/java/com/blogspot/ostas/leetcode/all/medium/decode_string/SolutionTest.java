package com.blogspot.ostas.leetcode.all.medium.decode_string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "3[a]2[bc]"
    Output: "aaabcbc"
    Example 2:
    Input: s = "3[a2[c]]"
    Output: "accaccacc"
    Example 3:
    Input: s = "2[abc]3[cd]ef"
    Output: "abcabccdcdcdef"
      Constraints:
    1 <= s.length <= 30
    s consists of lowercase English letters, digits, and square brackets '[]'.
    s is guaranteed to be a valid input.
    All the integers in s are in the range [1, 300].
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "3[a]2[bc]";
        String expected = "aaabcbc";
        var result = solution.decodeString(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "3[a2[c]]";
        String expected = "accaccacc";
        var result = solution.decodeString(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "2[abc]3[cd]ef";
        String expected = "abcabccdcdcdef";
        var result = solution.decodeString(s);
        assertThat(result).isEqualTo(expected);
    }

}
