package com.blogspot.ostas.leetcode.all.hard.minimum_window_substring;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "ADOBECODEBANC", t = "ABC"
    Output: "BANC"
    Explanation: The minimum window substring "BANC" includes 'A', 'B', and 'C' from string t.
    Example 2:
    Input: s = "a", t = "a"
    Output: "a"
    Explanation: The entire string s is the minimum window.
    Example 3:
    Input: s = "a", t = "aa"
    Output: ""
    Explanation: Both 'a's from t must be included in the window.
    Since the largest window of s only has one 'a', return empty string.
      Constraints:
    m == s.length
    n == t.length
    1 <= m, n <= 105
    s and t consist of uppercase and lowercase English letters.
      Follow up: Could you find an algorithm that runs in O(m + n) time?
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "ADOBECODEBANC";
        String t = "ABC";
        String expected = "BANC";
        var result = solution.minWindow(s, t);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "a";
        String t = "a";
        String expected = "a";
        var result = solution.minWindow(s, t);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "a";
        String t = "aa";
        String expected = "";
        var result = solution.minWindow(s, t);
        assertThat(result).isEqualTo(expected);
    }

}
