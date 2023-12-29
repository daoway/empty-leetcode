package com.blogspot.ostas.leetcode.all.medium.remove_all_adjacent_duplicates_in_string_ii;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "abcd", k = 2
    Output: "abcd"
    Explanation: There's nothing to delete.
    Example 2:
    Input: s = "deeedbbcccbdaa", k = 3
    Output: "aa"
    Explanation:
    First delete "eee" and "ccc", get "ddbbbdaa"
    Then delete "bbb", get "dddaa"
    Finally delete "ddd", get "aa"
    Example 3:
    Input: s = "pbbcggttciiippooaais", k = 2
    Output: "ps"
      Constraints:
    1 <= s.length <= 105
    2 <= k <= 104
    s only contains lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "abcd";
        int k = 2;
        String expected = "abcd";
        var result = solution.removeDuplicates(s, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "deeedbbcccbdaa";
        int k = 3;
        String expected = "aa";
        var result = solution.removeDuplicates(s, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "pbbcggttciiippooaais";
        int k = 2;
        String expected = "ps";
        var result = solution.removeDuplicates(s, k);
        assertThat(result).isEqualTo(expected);
    }

}
