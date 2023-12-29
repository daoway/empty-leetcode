package com.blogspot.ostas.leetcode.all.easy.matrix_similarity_after_cyclic_shifts;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: mat = [[1,2,1,2],[5,5,5,5],[6,3,6,3]], k = 2
    Output: true
    Explanation:
    Initially, the matrix looks like the first figure.
    Second figure represents the state of the matrix after one right and left cyclic shifts to even and odd indexed rows.
    Third figure is the final state of the matrix after two cyclic shifts which is similar to the initial matrix.
    Therefore, return true.
    Example 2:
    Input: mat = [[2,2],[2,2]], k = 3
    Output: true
    Explanation: As all the values are equal in the matrix, even after performing cyclic shifts the matrix will remain the same. Therefeore, we return true.
    Example 3:
    Input: mat = [[1,2]], k = 1
    Output: false
    Explanation: After one cyclic shift, mat = [[2,1]] which is not equal to the initial matrix. Therefore we return false.
      Constraints:
    1 <= mat.length <= 25
    1 <= mat[i].length <= 25
    1 <= mat[i][j] <= 25
    1 <= k <= 50
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] mat = new int[][]{{1, 2, 1, 2}, {5, 5, 5, 5}, {6, 3, 6, 3}};
        int k = 2;
        boolean expected = true;
        var result = solution.areSimilar(mat, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] mat = new int[][]{{2, 2}, {2, 2}};
        int k = 3;
        boolean expected = true;
        var result = solution.areSimilar(mat, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[][] mat = new int[][]{{1, 2}};
        int k = 1;
        boolean expected = false;
        var result = solution.areSimilar(mat, k);
        assertThat(result).isEqualTo(expected);
    }

}
