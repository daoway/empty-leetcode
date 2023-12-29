package com.blogspot.ostas.leetcode.all.medium.minimum_swaps_to_arrange_a_binary_grid;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: grid = [[0,0,1],[1,1,0],[1,0,0]]
    Output: 3
    Example 2:
    Input: grid = [[0,1,1,0],[0,1,1,0],[0,1,1,0],[0,1,1,0]]
    Output: -1
    Explanation: All rows are similar, swaps have no effect on the grid.
    Example 3:
    Input: grid = [[1,0,0],[1,1,0],[1,1,1]]
    Output: 0
      Constraints:
    n == grid.length == grid[i].length
    1 <= n <= 200
    grid[i][j] is either 0 or 1
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] grid = new int[][]{{0, 0, 1}, {1, 1, 0}, {1, 0, 0}};
        int expected = 3;
        var result = solution.minSwaps(grid);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] grid = new int[][]{{0, 1, 1, 0}, {0, 1, 1, 0}, {0, 1, 1, 0}, {0, 1, 1, 0}};
        int expected = -1;
        var result = solution.minSwaps(grid);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[][] grid = new int[][]{{1, 0, 0}, {1, 1, 0}, {1, 1, 1}};
        int expected = 0;
        var result = solution.minSwaps(grid);
        assertThat(result).isEqualTo(expected);
    }

}
