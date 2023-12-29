package com.blogspot.ostas.leetcode.all.medium.maximum_trailing_zeros_in_a_cornered_path;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: grid = [[23,17,15,3,20],[8,1,20,27,11],[9,4,6,2,21],[40,9,1,10,6],[22,7,4,5,3]]
    Output: 3
    Explanation: The grid on the left shows a valid cornered path.
    It has a product of 15 * 20 * 6 * 1 * 10 = 18000 which has 3 trailing zeros.
    It can be shown that this is the maximum trailing zeros in the product of a cornered path.

    The grid in the middle is not a cornered path as it has more than one turn.
    The grid on the right is not a cornered path as it requires a return to a previously visited cell.
    Example 2:
    Input: grid = [[4,3,2],[7,6,1],[8,8,8]]
    Output: 0
    Explanation: The grid is shown in the figure above.
    There are no cornered paths in the grid that result in a product with a trailing zero.
      Constraints:
    m == grid.length
    n == grid[i].length
    1 <= m, n <= 105
    1 <= m * n <= 105
    1 <= grid[i][j] <= 1000
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] grid = new int[][]{{23, 17, 15, 3, 20}, {8, 1, 20, 27, 11}, {9, 4, 6, 2, 21},
                {40, 9, 1, 10, 6}, {22, 7, 4, 5, 3}};
        int expected = 3;
        var result = solution.maxTrailingZeros(grid);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] grid = new int[][]{{4, 3, 2}, {7, 6, 1}, {8, 8, 8}};
        int expected = 0;
        var result = solution.maxTrailingZeros(grid);
        assertThat(result).isEqualTo(expected);
    }

}
