package com.blogspot.ostas.leetcode.all.medium.coloring_a_border;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: grid = [[1,1],[1,2]], row = 0, col = 0, color = 3
    Output: [[3,3],[3,2]]
    Example 2:
    Input: grid = [[1,2,2],[2,3,2]], row = 0, col = 1, color = 3
    Output: [[1,3,3],[2,3,3]]
    Example 3:
    Input: grid = [[1,1,1],[1,1,1],[1,1,1]], row = 1, col = 1, color = 2
    Output: [[2,2,2],[2,1,2],[2,2,2]]
      Constraints:
    m == grid.length
    n == grid[i].length
    1 <= m, n <= 50
    1 <= grid[i][j], color <= 1000
    0 <= row < m
    0 <= col < n
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] grid = new int[][]{{1, 1}, {1, 2}};
        int row = 0;
        int col = 0;
        int color = 3;
        int[][] expected = new int[][]{{3, 3}, {3, 2}};
        var result = solution.colorBorder(grid, row, col, color);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] grid = new int[][]{{1, 2, 2}, {2, 3, 2}};
        int row = 0;
        int col = 1;
        int color = 3;
        int[][] expected = new int[][]{{1, 3, 3}, {2, 3, 3}};
        var result = solution.colorBorder(grid, row, col, color);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[][] grid = new int[][]{{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};
        int row = 1;
        int col = 1;
        int color = 2;
        int[][] expected = new int[][]{{2, 2, 2}, {2, 1, 2}, {2, 2, 2}};
        var result = solution.colorBorder(grid, row, col, color);
        assertThat(result).isEqualTo(expected);
    }

}
