package com.blogspot.ostas.leetcode.all.hard.stamping_the_grid;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: grid = [[1,0,0,0],[1,0,0,0],[1,0,0,0],[1,0,0,0],[1,0,0,0]], stampHeight = 4, stampWidth = 3
    Output: true
    Explanation: We have two overlapping stamps (labeled 1 and 2 in the image) that are able to cover all the empty cells.
    Example 2:
    Input: grid = [[1,0,0,0],[0,1,0,0],[0,0,1,0],[0,0,0,1]], stampHeight = 2, stampWidth = 2
    Output: false
    Explanation: There is no way to fit the stamps onto all the empty cells without the stamps going outside the grid.
      Constraints:
    m == grid.length
    n == grid[r].length
    1 <= m, n <= 105
    1 <= m * n <= 2 * 105
    grid[r][c] is either 0 or 1.
    1 <= stampHeight, stampWidth <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] grid =
                new int[][]{{1, 0, 0, 0}, {1, 0, 0, 0}, {1, 0, 0, 0}, {1, 0, 0, 0}, {1, 0, 0, 0}};
        int stampHeight = 4;
        int stampWidth = 3;
        boolean expected = true;
        var result = solution.possibleToStamp(grid, stampHeight, stampWidth);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] grid = new int[][]{{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 1, 0}, {0, 0, 0, 1}};
        int stampHeight = 2;
        int stampWidth = 2;
        boolean expected = false;
        var result = solution.possibleToStamp(grid, stampHeight, stampWidth);
        assertThat(result).isEqualTo(expected);
    }

}
