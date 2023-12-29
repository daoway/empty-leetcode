package com.blogspot.ostas.leetcode.all.medium.spiral_matrix_ii;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 3
    Output: [[1,2,3],[8,9,4],[7,6,5]]
    Example 2:
    Input: n = 1
    Output: [[1]]
      Constraints:
    1 <= n <= 20
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 3;
        int[][] expected = new int[][]{{1, 2, 3}, {8, 9, 4}, {7, 6, 5}};
        var result = solution.generateMatrix(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 1;
        int[][] expected = new int[][]{{1}};
        var result = solution.generateMatrix(n);
        assertThat(result).isEqualTo(expected);
    }

}
