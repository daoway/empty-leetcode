package com.blogspot.ostas.leetcode.all.medium.magic_squares_in_grid;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: grid = [[4,3,8,4],[9,5,1,9],[2,7,6,2]]
    Output: 1
    Explanation:
    The following subgrid is a 3 x 3 magic square:
    while this one is not:
    In total, there is only one magic square inside the given grid.
    Example 2:
    Input: grid = [[8]]
    Output: 0
      Constraints:
    row == grid.length
    col == grid[i].length
    1 <= row, col <= 10
    0 <= grid[i][j] <= 15
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] grid = new int[][]{{4, 3, 8, 4}, {9, 5, 1, 9}, {2, 7, 6, 2}};
        int expected = 1;
        var result = solution.numMagicSquaresInside(grid);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] grid = new int[][]{{8}};
        int expected = 0;
        var result = solution.numMagicSquaresInside(grid);
        assertThat(result).isEqualTo(expected);
    }

}
