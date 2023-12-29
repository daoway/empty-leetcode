package com.blogspot.ostas.leetcode.all.medium.check_knight_tour_configuration;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: grid = [[0,11,16,5,20],[17,4,19,10,15],[12,1,8,21,6],[3,18,23,14,9],[24,13,2,7,22]]
    Output: true
    Explanation: The above diagram represents the grid. It can be shown that it is a valid configuration.
    Example 2:
    Input: grid = [[0,3,6],[5,8,1],[2,7,4]]
    Output: false
    Explanation: The above diagram represents the grid. The 8th move of the knight is not valid considering its position after the 7th move.
      Constraints:
    n == grid.length == grid[i].length
    3 <= n <= 7
    0 <= grid[row][col] < n * n
    All integers in grid are unique.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] grid = new int[][]{{0, 11, 16, 5, 20}, {17, 4, 19, 10, 15}, {12, 1, 8, 21, 6},
                {3, 18, 23, 14, 9}, {24, 13, 2, 7, 22}};
        boolean expected = true;
        var result = solution.checkValidGrid(grid);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] grid = new int[][]{{0, 3, 6}, {5, 8, 1}, {2, 7, 4}};
        boolean expected = false;
        var result = solution.checkValidGrid(grid);
        assertThat(result).isEqualTo(expected);
    }

}
