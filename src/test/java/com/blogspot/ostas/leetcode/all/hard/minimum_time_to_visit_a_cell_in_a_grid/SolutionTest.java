package com.blogspot.ostas.leetcode.all.hard.minimum_time_to_visit_a_cell_in_a_grid;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: grid = [[0,1,3,2],[5,1,2,5],[4,3,8,6]]
    Output: 7
    Explanation: One of the paths that we can take is the following:
    - at t = 0, we are on the cell (0,0).
    - at t = 1, we move to the cell (0,1). It is possible because grid[0][1] <= 1.
    - at t = 2, we move to the cell (1,1). It is possible because grid[1][1] <= 2.
    - at t = 3, we move to the cell (1,2). It is possible because grid[1][2] <= 3.
    - at t = 4, we move to the cell (1,1). It is possible because grid[1][1] <= 4.
    - at t = 5, we move to the cell (1,2). It is possible because grid[1][2] <= 5.
    - at t = 6, we move to the cell (1,3). It is possible because grid[1][3] <= 6.
    - at t = 7, we move to the cell (2,3). It is possible because grid[2][3] <= 7.
    The final time is 7. It can be shown that it is the minimum time possible.
    Example 2:
    Input: grid = [[0,2,4],[3,2,1],[1,0,4]]
    Output: -1
    Explanation: There is no path from the top left to the bottom-right cell.
      Constraints:
    m == grid.length
    n == grid[i].length
    2 <= m, n <= 1000
    4 <= m * n <= 105
    0 <= grid[i][j] <= 105
    grid[0][0] == 0
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] grid = new int[][]{{0, 1, 3, 2}, {5, 1, 2, 5}, {4, 3, 8, 6}};
        int expected = 7;
        var result = solution.minimumTime(grid);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] grid = new int[][]{{0, 2, 4}, {3, 2, 1}, {1, 0, 4}};
        int expected = -1;
        var result = solution.minimumTime(grid);
        assertThat(result).isEqualTo(expected);
    }

}
