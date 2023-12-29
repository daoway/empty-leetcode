package com.blogspot.ostas.leetcode.all.medium.maximum_number_of_moves_in_a_grid;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: grid = [[2,4,3,5],[5,4,9,3],[3,4,2,11],[10,9,13,15]]
    Output: 3
    Explanation: We can start at the cell (0, 0) and make the following moves:
    - (0, 0) -> (0, 1).
    - (0, 1) -> (1, 2).
    - (1, 2) -> (2, 3).
    It can be shown that it is the maximum number of moves that can be made.
    Example 2:
    Input: grid = [[3,2,4],[2,1,9],[1,1,7]]
    Output: 0
    Explanation: Starting from any cell in the first column we cannot perform any moves.
      Constraints:
    m == grid.length
    n == grid[i].length
    2 <= m, n <= 1000
    4 <= m * n <= 105
    1 <= grid[i][j] <= 106
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] grid = new int[][]{{2, 4, 3, 5}, {5, 4, 9, 3}, {3, 4, 2, 11}, {10, 9, 13, 15}};
        int expected = 3;
        var result = solution.maxMoves(grid);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] grid = new int[][]{{3, 2, 4}, {2, 1, 9}, {1, 1, 7}};
        int expected = 0;
        var result = solution.maxMoves(grid);
        assertThat(result).isEqualTo(expected);
    }

}
