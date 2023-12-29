package com.blogspot.ostas.leetcode.all.easy.check_if_matrix_is_x_matrix;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: grid = [[2,0,0,1],[0,3,1,0],[0,5,2,0],[4,0,0,2]]
    Output: true
    Explanation: Refer to the diagram above.
    An X-Matrix should have the green elements (diagonals) be non-zero and the red elements be 0.
    Thus, grid is an X-Matrix.
    Example 2:
    Input: grid = [[5,7,0],[0,3,1],[0,5,0]]
    Output: false
    Explanation: Refer to the diagram above.
    An X-Matrix should have the green elements (diagonals) be non-zero and the red elements be 0.
    Thus, grid is not an X-Matrix.
      Constraints:
    n == grid.length == grid[i].length
    3 <= n <= 100
    0 <= grid[i][j] <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] grid = new int[][]{{2, 0, 0, 1}, {0, 3, 1, 0}, {0, 5, 2, 0}, {4, 0, 0, 2}};
        boolean expected = true;
        var result = solution.checkXMatrix(grid);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] grid = new int[][]{{5, 7, 0}, {0, 3, 1}, {0, 5, 0}};
        boolean expected = false;
        var result = solution.checkXMatrix(grid);
        assertThat(result).isEqualTo(expected);
    }

}
