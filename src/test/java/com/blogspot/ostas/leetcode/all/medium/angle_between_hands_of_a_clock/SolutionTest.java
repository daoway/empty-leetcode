package com.blogspot.ostas.leetcode.all.medium.angle_between_hands_of_a_clock;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: hour = 12, minutes = 30
    Output: 165
    Example 2:
    Input: hour = 3, minutes = 30
    Output: 75
    Example 3:
    Input: hour = 3, minutes = 15
    Output: 7.5
      Constraints:
    1 <= hour <= 12
    0 <= minutes <= 59
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int hour = 12;
        int minutes = 30;
        double expected = 165;
        var result = solution.angleClock(hour, minutes);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int hour = 3;
        int minutes = 30;
        double expected = 75;
        var result = solution.angleClock(hour, minutes);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int hour = 3;
        int minutes = 15;
        double expected = 7.5;
        var result = solution.angleClock(hour, minutes);
        assertThat(result).isEqualTo(expected);
    }

}
