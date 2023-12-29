package com.blogspot.ostas.leetcode.all.medium.maximum_matrix_sum;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: matrix = [[1,-1],[-1,1]]
    Output: 4
    Explanation: We can follow the following steps to reach sum equals 4:
    - Multiply the 2 elements in the first row by -1.
    - Multiply the 2 elements in the first column by -1.
    Example 2:
    Input: matrix = [[1,2,3],[-1,-2,-3],[1,2,3]]
    Output: 16
    Explanation: We can follow the following step to reach sum equals 16:
    - Multiply the 2 last elements in the second row by -1.
      Constraints:
    n == matrix.length == matrix[i].length
    2 <= n <= 250
    -105 <= matrix[i][j] <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] matrix = new int[][]{{1, -1}, {-1, 1}};
        long expected = 4;
        var result = solution.maxMatrixSum(matrix);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] matrix = new int[][]{{1, 2, 3}, {-1, -2, -3}, {1, 2, 3}};
        long expected = 16;
        var result = solution.maxMatrixSum(matrix);
        assertThat(result).isEqualTo(expected);
    }

}
