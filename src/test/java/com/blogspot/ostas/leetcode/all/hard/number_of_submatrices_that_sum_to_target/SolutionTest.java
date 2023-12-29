package com.blogspot.ostas.leetcode.all.hard.number_of_submatrices_that_sum_to_target;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: matrix = [[0,1,0],[1,1,1],[0,1,0]], target = 0
    Output: 4
    Explanation: The four 1x1 submatrices that only contain 0.
    Example 2:
    Input: matrix = [[1,-1],[-1,1]], target = 0
    Output: 5
    Explanation: The two 1x2 submatrices, plus the two 2x1 submatrices, plus the 2x2 submatrix.
    Example 3:
    Input: matrix = [[904]], target = 0
    Output: 0
      Constraints:
    1 <= matrix.length <= 100
    1 <= matrix[0].length <= 100
    -1000 <= matrix[i] <= 1000
    -10^8 <= target <= 10^8
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] matrix = new int[][]{{0, 1, 0}, {1, 1, 1}, {0, 1, 0}};
        int target = 0;
        int expected = 4;
        var result = solution.numSubmatrixSumTarget(matrix, target);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] matrix = new int[][]{{1, -1}, {-1, 1}};
        int target = 0;
        int expected = 5;
        var result = solution.numSubmatrixSumTarget(matrix, target);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[][] matrix = new int[][]{{904}};
        int target = 0;
        int expected = 0;
        var result = solution.numSubmatrixSumTarget(matrix, target);
        assertThat(result).isEqualTo(expected);
    }

}
