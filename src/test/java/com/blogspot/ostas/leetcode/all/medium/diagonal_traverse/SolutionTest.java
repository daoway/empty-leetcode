package com.blogspot.ostas.leetcode.all.medium.diagonal_traverse;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: mat = [[1,2,3],[4,5,6],[7,8,9]]
    Output: [1,2,4,7,5,3,6,8,9]
    Example 2:
    Input: mat = [[1,2],[3,4]]
    Output: [1,2,3,4]
      Constraints:
    m == mat.length
    n == mat[i].length
    1 <= m, n <= 104
    1 <= m * n <= 104
    -105 <= mat[i][j] <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] mat = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[] expected = new int[]{1, 2, 4, 7, 5, 3, 6, 8, 9};
        var result = solution.findDiagonalOrder(mat);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] mat = new int[][]{{1, 2}, {3, 4}};
        int[] expected = new int[]{1, 2, 3, 4};
        var result = solution.findDiagonalOrder(mat);
        assertThat(result).isEqualTo(expected);
    }

}
