package com.blogspot.ostas.leetcode.all.easy.latest_time_by_replacing_hidden_digits;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: time = "2?:?0"
    Output: "23:50"
    Explanation: The latest hour beginning with the digit '2' is 23 and the latest minute ending with the digit '0' is 50.
    Example 2:
    Input: time = "0?:3?"
    Output: "09:39"
    Example 3:
    Input: time = "1?:22"
    Output: "19:22"
      Constraints:
    time is in the format hh:mm.
    It is guaranteed that you can produce a valid time from the given string.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String time = "2?:?0";
        String expected = "23:50";
        var result = solution.maximumTime(time);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String time = "0?:3?";
        String expected = "09:39";
        var result = solution.maximumTime(time);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String time = "1?:22";
        String expected = "19:22";
        var result = solution.maximumTime(time);
        assertThat(result).isEqualTo(expected);
    }

}
