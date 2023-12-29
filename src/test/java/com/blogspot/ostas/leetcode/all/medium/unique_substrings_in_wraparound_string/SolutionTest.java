package com.blogspot.ostas.leetcode.all.medium.unique_substrings_in_wraparound_string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "a"
    Output: 1
    Explanation: Only the substring "a" of s is in base.
    Example 2:
    Input: s = "cac"
    Output: 2
    Explanation: There are two substrings ("a", "c") of s in base.
    Example 3:
    Input: s = "zab"
    Output: 6
    Explanation: There are six substrings ("z", "a", "b", "za", "ab", and "zab") of s in base.
      Constraints:
    1 <= s.length <= 105
    s consists of lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "a";
        int expected = 1;
        var result = solution.findSubstringInWraproundString(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "cac";
        int expected = 2;
        var result = solution.findSubstringInWraproundString(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "zab";
        int expected = 6;
        var result = solution.findSubstringInWraproundString(s);
        assertThat(result).isEqualTo(expected);
    }

}
