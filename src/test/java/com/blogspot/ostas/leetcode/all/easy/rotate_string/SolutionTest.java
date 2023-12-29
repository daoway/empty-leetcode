package com.blogspot.ostas.leetcode.all.easy.rotate_string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "abcde", goal = "cdeab"
    Output: true
    Example 2:
    Input: s = "abcde", goal = "abced"
    Output: false
      Constraints:
    1 <= s.length, goal.length <= 100
    s and goal consist of lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "abcde";
        String goal = "cdeab";
        boolean expected = true;
        var result = solution.rotateString(s, goal);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "abcde";
        String goal = "abced";
        boolean expected = false;
        var result = solution.rotateString(s, goal);
        assertThat(result).isEqualTo(expected);
    }

}
