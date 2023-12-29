package com.blogspot.ostas.leetcode.all.medium.get_equal_substrings_within_budget;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "abcd", t = "bcdf", maxCost = 3
    Output: 3
    Explanation: "abc" of s can change to "bcd".
    That costs 3, so the maximum length is 3.
    Example 2:
    Input: s = "abcd", t = "cdef", maxCost = 3
    Output: 1
    Explanation: Each character in s costs 2 to change to character in t,  so the maximum length is 1.
    Example 3:
    Input: s = "abcd", t = "acde", maxCost = 0
    Output: 1
    Explanation: You cannot make any change, so the maximum length is 1.
      Constraints:
    1 <= s.length <= 105
    t.length == s.length
    0 <= maxCost <= 106
    s and t consist of only lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "abcd";
        String t = "bcdf";
        int maxCost = 3;
        int expected = 3;
        var result = solution.equalSubstring(s, t, maxCost);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "abcd";
        String t = "cdef";
        int maxCost = 3;
        int expected = 1;
        var result = solution.equalSubstring(s, t, maxCost);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "abcd";
        String t = "acde";
        int maxCost = 0;
        int expected = 1;
        var result = solution.equalSubstring(s, t, maxCost);
        assertThat(result).isEqualTo(expected);
    }

}
