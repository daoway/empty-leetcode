package com.blogspot.ostas.leetcode.all.hard.minimum_number_of_visited_cells_in_a_grid;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: grid = [[3,4,2,1],[4,2,3,1],[2,1,0,0],[2,4,0,0]]
    Output: 4
    Explanation: The image above shows one of the paths that visits exactly 4 cells.
    Example 2:
    Input: grid = [[3,4,2,1],[4,2,1,1],[2,1,1,0],[3,4,1,0]]
    Output: 3
    Explanation: The image above shows one of the paths that visits exactly 3 cells.
    Example 3:
    Input: grid = [[2,1,0],[1,0,0]]
    Output: -1
    Explanation: It can be proven that no path exists.
      Constraints:
    m == grid.length
    n == grid[i].length
    1 <= m, n <= 105
    1 <= m * n <= 105
    0 <= grid[i][j] < m * n
    grid[m - 1][n - 1] == 0
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] grid = new int[][]{{3, 4, 2, 1}, {4, 2, 3, 1}, {2, 1, 0, 0}, {2, 4, 0, 0}};
        int expected = 4;
        var result = solution.minimumVisitedCells(grid);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] grid = new int[][]{{3, 4, 2, 1}, {4, 2, 1, 1}, {2, 1, 1, 0}, {3, 4, 1, 0}};
        int expected = 3;
        var result = solution.minimumVisitedCells(grid);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[][] grid = new int[][]{{2, 1, 0}, {1, 0, 0}};
        int expected = -1;
        var result = solution.minimumVisitedCells(grid);
        assertThat(result).isEqualTo(expected);
    }

}
