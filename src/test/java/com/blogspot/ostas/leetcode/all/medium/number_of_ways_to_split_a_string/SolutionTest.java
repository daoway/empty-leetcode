package com.blogspot.ostas.leetcode.all.medium.number_of_ways_to_split_a_string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "10101"
    Output: 4
    Explanation: There are four ways to split s in 3 parts where each part contain the same number of letters '1'.
    "1|010|1"
    "1|01|01"
    "10|10|1"
    "10|1|01"
    Example 2:
    Input: s = "1001"
    Output: 0
    Example 3:
    Input: s = "0000"
    Output: 3
    Explanation: There are three ways to split s in 3 parts.
    "0|0|00"
    "0|00|0"
    "00|0|0"
      Constraints:
    3 <= s.length <= 105
    s[i] is either '0' or '1'.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "10101";
        int expected = 4;
        var result = solution.numWays(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "1001";
        int expected = 0;
        var result = solution.numWays(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "0000";
        int expected = 3;
        var result = solution.numWays(s);
        assertThat(result).isEqualTo(expected);
    }

}
