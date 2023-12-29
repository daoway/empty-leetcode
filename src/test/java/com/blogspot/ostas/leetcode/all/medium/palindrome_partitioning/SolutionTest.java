package com.blogspot.ostas.leetcode.all.medium.palindrome_partitioning;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "aab"
    Output: [["a","a","b"],["aa","b"]]
    Example 2:
    Input: s = "a"
    Output: [["a"]]
      Constraints:
    1 <= s.length <= 16
    s contains only lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "aab";
        List<List<String>> expected = List.of(List.of("a", "a", "b"), List.of("aa", "b"));
        var result = solution.partition(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "a";
        List<List<String>> expected = List.of(List.of("a"));
        var result = solution.partition(s);
        assertThat(result).isEqualTo(expected);
    }

}
