package com.blogspot.ostas.leetcode.all.medium.find_valid_matrix_given_row_and_column_sums;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: rowSum = [3,8], colSum = [4,7]
    Output: [[3,0],
         [1,7]]
    Explanation:
    0th row: 3 + 0 = 3 == rowSum[0]
    1st row: 1 + 7 = 8 == rowSum[1]
    0th column: 3 + 1 = 4 == colSum[0]
    1st column: 0 + 7 = 7 == colSum[1]
    The row and column sums match, and all matrix elements are non-negative.
    Another possible matrix is: [[1,2],
                             [3,5]]
    Example 2:
    Input: rowSum = [5,7,10], colSum = [8,6,8]
    Output: [[0,5,0],
         [6,1,0],
         [2,0,8]]
      Constraints:
    1 <= rowSum.length, colSum.length <= 500
    0 <= rowSum[i], colSum[i] <= 108
    sum(rowSum) == sum(colSum)
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] rowSum = new int[]{3, 8};
        int[] colSum = new int[]{4, 7};
        int[][] expected = new int[][]{{3, 0}, {1, 7}};
        var result = solution.restoreMatrix(rowSum, colSum);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] rowSum = new int[]{5, 7, 10};
        int[] colSum = new int[]{8, 6, 8};
        int[][] expected = new int[][]{{0, 5, 0}, {6, 1, 0}, {2, 0, 8}};
        var result = solution.restoreMatrix(rowSum, colSum);
        assertThat(result).isEqualTo(expected);
    }


}
