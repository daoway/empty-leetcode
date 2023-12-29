package com.blogspot.ostas.leetcode.all.medium.pairs_of_songs_with_total_durations_divisible_by_six_zero_;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: time = [30,20,150,100,40]
    Output: 3
    Explanation: Three pairs have a total duration divisible by 60:
    (time[0] = 30, time[2] = 150): total duration 180
    (time[1] = 20, time[3] = 100): total duration 120
    (time[1] = 20, time[4] = 40): total duration 60
    Example 2:
    Input: time = [60,60,60]
    Output: 3
    Explanation: All three pairs have a total duration of 120, which is divisible by 60.
      Constraints:
    1 <= time.length <= 6 * 104
    1 <= time[i] <= 500
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] time = new int[]{30, 20, 150, 100, 40};
        int expected = 3;
        var result = solution.numPairsDivisibleBy60(time);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] time = new int[]{60, 60, 60};
        int expected = 3;
        var result = solution.numPairsDivisibleBy60(time);
        assertThat(result).isEqualTo(expected);
    }

}
