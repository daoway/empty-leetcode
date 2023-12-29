package com.blogspot.ostas.leetcode.all.medium.shortest_path_in_binary_matrix;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: grid = [[0,1],[1,0]]
    Output: 2
    Example 2:
    Input: grid = [[0,0,0],[1,1,0],[1,1,0]]
    Output: 4
    Example 3:
    Input: grid = [[1,0,0],[1,1,0],[1,1,0]]
    Output: -1
      Constraints:
    n == grid.length
    n == grid[i].length
    1 <= n <= 100
    grid[i][j] is 0 or 1
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] grid = new int[][]{{0, 1}, {1, 0}};
        int expected = 2;
        var result = solution.shortestPathBinaryMatrix(grid);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] grid = new int[][]{{0, 0, 0}, {1, 1, 0}, {1, 1, 0}};
        int expected = 4;
        var result = solution.shortestPathBinaryMatrix(grid);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[][] grid = new int[][]{{1, 0, 0}, {1, 1, 0}, {1, 1, 0}};
        int expected = -1;
        var result = solution.shortestPathBinaryMatrix(grid);
        assertThat(result).isEqualTo(expected);
    }

}
