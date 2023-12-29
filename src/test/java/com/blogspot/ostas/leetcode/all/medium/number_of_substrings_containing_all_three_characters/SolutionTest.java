package com.blogspot.ostas.leetcode.all.medium.number_of_substrings_containing_all_three_characters;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "abcabc"
    Output: 10
    Explanation: The substrings containing at least one occurrence of the characters a, b and c are "abc", "abca", "abcab", "abcabc", "bca", "bcab", "bcabc", "cab", "cabc" and "abc" (again).
    Example 2:
    Input: s = "aaacb"
    Output: 3
    Explanation: The substrings containing at least one occurrence of the characters a, b and c are "aaacb", "aacb" and "acb".
    Example 3:
    Input: s = "abc"
    Output: 1
      Constraints:
    3 <= s.length <= 5 x 10^4
    s only consists of a, b or c characters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "abcabc";
        int expected = 10;
        var result = solution.numberOfSubstrings(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "aaacb";
        int expected = 3;
        var result = solution.numberOfSubstrings(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "abc";
        int expected = 1;
        var result = solution.numberOfSubstrings(s);
        assertThat(result).isEqualTo(expected);
    }

}
