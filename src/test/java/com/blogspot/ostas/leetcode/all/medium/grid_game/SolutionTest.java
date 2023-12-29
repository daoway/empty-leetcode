package com.blogspot.ostas.leetcode.all.medium.grid_game;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: grid = [[2,5,4],[1,5,1]]
    Output: 4
    Explanation: The optimal path taken by the first robot is shown in red, and the optimal path taken by the second robot is shown in blue.
    The cells visited by the first robot are set to 0.
    The second robot will collect 0 + 0 + 4 + 0 = 4 points.
    Example 2:
    Input: grid = [[3,3,1],[8,5,2]]
    Output: 4
    Explanation: The optimal path taken by the first robot is shown in red, and the optimal path taken by the second robot is shown in blue.
    The cells visited by the first robot are set to 0.
    The second robot will collect 0 + 3 + 1 + 0 = 4 points.
    Example 3:
    Input: grid = [[1,3,1,15],[1,3,3,1]]
    Output: 7
    Explanation: The optimal path taken by the first robot is shown in red, and the optimal path taken by the second robot is shown in blue.
    The cells visited by the first robot are set to 0.
    The second robot will collect 0 + 1 + 3 + 3 + 0 = 7 points.
      Constraints:
    grid.length == 2
    n == grid[r].length
    1 <= n <= 5 * 104
    1 <= grid[r][c] <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] grid = new int[][]{{2, 5, 4}, {1, 5, 1}};
        long expected = 4;
        var result = solution.gridGame(grid);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] grid = new int[][]{{3, 3, 1}, {8, 5, 2}};
        long expected = 4;
        var result = solution.gridGame(grid);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[][] grid = new int[][]{{1, 3, 1, 15}, {1, 3, 3, 1}};
        long expected = 7;
        var result = solution.gridGame(grid);
        assertThat(result).isEqualTo(expected);
    }

}
