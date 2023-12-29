package com.blogspot.ostas.leetcode.all.medium.minimum_area_rectangle_ii;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: points = [[1,2],[2,1],[1,0],[0,1]]
    Output: 2.00000
    Explanation: The minimum area rectangle occurs at [1,2],[2,1],[1,0],[0,1], with an area of 2.
    Example 2:
    Input: points = [[0,1],[2,1],[1,1],[1,0],[2,0]]
    Output: 1.00000
    Explanation: The minimum area rectangle occurs at [1,0],[1,1],[2,1],[2,0], with an area of 1.
    Example 3:
    Input: points = [[0,3],[1,2],[3,1],[1,3],[2,1]]
    Output: 0
    Explanation: There is no possible rectangle to form from these points.
      Constraints:
    1 <= points.length <= 50
    points[i].length == 2
    0 <= xi, yi <= 4 * 104
    All the given points are unique.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] points = new int[][]{{1, 2}, {2, 1}, {1, 0}, {0, 1}};
        double expected = 2.00000;
        var result = solution.minAreaFreeRect(points);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] points = new int[][]{{0, 1}, {2, 1}, {1, 1}, {1, 0}, {2, 0}};
        double expected = 1.00000;
        var result = solution.minAreaFreeRect(points);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[][] points = new int[][]{{0, 3}, {1, 2}, {3, 1}, {1, 3}, {2, 1}};
        double expected = 0;
        var result = solution.minAreaFreeRect(points);
        assertThat(result).isEqualTo(expected);
    }

}
