package com.blogspot.ostas.leetcode.all.hard.minimum_number_of_flips_to_convert_binary_matrix_to_zero_matrix;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: mat = [[0,0],[0,1]]
    Output: 3
    Explanation: One possible solution is to flip (1, 0) then (0, 1) and finally (1, 1) as shown.
    Example 2:
    Input: mat = [[0]]
    Output: 0
    Explanation: Given matrix is a zero matrix. We do not need to change it.
    Example 3:
    Input: mat = [[1,0,0],[1,0,0]]
    Output: -1
    Explanation: Given matrix cannot be a zero matrix.
      Constraints:
    m == mat.length
    n == mat[i].length
    1 <= m, n <= 3
    mat[i][j] is either 0 or 1.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] mat = new int[][]{{0, 0}, {0, 1}};
        int expected = 3;
        var result = solution.minFlips(mat);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] mat = new int[][]{{0}};
        int expected = 0;
        var result = solution.minFlips(mat);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[][] mat = new int[][]{{1, 0, 0}, {1, 0, 0}};
        int expected = -1;
        var result = solution.minFlips(mat);
        assertThat(result).isEqualTo(expected);
    }

}
