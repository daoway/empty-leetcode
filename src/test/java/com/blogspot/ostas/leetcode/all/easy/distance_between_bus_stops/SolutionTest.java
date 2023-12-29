package com.blogspot.ostas.leetcode.all.easy.distance_between_bus_stops;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: distance = [1,2,3,4], start = 0, destination = 1
    Output: 1
    Explanation: Distance between 0 and 1 is 1 or 9, minimum is 1.
      Example 2:
    Input: distance = [1,2,3,4], start = 0, destination = 2
    Output: 3
    Explanation: Distance between 0 and 2 is 3 or 7, minimum is 3.
      Example 3:
    Input: distance = [1,2,3,4], start = 0, destination = 3
    Output: 4
    Explanation: Distance between 0 and 3 is 6 or 4, minimum is 4.
      Constraints:
    1 <= n <= 10^4
    distance.length == n
    0 <= start, destination < n
    0 <= distance[i] <= 10^4
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] distance = new int[]{1, 2, 3, 4};
        int start = 0;
        int destination = 1;
        int expected = 1;
        var result = solution.distanceBetweenBusStops(distance, start, destination);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] distance = new int[]{1, 2, 3, 4};
        int start = 0;
        int destination = 2;
        int expected = 3;
        var result = solution.distanceBetweenBusStops(distance, start, destination);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] distance = new int[]{1, 2, 3, 4};
        int start = 0;
        int destination = 3;
        int expected = 4;
        var result = solution.distanceBetweenBusStops(distance, start, destination);
        assertThat(result).isEqualTo(expected);
    }

}
