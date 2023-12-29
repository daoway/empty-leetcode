package com.blogspot.ostas.leetcode.all.easy.largest_triangle_area;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: points = [[0,0],[0,1],[1,0],[0,2],[2,0]]
    Output: 2.00000
    Explanation: The five points are shown in the above figure. The red triangle is the largest.
    Example 2:
    Input: points = [[1,0],[0,0],[0,1]]
    Output: 0.50000
      Constraints:
    3 <= points.length <= 50
    -50 <= xi, yi <= 50
    All the given points are unique.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] points = new int[][]{{0, 0}, {0, 1}, {1, 0}, {0, 2}, {2, 0}};
        double expected = 2.00000;
        var result = solution.largestTriangleArea(points);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] points = new int[][]{{1, 0}, {0, 0}, {0, 1}};
        double expected = 0.50000;
        var result = solution.largestTriangleArea(points);
        assertThat(result).isEqualTo(expected);
    }

}
