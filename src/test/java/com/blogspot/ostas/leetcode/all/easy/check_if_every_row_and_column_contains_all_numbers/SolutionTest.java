package com.blogspot.ostas.leetcode.all.easy.check_if_every_row_and_column_contains_all_numbers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: matrix = [[1,2,3],[3,1,2],[2,3,1]]
    Output: true
    Explanation: In this case, n = 3, and every row and column contains the numbers 1, 2, and 3.
    Hence, we return true.
    Example 2:
    Input: matrix = [[1,1,1],[1,2,3],[1,2,3]]
    Output: false
    Explanation: In this case, n = 3, but the first row and the first column do not contain the numbers 2 or 3.
    Hence, we return false.
      Constraints:
    n == matrix.length == matrix[i].length
    1 <= n <= 100
    1 <= matrix[i][j] <= n
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] matrix = new int[][]{{1, 2, 3}, {3, 1, 2}, {2, 3, 1}};
        boolean expected = true;
        var result = solution.checkValid(matrix);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] matrix = new int[][]{{1, 1, 1}, {1, 2, 3}, {1, 2, 3}};
        boolean expected = false;
        var result = solution.checkValid(matrix);
        assertThat(result).isEqualTo(expected);
    }

}
