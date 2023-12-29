package com.blogspot.ostas.leetcode.all.hard.maximum_strictly_increasing_cells_in_a_matrix;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: mat = [[3,1],[3,4]]
    Output: 2
    Explanation: The image shows how we can visit 2 cells starting from row 1, column 2. It can be shown that we cannot visit more than 2 cells no matter where we start from, so the answer is 2.
    Example 2:
    Input: mat = [[1,1],[1,1]]
    Output: 1
    Explanation: Since the cells must be strictly increasing, we can only visit one cell in this example.
    Example 3:
    Input: mat = [[3,1,6],[-9,5,7]]
    Output: 4
    Explanation: The image above shows how we can visit 4 cells starting from row 2, column 1. It can be shown that we cannot visit more than 4 cells no matter where we start from, so the answer is 4.
      Constraints:
    m == mat.length
    n == mat[i].length
    1 <= m, n <= 105
    1 <= m * n <= 105
    -105 <= mat[i][j] <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] mat = new int[][]{{3, 1}, {3, 4}};
        int expected = 2;
        var result = solution.maxIncreasingCells(mat);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] mat = new int[][]{{1, 1}, {1, 1}};
        int expected = 1;
        var result = solution.maxIncreasingCells(mat);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[][] mat = new int[][]{{3, 1, 6}, {-9, 5, 7}};
        int expected = 4;
        var result = solution.maxIncreasingCells(mat);
        assertThat(result).isEqualTo(expected);
    }

}
