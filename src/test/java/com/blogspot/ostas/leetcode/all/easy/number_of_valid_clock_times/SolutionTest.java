package com.blogspot.ostas.leetcode.all.easy.number_of_valid_clock_times;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: time = "?5:00"
    Output: 2
    Explanation: We can replace the ? with either a 0 or 1, producing "05:00" or "15:00". Note that we cannot replace it with a 2, since the time "25:00" is invalid. In total, we have two choices.
    Example 2:
    Input: time = "0?:0?"
    Output: 100
    Explanation: Each ? can be replaced by any digit from 0 to 9, so we have 100 total choices.
    Example 3:
    Input: time = "??:??"
    Output: 1440
    Explanation: There are 24 possible choices for the hours, and 60 possible choices for the minutes. In total, we have 24 * 60 = 1440 choices.
      Constraints:
    time is a valid string of length 5 in the format "hh:mm".
    "00" <= hh <= "23"
    "00" <= mm <= "59"
    Some of the digits might be replaced with '?' and need to be replaced with digits from 0 to 9.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String time = "?5:00";
        int expected = 2;
        var result = solution.countTime(time);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String time = "0?:0?";
        int expected = 100;
        var result = solution.countTime(time);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String time = "??:??";
        int expected = 1440;
        var result = solution.countTime(time);
        assertThat(result).isEqualTo(expected);
    }

}
