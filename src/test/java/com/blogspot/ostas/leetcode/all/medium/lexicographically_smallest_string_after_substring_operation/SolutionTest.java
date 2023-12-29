package com.blogspot.ostas.leetcode.all.medium.lexicographically_smallest_string_after_substring_operation;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "cbabc"
    Output: "baabc"
    Explanation: We apply the operation on the substring starting at index 0, and ending at index 1 inclusive.
    It can be proven that the resulting string is the lexicographically smallest.
    Example 2:
    Input: s = "acbbc"
    Output: "abaab"
    Explanation: We apply the operation on the substring starting at index 1, and ending at index 4 inclusive.
    It can be proven that the resulting string is the lexicographically smallest.
    Example 3:
    Input: s = "leetcode"
    Output: "kddsbncd"
    Explanation: We apply the operation on the entire string.
    It can be proven that the resulting string is the lexicographically smallest.
      Constraints:
    1 <= s.length <= 3 * 105
    s consists of lowercase English letters
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "cbabc";
        String expected = "baabc";
        var result = solution.smallestString(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "acbbc";
        String expected = "abaab";
        var result = solution.smallestString(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "leetcode";
        String expected = "kddsbncd";
        var result = solution.smallestString(s);
        assertThat(result).isEqualTo(expected);
    }

}
