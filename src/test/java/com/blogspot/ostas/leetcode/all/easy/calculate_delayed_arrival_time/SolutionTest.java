package com.blogspot.ostas.leetcode.all.easy.calculate_delayed_arrival_time;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: arrivalTime = 15, delayedTime = 5
    Output: 20
    Explanation: Arrival time of the train was 15:00 hours. It is delayed by 5 hours. Now it will reach at 15+5 = 20 (20:00 hours).
    Example 2:
    Input: arrivalTime = 13, delayedTime = 11
    Output: 0
    Explanation: Arrival time of the train was 13:00 hours. It is delayed by 11 hours. Now it will reach at 13+11=24 (Which is denoted by 00:00 in 24 hours format so return 0).
      Constraints:
    1 <= arrivaltime < 24
    1 <= delayedTime <= 24
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int arrivalTime = 15;
        int delayedTime = 5;
        int expected = 20;
        var result = solution.findDelayedArrivalTime(arrivalTime, delayedTime);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int arrivalTime = 13;
        int delayedTime = 11;
        int expected = 0;
        var result = solution.findDelayedArrivalTime(arrivalTime, delayedTime);
        assertThat(result).isEqualTo(expected);
    }

}
