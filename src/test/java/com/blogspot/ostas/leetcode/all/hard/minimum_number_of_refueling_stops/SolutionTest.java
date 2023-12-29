package com.blogspot.ostas.leetcode.all.hard.minimum_number_of_refueling_stops;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: target = 1, startFuel = 1, stations = []
    Output: 0
    Explanation: We can reach the target without refueling.
    Example 2:
    Input: target = 100, startFuel = 1, stations = [[10,100]]
    Output: -1
    Explanation: We can not reach the target (or even the first gas station).
    Example 3:
    Input: target = 100, startFuel = 10, stations = [[10,60],[20,30],[30,30],[60,40]]
    Output: 2
    Explanation: We start with 10 liters of fuel.
    We drive to position 10, expending 10 liters of fuel.  We refuel from 0 liters to 60 liters of gas.
    Then, we drive from position 10 to position 60 (expending 50 liters of fuel),
    and refuel from 10 liters to 50 liters of gas.  We then drive to and reach the target.
    We made 2 refueling stops along the way, so we return 2.
      Constraints:
    1 <= target, startFuel <= 109
    0 <= stations.length <= 500
    1 <= positioni < positioni+1 < target
    1 <= fueli < 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int target = 1;
        int startFuel = 1;
        int[][] stations = new int[][]{};
        int expected = 0;
        var result = solution.minRefuelStops(target, startFuel, stations);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int target = 100;
        int startFuel = 1;
        int[][] stations = new int[][]{{10, 100}};
        int expected = -1;
        var result = solution.minRefuelStops(target, startFuel, stations);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int target = 100;
        int startFuel = 10;
        int[][] stations = new int[][]{{10, 60}, {20, 30}, {30, 30}, {60, 40}};
        int expected = 2;
        var result = solution.minRefuelStops(target, startFuel, stations);
        assertThat(result).isEqualTo(expected);
    }

}
