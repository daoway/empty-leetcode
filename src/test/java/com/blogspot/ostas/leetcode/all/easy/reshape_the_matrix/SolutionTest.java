package com.blogspot.ostas.leetcode.all.easy.reshape_the_matrix;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: mat = [[1,2],[3,4]], r = 1, c = 4
    Output: [[1,2,3,4]]
    Example 2:
    Input: mat = [[1,2],[3,4]], r = 2, c = 4
    Output: [[1,2],[3,4]]
      Constraints:
    m == mat.length
    n == mat[i].length
    1 <= m, n <= 100
    -1000 <= mat[i][j] <= 1000
    1 <= r, c <= 300
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] mat = new int[][]{{1, 2}, {3, 4}};
        int r = 1;
        int c = 4;
        int[][] expected = new int[][]{{1, 2, 3, 4}};
        var result = solution.matrixReshape(mat, r, c);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] mat = new int[][]{{1, 2}, {3, 4}};
        int r = 2;
        int c = 4;
        int[][] expected = new int[][]{{1, 2}, {3, 4}};
        var result = solution.matrixReshape(mat, r, c);
        assertThat(result).isEqualTo(expected);
    }

}
