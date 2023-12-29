package com.blogspot.ostas.leetcode.all.easy.maximum_score_after_splitting_a_string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "011101"
    Output: 5
    Explanation:
    All possible ways of splitting s into two non-empty substrings are:
    left = "0" and right = "11101", score = 1 + 4 = 5
    left = "01" and right = "1101", score = 1 + 3 = 4
    left = "011" and right = "101", score = 1 + 2 = 3
    left = "0111" and right = "01", score = 1 + 1 = 2
    left = "01110" and right = "1", score = 2 + 1 = 3
    Example 2:
    Input: s = "00111"
    Output: 5
    Explanation: When left = "00" and right = "111", we get the maximum score = 2 + 3 = 5
    Example 3:
    Input: s = "1111"
    Output: 3
      Constraints:
    2 <= s.length <= 500
    The string s consists of characters '0' and '1' only.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "011101";
        int expected = 5;
        var result = solution.maxScore(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "00111";
        int expected = 5;
        var result = solution.maxScore(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "1111";
        int expected = 3;
        var result = solution.maxScore(s);
        assertThat(result).isEqualTo(expected);
    }

}
