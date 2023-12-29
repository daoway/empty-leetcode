package com.blogspot.ostas.leetcode.all.medium.matrix_block_sum;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: mat = [[1,2,3],[4,5,6],[7,8,9]], k = 1
    Output: [[12,21,16],[27,45,33],[24,39,28]]
    Example 2:
    Input: mat = [[1,2,3],[4,5,6],[7,8,9]], k = 2
    Output: [[45,45,45],[45,45,45],[45,45,45]]
      Constraints:
    m == mat.length
    n == mat[i].length
    1 <= m, n, k <= 100
    1 <= mat[i][j] <= 100
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] mat = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int k = 1;
        int[][] expected = new int[][]{{12, 21, 16}, {27, 45, 33}, {24, 39, 28}};
        var result = solution.matrixBlockSum(mat, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] mat = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int k = 2;
        int[][] expected = new int[][]{{45, 45, 45}, {45, 45, 45}, {45, 45, 45}};
        var result = solution.matrixBlockSum(mat, k);
        assertThat(result).isEqualTo(expected);
    }

}
