package com.blogspot.ostas.leetcode.all.medium.maximal_square;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: matrix = [["1","0","1","0","0"],["1","0","1","1","1"],["1","1","1","1","1"],["1","0","0","1","0"]]
    Output: 4
    Example 2:
    Input: matrix = [["0","1"],["1","0"]]
    Output: 1
    Example 3:
    Input: matrix = [["0"]]
    Output: 0
      Constraints:
    m == matrix.length
    n == matrix[i].length
    1 <= m, n <= 300
    matrix[i][j] is '0' or '1'.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        char[][] matrix = new char[][]{{'1', '0', '1', '0', '0'}, {'1', '0', '1', '1', '1'},
                {'1', '1', '1', '1', '1'}, {'1', '0', '0', '1', '0'}};
        int expected = 4;
        var result = solution.maximalSquare(matrix);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        char[][] matrix = new char[][]{{'0', '1'}, {'1', '0'}};
        int expected = 1;
        var result = solution.maximalSquare(matrix);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        char[][] matrix = new char[][]{{'0'}};
        int expected = 0;
        var result = solution.maximalSquare(matrix);
        assertThat(result).isEqualTo(expected);
    }

}
