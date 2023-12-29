package com.blogspot.ostas.leetcode.all.medium.minimum_time_difference;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: timePoints = ["23:59","00:00"]
    Output: 1
    Example 2:
    Input: timePoints = ["00:00","23:59","00:00"]
    Output: 0
      Constraints:
    2 <= timePoints.length <= 2 * 104
    timePoints[i] is in the format "HH:MM".
    */
    @Test
    void example_0() {
        var solution = new Solution();
        List<String> timePoints = List.of("23:59", "00:00");
        int expected = 1;
        var result = solution.findMinDifference(timePoints);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        List<String> timePoints = List.of("00:00", "23:59", "00:00");
        int expected = 0;
        var result = solution.findMinDifference(timePoints);
        assertThat(result).isEqualTo(expected);
    }

}
