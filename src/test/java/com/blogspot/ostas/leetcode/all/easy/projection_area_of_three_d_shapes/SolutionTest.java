package com.blogspot.ostas.leetcode.all.easy.projection_area_of_three_d_shapes;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: grid = [[1,2],[3,4]]
    Output: 17
    Explanation: Here are the three projections ("shadows") of the shape made with each axis-aligned plane.
    Example 2:
    Input: grid = [[2]]
    Output: 5
    Example 3:
    Input: grid = [[1,0],[0,2]]
    Output: 8
      Constraints:
    n == grid.length == grid[i].length
    1 <= n <= 50
    0 <= grid[i][j] <= 50
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] grid = new int[][]{{1, 2}, {3, 4}};
        int expected = 17;
        var result = solution.projectionArea(grid);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] grid = new int[][]{{2}};
        int expected = 5;
        var result = solution.projectionArea(grid);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[][] grid = new int[][]{{1, 0}, {0, 2}};
        int expected = 8;
        var result = solution.projectionArea(grid);
        assertThat(result).isEqualTo(expected);
    }

}
