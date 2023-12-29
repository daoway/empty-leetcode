package com.blogspot.ostas.leetcode.all.medium.minimum_area_rectangle;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: points = [[1,1],[1,3],[3,1],[3,3],[2,2]]
    Output: 4
    Example 2:
    Input: points = [[1,1],[1,3],[3,1],[3,3],[4,1],[4,3]]
    Output: 2
      Constraints:
    1 <= points.length <= 500
    points[i].length == 2
    0 <= xi, yi <= 4 * 104
    All the given points are unique.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] points = new int[][]{{1, 1}, {1, 3}, {3, 1}, {3, 3}, {2, 2}};
        int expected = 4;
        var result = solution.minAreaRect(points);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] points = new int[][]{{1, 1}, {1, 3}, {3, 1}, {3, 3}, {4, 1}, {4, 3}};
        int expected = 2;
        var result = solution.minAreaRect(points);
        assertThat(result).isEqualTo(expected);
    }

}
