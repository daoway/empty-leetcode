package com.blogspot.ostas.leetcode.all.medium.largest_submatrix_with_rearrangements;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: matrix = [[0,0,1],[1,1,1],[1,0,1]]
    Output: 4
    Explanation: You can rearrange the columns as shown above.
    The largest submatrix of 1s, in bold, has an area of 4.
    Example 2:
    Input: matrix = [[1,0,1,0,1]]
    Output: 3
    Explanation: You can rearrange the columns as shown above.
    The largest submatrix of 1s, in bold, has an area of 3.
    Example 3:
    Input: matrix = [[1,1,0],[1,0,1]]
    Output: 2
    Explanation: Notice that you must rearrange entire columns, and there is no way to make a submatrix of 1s larger than an area of 2.
      Constraints:
    m == matrix.length
    n == matrix[i].length
    1 <= m * n <= 105
    matrix[i][j] is either 0 or 1.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] matrix = new int[][]{{0, 0, 1}, {1, 1, 1}, {1, 0, 1}};
        int expected = 4;
        var result = solution.largestSubmatrix(matrix);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] matrix = new int[][]{{1, 0, 1, 0, 1}};
        int expected = 3;
        var result = solution.largestSubmatrix(matrix);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[][] matrix = new int[][]{{1, 1, 0}, {1, 0, 1}};
        int expected = 2;
        var result = solution.largestSubmatrix(matrix);
        assertThat(result).isEqualTo(expected);
    }

}
