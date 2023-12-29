package com.blogspot.ostas.leetcode.all.hard.shortest_common_supersequence;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: str1 = "abac", str2 = "cab"
    Output: "cabac"
    Explanation:
    str1 = "abac" is a subsequence of "cabac" because we can delete the first "c".
    str2 = "cab" is a subsequence of "cabac" because we can delete the last "ac".
    The answer provided is the shortest such string that satisfies these properties.
    Example 2:
    Input: str1 = "aaaaaaaa", str2 = "aaaaaaaa"
    Output: "aaaaaaaa"
      Constraints:
    1 <= str1.length, str2.length <= 1000
    str1 and str2 consist of lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String str1 = "abac";
        String str2 = "cab";
        String expected = "cabac";
        var result = solution.shortestCommonSupersequence(str1, str2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String str1 = "aaaaaaaa";
        String str2 = "aaaaaaaa";
        String expected = "aaaaaaaa";
        var result = solution.shortestCommonSupersequence(str1, str2);
        assertThat(result).isEqualTo(expected);
    }

}
