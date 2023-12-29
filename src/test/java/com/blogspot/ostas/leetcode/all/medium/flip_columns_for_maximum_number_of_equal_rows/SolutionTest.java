package com.blogspot.ostas.leetcode.all.medium.flip_columns_for_maximum_number_of_equal_rows;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: matrix = [[0,1],[1,1]]
    Output: 1
    Explanation: After flipping no values, 1 row has all values equal.
    Example 2:
    Input: matrix = [[0,1],[1,0]]
    Output: 2
    Explanation: After flipping values in the first column, both rows have equal values.
    Example 3:
    Input: matrix = [[0,0,0],[0,0,1],[1,1,0]]
    Output: 2
    Explanation: After flipping values in the first two columns, the last two rows have equal values.
      Constraints:
    m == matrix.length
    n == matrix[i].length
    1 <= m, n <= 300
    matrix[i][j] is either 0 or 1.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] matrix = new int[][]{{0, 1}, {1, 1}};
        int expected = 1;
        var result = solution.maxEqualRowsAfterFlips(matrix);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] matrix = new int[][]{{0, 1}, {1, 0}};
        int expected = 2;
        var result = solution.maxEqualRowsAfterFlips(matrix);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[][] matrix = new int[][]{{0, 0, 0}, {0, 0, 1}, {1, 1, 0}};
        int expected = 2;
        var result = solution.maxEqualRowsAfterFlips(matrix);
        assertThat(result).isEqualTo(expected);
    }

}
