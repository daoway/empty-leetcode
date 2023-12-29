package com.blogspot.ostas.leetcode.all.hard.distinct_subsequences_ii;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "abc"
    Output: 7
    Explanation: The 7 distinct subsequences are "a", "b", "c", "ab", "ac", "bc", and "abc".
    Example 2:
    Input: s = "aba"
    Output: 6
    Explanation: The 6 distinct subsequences are "a", "b", "ab", "aa", "ba", and "aba".
    Example 3:
    Input: s = "aaa"
    Output: 3
    Explanation: The 3 distinct subsequences are "a", "aa" and "aaa".
      Constraints:
    1 <= s.length <= 2000
    s consists of lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "abc";
        int expected = 7;
        var result = solution.distinctSubseqII(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "aba";
        int expected = 6;
        var result = solution.distinctSubseqII(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "aaa";
        int expected = 3;
        var result = solution.distinctSubseqII(s);
        assertThat(result).isEqualTo(expected);
    }

}
