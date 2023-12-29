package com.blogspot.ostas.leetcode.all.medium.palindromic_substrings;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "abc"
    Output: 3
    Explanation: Three palindromic strings: "a", "b", "c".
    Example 2:
    Input: s = "aaa"
    Output: 6
    Explanation: Six palindromic strings: "a", "a", "a", "aa", "aa", "aaa".
      Constraints:
    1 <= s.length <= 1000
    s consists of lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "abc";
        int expected = 3;
        var result = solution.countSubstrings(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "aaa";
        int expected = 6;
        var result = solution.countSubstrings(s);
        assertThat(result).isEqualTo(expected);
    }

}
