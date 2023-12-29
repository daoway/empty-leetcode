package com.blogspot.ostas.leetcode.all.medium.minimum_moves_to_spread_stones_over_grid;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: grid = [[1,1,0],[1,1,1],[1,2,1]]
    Output: 3
    Explanation: One possible sequence of moves to place one stone in each cell is:
    1- Move one stone from cell (2,1) to cell (2,2).
    2- Move one stone from cell (2,2) to cell (1,2).
    3- Move one stone from cell (1,2) to cell (0,2).
    In total, it takes 3 moves to place one stone in each cell of the grid.
    It can be shown that 3 is the minimum number of moves required to place one stone in each cell.
    Example 2:
    Input: grid = [[1,3,0],[1,0,0],[1,0,3]]
    Output: 4
    Explanation: One possible sequence of moves to place one stone in each cell is:
    1- Move one stone from cell (0,1) to cell (0,2).
    2- Move one stone from cell (0,1) to cell (1,1).
    3- Move one stone from cell (2,2) to cell (1,2).
    4- Move one stone from cell (2,2) to cell (2,1).
    In total, it takes 4 moves to place one stone in each cell of the grid.
    It can be shown that 4 is the minimum number of moves required to place one stone in each cell.
      Constraints:
    grid.length == grid[i].length == 3
    0 <= grid[i][j] <= 9
    Sum of grid is equal to 9.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] grid = new int[][]{{1, 1, 0}, {1, 1, 1}, {1, 2, 1}};
        int expected = 3;
        var result = solution.minimumMoves(grid);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] grid = new int[][]{{1, 3, 0}, {1, 0, 0}, {1, 0, 3}};
        int expected = 4;
        var result = solution.minimumMoves(grid);
        assertThat(result).isEqualTo(expected);
    }

}
