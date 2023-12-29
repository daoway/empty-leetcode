package com.blogspot.ostas.leetcode.all.easy.longest_uncommon_subsequence_i;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: a = "aba", b = "cdc"
    Output: 3
    Explanation: One longest uncommon subsequence is "aba" because "aba" is a subsequence of "aba" but not "cdc".
    Note that "cdc" is also a longest uncommon subsequence.
    Example 2:
    Input: a = "aaa", b = "bbb"
    Output: 3
    Explanation: The longest uncommon subsequences are "aaa" and "bbb".
    Example 3:
    Input: a = "aaa", b = "aaa"
    Output: -1
    Explanation: Every subsequence of string a is also a subsequence of string b. Similarly, every subsequence of string b is also a subsequence of string a.
      Constraints:
    1 <= a.length, b.length <= 100
    a and b consist of lower-case English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String a = "aba";
        String b = "cdc";
        int expected = 3;
        var result = solution.findLUSlength(a, b);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String a = "aaa";
        String b = "bbb";
        int expected = 3;
        var result = solution.findLUSlength(a, b);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String a = "aaa";
        String b = "aaa";
        int expected = -1;
        var result = solution.findLUSlength(a, b);
        assertThat(result).isEqualTo(expected);
    }

}
