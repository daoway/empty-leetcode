package com.blogspot.ostas.leetcode.all.medium.check_if_there_is_a_valid_path_in_a_grid;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: grid = [[2,4,3],[6,5,2]]
    Output: true
    Explanation: As shown you can start at cell (0, 0) and visit all the cells of the grid to reach (m - 1, n - 1).
    Example 2:
    Input: grid = [[1,2,1],[1,2,1]]
    Output: false
    Explanation: As shown you the street at cell (0, 0) is not connected with any street of any other cell and you will get stuck at cell (0, 0)
    Example 3:
    Input: grid = [[1,1,2]]
    Output: false
    Explanation: You will get stuck at cell (0, 1) and you cannot reach cell (0, 2).
      Constraints:
    m == grid.length
    n == grid[i].length
    1 <= m, n <= 300
    1 <= grid[i][j] <= 6
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] grid = new int[][]{{2, 4, 3}, {6, 5, 2}};
        boolean expected = true;
        var result = solution.hasValidPath(grid);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] grid = new int[][]{{1, 2, 1}, {1, 2, 1}};
        boolean expected = false;
        var result = solution.hasValidPath(grid);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[][] grid = new int[][]{{1, 1, 2}};
        boolean expected = false;
        var result = solution.hasValidPath(grid);
        assertThat(result).isEqualTo(expected);
    }

}
