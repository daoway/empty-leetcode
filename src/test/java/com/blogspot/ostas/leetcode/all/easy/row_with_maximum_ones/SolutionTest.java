package com.blogspot.ostas.leetcode.all.easy.row_with_maximum_ones;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: mat = [[0,1],[1,0]]
    Output: [0,1]
    Explanation: Both rows have the same number of 1's. So we return the index of the smaller row, 0, and the maximum count of ones (1). So, the answer is [0,1].
    Example 2:
    Input: mat = [[0,0,0],[0,1,1]]
    Output: [1,2]
    Explanation: The row indexed 1 has the maximum count of ones (2). So we return its index, 1, and the count. So, the answer is [1,2].
    Example 3:
    Input: mat = [[0,0],[1,1],[0,0]]
    Output: [1,2]
    Explanation: The row indexed 1 has the maximum count of ones (2). So the answer is [1,2].
      Constraints:
    m == mat.length
    n == mat[i].length
    1 <= m, n <= 100
    mat[i][j] is either 0 or 1.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] mat = new int[][]{{0, 1}, {1, 0}};
        int[] expected = new int[]{0, 1};
        var result = solution.rowAndMaximumOnes(mat);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] mat = new int[][]{{0, 0, 0}, {0, 1, 1}};
        int[] expected = new int[]{1, 2};
        var result = solution.rowAndMaximumOnes(mat);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[][] mat = new int[][]{{0, 0}, {1, 1}, {0, 0}};
        int[] expected = new int[]{1, 2};
        var result = solution.rowAndMaximumOnes(mat);
        assertThat(result).isEqualTo(expected);
    }

}
