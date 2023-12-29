package com.blogspot.ostas.leetcode.all.medium.sort_the_matrix_diagonally;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: mat = [[3,3,1,1],[2,2,1,2],[1,1,1,2]]
    Output: [[1,1,1,1],[1,2,2,2],[1,2,3,3]]
    Example 2:
    Input: mat = [[11,25,66,1,69,7],[23,55,17,45,15,52],[75,31,36,44,58,8],[22,27,33,25,68,4],[84,28,14,11,5,50]]
    Output: [[5,17,4,1,52,7],[11,11,25,45,8,69],[14,23,25,44,58,15],[22,27,31,36,50,66],[84,28,75,33,55,68]]
      Constraints:
    m == mat.length
    n == mat[i].length
    1 <= m, n <= 100
    1 <= mat[i][j] <= 100
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] mat = new int[][]{{3, 3, 1, 1}, {2, 2, 1, 2}, {1, 1, 1, 2}};
        int[][] expected = new int[][]{{1, 1, 1, 1}, {1, 2, 2, 2}, {1, 2, 3, 3}};
        var result = solution.diagonalSort(mat);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] mat =
                new int[][]{{11, 25, 66, 1, 69, 7}, {23, 55, 17, 45, 15, 52}, {75, 31, 36, 44, 58, 8},
                        {22, 27, 33, 25, 68, 4}, {84, 28, 14, 11, 5, 50}};
        int[][] expected =
                new int[][]{{5, 17, 4, 1, 52, 7}, {11, 11, 25, 45, 8, 69}, {14, 23, 25, 44, 58, 15},
                        {22, 27, 31, 36, 50, 66}, {84, 28, 75, 33, 55, 68}};
        var result = solution.diagonalSort(mat);
        assertThat(result).isEqualTo(expected);
    }

}
