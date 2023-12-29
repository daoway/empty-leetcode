package com.blogspot.ostas.leetcode.all.medium.count_substrings_that_differ_by_one_character;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "aba", t = "baba"
    Output: 6
    Explanation: The following are the pairs of substrings from s and t that differ by exactly 1 character:
    ("aba", "baba")
    ("aba", "baba")
    ("aba", "baba")
    ("aba", "baba")
    ("aba", "baba")
    ("aba", "baba")
    The underlined portions are the substrings that are chosen from s and t.
    Example 2:
    Input: s = "ab", t = "bb"
    Output: 3
    Explanation: The following are the pairs of substrings from s and t that differ by 1 character:
    ("ab", "bb")
    ("ab", "bb")
    ("ab", "bb")
    The underlined portions are the substrings that are chosen from s and t.
      Constraints:
    1 <= s.length, t.length <= 100
    s and t consist of lowercase English letters only.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "aba";
        String t = "baba";
        int expected = 6;
        var result = solution.countSubstrings(s, t);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "ab";
        String t = "bb";
        int expected = 3;
        var result = solution.countSubstrings(s, t);
        assertThat(result).isEqualTo(expected);
    }

}
