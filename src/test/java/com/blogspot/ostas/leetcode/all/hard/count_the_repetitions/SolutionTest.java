package com.blogspot.ostas.leetcode.all.hard.count_the_repetitions;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s1 = "acb", n1 = 4, s2 = "ab", n2 = 2
    Output: 2
    Example 2:
    Input: s1 = "acb", n1 = 1, s2 = "acb", n2 = 1
    Output: 1
      Constraints:
    1 <= s1.length, s2.length <= 100
    s1 and s2 consist of lowercase English letters.
    1 <= n1, n2 <= 106
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s1 = "acb";
        int n1 = 4;
        String s2 = "ab";
        int n2 = 2;
        int expected = 2;
        var result = solution.getMaxRepetitions(s1, n1, s2, n2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s1 = "acb";
        int n1 = 1;
        String s2 = "acb";
        int n2 = 1;
        int expected = 1;
        var result = solution.getMaxRepetitions(s1, n1, s2, n2);
        assertThat(result).isEqualTo(expected);
    }

}
