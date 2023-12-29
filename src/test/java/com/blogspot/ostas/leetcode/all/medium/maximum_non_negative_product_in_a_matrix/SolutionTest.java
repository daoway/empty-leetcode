package com.blogspot.ostas.leetcode.all.medium.maximum_non_negative_product_in_a_matrix;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: grid = [[-1,-2,-3],[-2,-3,-3],[-3,-3,-2]]
    Output: -1
    Explanation: It is not possible to get non-negative product in the path from (0, 0) to (2, 2), so return -1.
    Example 2:
    Input: grid = [[1,-2,1],[1,-2,1],[3,-4,1]]
    Output: 8
    Explanation: Maximum non-negative product is shown (1 * 1 * -2 * -4 * 1 = 8).
    Example 3:
    Input: grid = [[1,3],[0,-4]]
    Output: 0
    Explanation: Maximum non-negative product is shown (1 * 0 * -4 = 0).
      Constraints:
    m == grid.length
    n == grid[i].length
    1 <= m, n <= 15
    -4 <= grid[i][j] <= 4
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] grid = new int[][]{{-1, -2, -3}, {-2, -3, -3}, {-3, -3, -2}};
        int expected = -1;
        var result = solution.maxProductPath(grid);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] grid = new int[][]{{1, -2, 1}, {1, -2, 1}, {3, -4, 1}};
        int expected = 8;
        var result = solution.maxProductPath(grid);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[][] grid = new int[][]{{1, 3}, {0, -4}};
        int expected = 0;
        var result = solution.maxProductPath(grid);
        assertThat(result).isEqualTo(expected);
    }

}
