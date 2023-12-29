package com.blogspot.ostas.leetcode.all.hard.longest_increasing_path_in_a_matrix;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: matrix = [[9,9,4],[6,6,8],[2,1,1]]
    Output: 4
    Explanation: The longest increasing path is [1, 2, 6, 9].
    Example 2:
    Input: matrix = [[3,4,5],[3,2,6],[2,2,1]]
    Output: 4
    Explanation: The longest increasing path is [3, 4, 5, 6]. Moving diagonally is not allowed.
    Example 3:
    Input: matrix = [[1]]
    Output: 1
      Constraints:
    m == matrix.length
    n == matrix[i].length
    1 <= m, n <= 200
    0 <= matrix[i][j] <= 231 - 1
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] matrix = new int[][]{{9, 9, 4}, {6, 6, 8}, {2, 1, 1}};
        int expected = 4;
        var result = solution.longestIncreasingPath(matrix);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] matrix = new int[][]{{3, 4, 5}, {3, 2, 6}, {2, 2, 1}};
        int expected = 4;
        var result = solution.longestIncreasingPath(matrix);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[][] matrix = new int[][]{{1}};
        int expected = 1;
        var result = solution.longestIncreasingPath(matrix);
        assertThat(result).isEqualTo(expected);
    }

}
