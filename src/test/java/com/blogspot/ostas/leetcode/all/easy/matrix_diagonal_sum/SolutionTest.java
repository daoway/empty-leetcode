package com.blogspot.ostas.leetcode.all.easy.matrix_diagonal_sum;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: mat = [[1,2,3],
              [4,5,6],
              [7,8,9]]
    Output: 25
    Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
    Notice that element mat[1][1] = 5 is counted only once.
    Example 2:
    Input: mat = [[1,1,1,1],
              [1,1,1,1],
              [1,1,1,1],
              [1,1,1,1]]
    Output: 8
    Example 3:
    Input: mat = [[5]]
    Output: 5
      Constraints:
    n == mat.length == mat[i].length
    1 <= n <= 100
    1 <= mat[i][j] <= 100
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] mat = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int expected = 25;
        var result = solution.diagonalSum(mat);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] mat = new int[][]{{1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}};
        int expected = 8;
        var result = solution.diagonalSum(mat);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[][] mat = new int[][]{{5}};
        int expected = 5;
        var result = solution.diagonalSum(mat);
        assertThat(result).isEqualTo(expected);
    }

}
