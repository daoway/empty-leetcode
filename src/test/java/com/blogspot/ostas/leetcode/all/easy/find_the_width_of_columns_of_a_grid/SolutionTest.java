package com.blogspot.ostas.leetcode.all.easy.find_the_width_of_columns_of_a_grid;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: grid = [[1],[22],[333]]
    Output: [3]
    Explanation: In the 0th column, 333 is of length 3.
    Example 2:
    Input: grid = [[-15,1,3],[15,7,12],[5,6,-2]]
    Output: [3,1,2]
    Explanation:
    In the 0th column, only -15 is of length 3.
    In the 1st column, all integers are of length 1.
    In the 2nd column, both 12 and -2 are of length 2.
      Constraints:
    m == grid.length
    n == grid[i].length
    1 <= m, n <= 100
    -109 <= grid[r][c] <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] grid = new int[][]{{1}, {22}, {333}};
        int[] expected = new int[]{3};
        var result = solution.findColumnWidth(grid);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] grid = new int[][]{{-15, 1, 3}, {15, 7, 12}, {5, 6, -2}};
        int[] expected = new int[]{3, 1, 2};
        var result = solution.findColumnWidth(grid);
        assertThat(result).isEqualTo(expected);
    }

}
