package com.blogspot.ostas.leetcode.all.hard.minimum_falling_path_sum_ii;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: grid = [[1,2,3],[4,5,6],[7,8,9]]
    Output: 13
    Explanation:
    The possible falling paths are:
    [1,5,9], [1,5,7], [1,6,7], [1,6,8],
    [2,4,8], [2,4,9], [2,6,7], [2,6,8],
    [3,4,8], [3,4,9], [3,5,7], [3,5,9]
    The falling path with the smallest sum is [1,5,7], so the answer is 13.
    Example 2:
    Input: grid = [[7]]
    Output: 7
      Constraints:
    n == grid.length == grid[i].length
    1 <= n <= 200
    -99 <= grid[i][j] <= 99
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] grid = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int expected = 13;
        var result = solution.minFallingPathSum(grid);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] grid = new int[][]{{7}};
        int expected = 7;
        var result = solution.minFallingPathSum(grid);
        assertThat(result).isEqualTo(expected);
    }

}
