package com.blogspot.ostas.leetcode.all.hard.rank_transform_of_a_matrix;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: matrix = [[1,2],[3,4]]
    Output: [[1,2],[2,3]]
    Explanation:
    The rank of matrix[0][0] is 1 because it is the smallest integer in its row and column.
    The rank of matrix[0][1] is 2 because matrix[0][1] > matrix[0][0] and matrix[0][0] is rank 1.
    The rank of matrix[1][0] is 2 because matrix[1][0] > matrix[0][0] and matrix[0][0] is rank 1.
    The rank of matrix[1][1] is 3 because matrix[1][1] > matrix[0][1], matrix[1][1] > matrix[1][0], and both matrix[0][1] and matrix[1][0] are rank 2.
    Example 2:
    Input: matrix = [[7,7],[7,7]]
    Output: [[1,1],[1,1]]
    Example 3:
    Input: matrix = [[20,-21,14],[-19,4,19],[22,-47,24],[-19,4,19]]
    Output: [[4,2,3],[1,3,4],[5,1,6],[1,3,4]]
      Constraints:
    m == matrix.length
    n == matrix[i].length
    1 <= m, n <= 500
    -109 <= matrix[row][col] <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] matrix = new int[][]{{1, 2}, {3, 4}};
        int[][] expected = new int[][]{{1, 2}, {2, 3}};
        var result = solution.matrixRankTransform(matrix);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] matrix = new int[][]{{7, 7}, {7, 7}};
        int[][] expected = new int[][]{{1, 1}, {1, 1}};
        var result = solution.matrixRankTransform(matrix);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[][] matrix = new int[][]{{20, -21, 14}, {-19, 4, 19}, {22, -47, 24}, {-19, 4, 19}};
        int[][] expected = new int[][]{{4, 2, 3}, {1, 3, 4}, {5, 1, 6}, {1, 3, 4}};
        var result = solution.matrixRankTransform(matrix);
        assertThat(result).isEqualTo(expected);
    }

}
