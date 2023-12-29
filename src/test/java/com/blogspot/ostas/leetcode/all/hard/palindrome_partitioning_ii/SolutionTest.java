package com.blogspot.ostas.leetcode.all.hard.palindrome_partitioning_ii;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "aab"
    Output: 1
    Explanation: The palindrome partitioning ["aa","b"] could be produced using 1 cut.
    Example 2:
    Input: s = "a"
    Output: 0
    Example 3:
    Input: s = "ab"
    Output: 1
      Constraints:
    1 <= s.length <= 2000
    s consists of lowercase English letters only.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "aab";
        int expected = 1;
        var result = solution.minCut(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "a";
        int expected = 0;
        var result = solution.minCut(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "ab";
        int expected = 1;
        var result = solution.minCut(s);
        assertThat(result).isEqualTo(expected);
    }

}
