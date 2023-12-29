package com.blogspot.ostas.leetcode.all.easy.determine_whether_matrix_can_be_obtained_by_rotation;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: mat = [[0,1],[1,0]], target = [[1,0],[0,1]]
    Output: true
    Explanation: We can rotate mat 90 degrees clockwise to make mat equal target.
    Example 2:
    Input: mat = [[0,1],[1,1]], target = [[1,0],[0,1]]
    Output: false
    Explanation: It is impossible to make mat equal to target by rotating mat.
    Example 3:
    Input: mat = [[0,0,0],[0,1,0],[1,1,1]], target = [[1,1,1],[0,1,0],[0,0,0]]
    Output: true
    Explanation: We can rotate mat 90 degrees clockwise two times to make mat equal target.
      Constraints:
    n == mat.length == target.length
    n == mat[i].length == target[i].length
    1 <= n <= 10
    mat[i][j] and target[i][j] are either 0 or 1.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] mat = new int[][]{{0, 1}, {1, 0}};
        int[][] target = new int[][]{{1, 0}, {0, 1}};
        boolean expected = true;
        var result = solution.findRotation(mat, target);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] mat = new int[][]{{0, 1}, {1, 1}};
        int[][] target = new int[][]{{1, 0}, {0, 1}};
        boolean expected = false;
        var result = solution.findRotation(mat, target);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[][] mat = new int[][]{{0, 0, 0}, {0, 1, 0}, {1, 1, 1}};
        int[][] target = new int[][]{{1, 1, 1}, {0, 1, 0}, {0, 0, 0}};
        boolean expected = true;
        var result = solution.findRotation(mat, target);
        assertThat(result).isEqualTo(expected);
    }

}
