package com.blogspot.ostas.leetcode.all.easy.surface_area_of_three_d_shapes;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: grid = [[1,2],[3,4]]
    Output: 34
    Example 2:
    Input: grid = [[1,1,1],[1,0,1],[1,1,1]]
    Output: 32
    Example 3:
    Input: grid = [[2,2,2],[2,1,2],[2,2,2]]
    Output: 46
      Constraints:
    n == grid.length == grid[i].length
    1 <= n <= 50
    0 <= grid[i][j] <= 50
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] grid = new int[][]{{1, 2}, {3, 4}};
        int expected = 34;
        var result = solution.surfaceArea(grid);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] grid = new int[][]{{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        int expected = 32;
        var result = solution.surfaceArea(grid);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[][] grid = new int[][]{{2, 2, 2}, {2, 1, 2}, {2, 2, 2}};
        int expected = 46;
        var result = solution.surfaceArea(grid);
        assertThat(result).isEqualTo(expected);
    }

}
