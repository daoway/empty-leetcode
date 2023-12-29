package com.blogspot.ostas.leetcode.all.medium.construct_product_matrix;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: grid = [[1,2],[3,4]]
    Output: [[24,12],[8,6]]
    Explanation: p[0][0] = grid[0][1] * grid[1][0] * grid[1][1] = 2 * 3 * 4 = 24
    p[0][1] = grid[0][0] * grid[1][0] * grid[1][1] = 1 * 3 * 4 = 12
    p[1][0] = grid[0][0] * grid[0][1] * grid[1][1] = 1 * 2 * 4 = 8
    p[1][1] = grid[0][0] * grid[0][1] * grid[1][0] = 1 * 2 * 3 = 6
    So the answer is [[24,12],[8,6]].
    Example 2:
    Input: grid = [[12345],[2],[1]]
    Output: [[2],[0],[0]]
    Explanation: p[0][0] = grid[0][1] * grid[0][2] = 2 * 1 = 2.
    p[0][1] = grid[0][0] * grid[0][2] = 12345 * 1 = 12345. 12345 % 12345 = 0. So p[0][1] = 0.
    p[0][2] = grid[0][0] * grid[0][1] = 12345 * 2 = 24690. 24690 % 12345 = 0. So p[0][2] = 0.
    So the answer is [[2],[0],[0]].
      Constraints:
    1 <= n == grid.length <= 105
    1 <= m == grid[i].length <= 105
    2 <= n * m <= 105
    1 <= grid[i][j] <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] grid = new int[][]{{1, 2}, {3, 4}};
        int[][] expected = new int[][]{{24, 12}, {8, 6}};
        var result = solution.constructProductMatrix(grid);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] grid = new int[][]{{12345}, {2}, {1}};
        int[][] expected = new int[][]{{2}, {0}, {0}};
        var result = solution.constructProductMatrix(grid);
        assertThat(result).isEqualTo(expected);
    }

}
