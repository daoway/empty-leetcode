package com.blogspot.ostas.leetcode.all.hard.subsequence_with_the_minimum_score;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "abacaba", t = "bzaa"
    Output: 1
    Explanation: In this example, we remove the character "z" at index 1 (0-indexed).
    The string t becomes "baa" which is a subsequence of the string "abacaba" and the score is 1 - 1 + 1 = 1.
    It can be proven that 1 is the minimum score that we can achieve.
    Example 2:
    Input: s = "cde", t = "xyz"
    Output: 3
    Explanation: In this example, we remove characters "x", "y" and "z" at indices 0, 1, and 2 (0-indexed).
    The string t becomes "" which is a subsequence of the string "cde" and the score is 2 - 0 + 1 = 3.
    It can be proven that 3 is the minimum score that we can achieve.
      Constraints:
    1 <= s.length, t.length <= 105
    s and t consist of only lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "abacaba";
        String t = "bzaa";
        int expected = 1;
        var result = solution.minimumScore(s, t);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "cde";
        String t = "xyz";
        int expected = 3;
        var result = solution.minimumScore(s, t);
        assertThat(result).isEqualTo(expected);
    }

}
