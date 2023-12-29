package com.blogspot.ostas.leetcode.all.medium.minimum_number_of_arrows_to_burst_balloons;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: points = [[10,16],[2,8],[1,6],[7,12]]
    Output: 2
    Explanation: The balloons can be burst by 2 arrows:
    - Shoot an arrow at x = 6, bursting the balloons [2,8] and [1,6].
    - Shoot an arrow at x = 11, bursting the balloons [10,16] and [7,12].
    Example 2:
    Input: points = [[1,2],[3,4],[5,6],[7,8]]
    Output: 4
    Explanation: One arrow needs to be shot for each balloon for a total of 4 arrows.
    Example 3:
    Input: points = [[1,2],[2,3],[3,4],[4,5]]
    Output: 2
    Explanation: The balloons can be burst by 2 arrows:
    - Shoot an arrow at x = 2, bursting the balloons [1,2] and [2,3].
    - Shoot an arrow at x = 4, bursting the balloons [3,4] and [4,5].
      Constraints:
    1 <= points.length <= 105
    points[i].length == 2
    -231 <= xstart < xend <= 231 - 1
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] points = new int[][]{{10, 16}, {2, 8}, {1, 6}, {7, 12}};
        int expected = 2;
        var result = solution.findMinArrowShots(points);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] points = new int[][]{{1, 2}, {3, 4}, {5, 6}, {7, 8}};
        int expected = 4;
        var result = solution.findMinArrowShots(points);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[][] points = new int[][]{{1, 2}, {2, 3}, {3, 4}, {4, 5}};
        int expected = 2;
        var result = solution.findMinArrowShots(points);
        assertThat(result).isEqualTo(expected);
    }

}
