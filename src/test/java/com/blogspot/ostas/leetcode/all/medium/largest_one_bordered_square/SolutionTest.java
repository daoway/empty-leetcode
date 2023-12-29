package com.blogspot.ostas.leetcode.all.medium.largest_one_bordered_square;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: grid = [[1,1,1],[1,0,1],[1,1,1]]
    Output: 9
    Example 2:
    Input: grid = [[1,1,0,0]]
    Output: 1
      Constraints:
    1 <= grid.length <= 100
    1 <= grid[0].length <= 100
    grid[i][j] is 0 or 1
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] grid = new int[][]{{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        int expected = 9;
        var result = solution.largest1BorderedSquare(grid);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] grid = new int[][]{{1, 1, 0, 0}};
        int expected = 1;
        var result = solution.largest1BorderedSquare(grid);
        assertThat(result).isEqualTo(expected);
    }

}
