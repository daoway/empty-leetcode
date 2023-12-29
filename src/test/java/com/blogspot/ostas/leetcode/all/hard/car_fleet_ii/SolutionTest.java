package com.blogspot.ostas.leetcode.all.hard.car_fleet_ii;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: cars = [[1,2],[2,1],[4,3],[7,2]]
    Output: [1.00000,-1.00000,3.00000,-1.00000]
    Explanation: After exactly one second, the first car will collide with the second car, and form a car fleet with speed 1 m/s. After exactly 3 seconds, the third car will collide with the fourth car, and form a car fleet with speed 2 m/s.
    Example 2:
    Input: cars = [[3,4],[5,4],[6,3],[9,1]]
    Output: [2.00000,1.00000,1.50000,-1.00000]
      Constraints:
    1 <= cars.length <= 105
    1 <= positioni, speedi <= 106
    positioni < positioni+1
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] cars = new int[][]{{1, 2}, {2, 1}, {4, 3}, {7, 2}};
        double[] expected = new double[]{1.00000, -1.00000, 3.00000, -1.00000};
        var result = solution.getCollisionTimes(cars);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] cars = new int[][]{{3, 4}, {5, 4}, {6, 3}, {9, 1}};
        double[] expected = new double[]{2.00000, 1.00000, 1.50000, -1.00000};
        var result = solution.getCollisionTimes(cars);
        assertThat(result).isEqualTo(expected);
    }

}
