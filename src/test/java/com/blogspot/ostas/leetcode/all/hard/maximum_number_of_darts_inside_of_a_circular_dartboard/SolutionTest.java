package com.blogspot.ostas.leetcode.all.hard.maximum_number_of_darts_inside_of_a_circular_dartboard;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: darts = [[-2,0],[2,0],[0,2],[0,-2]], r = 2
    Output: 4
    Explanation: Circle dartboard with center in (0,0) and radius = 2 contain all points.
    Example 2:
    Input: darts = [[-3,0],[3,0],[2,6],[5,4],[0,9],[7,8]], r = 5
    Output: 5
    Explanation: Circle dartboard with center in (0,4) and radius = 5 contain all points except the point (7,8).
      Constraints:
    1 <= darts.length <= 100
    darts[i].length == 2
    -104 <= xi, yi <= 104
    All the darts are unique
    1 <= r <= 5000
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] darts = new int[][]{{-2, 0}, {2, 0}, {0, 2}, {0, -2}};
        int r = 2;
        int expected = 4;
        var result = solution.numPoints(darts, r);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] darts = new int[][]{{-3, 0}, {3, 0}, {2, 6}, {5, 4}, {0, 9}, {7, 8}};
        int r = 5;
        int expected = 5;
        var result = solution.numPoints(darts, r);
        assertThat(result).isEqualTo(expected);
    }

}
