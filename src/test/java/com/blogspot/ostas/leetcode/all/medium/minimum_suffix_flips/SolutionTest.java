package com.blogspot.ostas.leetcode.all.medium.minimum_suffix_flips;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: target = "10111"
    Output: 3
    Explanation: Initially, s = "00000".
    Choose index i = 2: "00000" -> "00111"
    Choose index i = 0: "00111" -> "11000"
    Choose index i = 1: "11000" -> "10111"
    We need at least 3 flip operations to form target.
    Example 2:
    Input: target = "101"
    Output: 3
    Explanation: Initially, s = "000".
    Choose index i = 0: "000" -> "111"
    Choose index i = 1: "111" -> "100"
    Choose index i = 2: "100" -> "101"
    We need at least 3 flip operations to form target.
    Example 3:
    Input: target = "00000"
    Output: 0
    Explanation: We do not need any operations since the initial s already equals target.
      Constraints:
    n == target.length
    1 <= n <= 105
    target[i] is either '0' or '1'.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String target = "10111";
        int expected = 3;
        var result = solution.minFlips(target);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String target = "101";
        int expected = 3;
        var result = solution.minFlips(target);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String target = "00000";
        int expected = 0;
        var result = solution.minFlips(target);
        assertThat(result).isEqualTo(expected);
    }

}
