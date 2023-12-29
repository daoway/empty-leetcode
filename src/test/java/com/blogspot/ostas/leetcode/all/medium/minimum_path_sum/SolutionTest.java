package com.blogspot.ostas.leetcode.all.medium.minimum_path_sum;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: grid = [[1,3,1],[1,5,1],[4,2,1]]
    Output: 7
    Explanation: Because the path 1 → 3 → 1 → 1 → 1 minimizes the sum.
    Example 2:
    Input: grid = [[1,2,3],[4,5,6]]
    Output: 12
      Constraints:
    m == grid.length
    n == grid[i].length
    1 <= m, n <= 200
    0 <= grid[i][j] <= 200
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] grid = new int[][]{{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        int expected = 7;
        var result = solution.minPathSum(grid);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] grid = new int[][]{{1, 2, 3}, {4, 5, 6}};
        int expected = 12;
        var result = solution.minPathSum(grid);
        assertThat(result).isEqualTo(expected);
    }

}
