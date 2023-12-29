package com.blogspot.ostas.leetcode.all.medium.maximum_sum_of_an_hourglass;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: grid = [[6,2,1,3],[4,2,1,5],[9,2,8,7],[4,1,2,9]]
    Output: 30
    Explanation: The cells shown above represent the hourglass with the maximum sum: 6 + 2 + 1 + 2 + 9 + 2 + 8 = 30.
    Example 2:
    Input: grid = [[1,2,3],[4,5,6],[7,8,9]]
    Output: 35
    Explanation: There is only one hourglass in the matrix, with the sum: 1 + 2 + 3 + 5 + 7 + 8 + 9 = 35.
      Constraints:
    m == grid.length
    n == grid[i].length
    3 <= m, n <= 150
    0 <= grid[i][j] <= 106
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] grid = new int[][]{{6, 2, 1, 3}, {4, 2, 1, 5}, {9, 2, 8, 7}, {4, 1, 2, 9}};
        int expected = 30;
        var result = solution.maxSum(grid);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] grid = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int expected = 35;
        var result = solution.maxSum(grid);
        assertThat(result).isEqualTo(expected);
    }

}
