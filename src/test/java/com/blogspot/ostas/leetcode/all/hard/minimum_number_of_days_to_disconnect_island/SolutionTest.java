package com.blogspot.ostas.leetcode.all.hard.minimum_number_of_days_to_disconnect_island;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: grid = [[0,1,1,0],[0,1,1,0],[0,0,0,0]]

    Output: 2
    Explanation: We need at least 2 days to get a disconnected grid.
    Change land grid[1][1] and grid[0][2] to water and get 2 disconnected island.
    Example 2:
    Input: grid = [[1,1]]
    Output: 2
    Explanation: Grid of full water is also disconnected ([[1,1]] -> [[0,0]]), 0 islands.
      Constraints:
    m == grid.length
    n == grid[i].length
    1 <= m, n <= 30
    grid[i][j] is either 0 or 1.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] grid = new int[][]{{0, 1, 1, 0}, {0, 1, 1, 0}, {0, 0, 0, 0}};
        int expected = 2;
        var result = solution.minDays(grid);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] grid = new int[][]{{1, 1}};
        int expected = 2;
        var result = solution.minDays(grid);
        assertThat(result).isEqualTo(expected);
    }

}
