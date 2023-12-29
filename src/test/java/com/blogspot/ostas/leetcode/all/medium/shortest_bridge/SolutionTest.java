package com.blogspot.ostas.leetcode.all.medium.shortest_bridge;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: grid = [[0,1],[1,0]]
    Output: 1
    Example 2:
    Input: grid = [[0,1,0],[0,0,0],[0,0,1]]
    Output: 2
    Example 3:
    Input: grid = [[1,1,1,1,1],[1,0,0,0,1],[1,0,1,0,1],[1,0,0,0,1],[1,1,1,1,1]]
    Output: 1
      Constraints:
    n == grid.length == grid[i].length
    2 <= n <= 100
    grid[i][j] is either 0 or 1.
    There are exactly two islands in grid.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] grid = new int[][]{{0, 1}, {1, 0}};
        int expected = 1;
        var result = solution.shortestBridge(grid);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] grid = new int[][]{{0, 1, 0}, {0, 0, 0}, {0, 0, 1}};
        int expected = 2;
        var result = solution.shortestBridge(grid);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[][] grid = new int[][]{{1, 1, 1, 1, 1}, {1, 0, 0, 0, 1}, {1, 0, 1, 0, 1}, {1, 0, 0, 0, 1},
                {1, 1, 1, 1, 1}};
        int expected = 1;
        var result = solution.shortestBridge(grid);
        assertThat(result).isEqualTo(expected);
    }

}
