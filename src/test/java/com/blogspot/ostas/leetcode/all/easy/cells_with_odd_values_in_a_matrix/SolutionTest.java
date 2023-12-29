package com.blogspot.ostas.leetcode.all.easy.cells_with_odd_values_in_a_matrix;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: m = 2, n = 3, indices = [[0,1],[1,1]]
    Output: 6
    Explanation: Initial matrix = [[0,0,0],[0,0,0]].
    After applying first increment it becomes [[1,2,1],[0,1,0]].
    The final matrix is [[1,3,1],[1,3,1]], which contains 6 odd numbers.
    Example 2:
    Input: m = 2, n = 2, indices = [[1,1],[0,0]]
    Output: 0
    Explanation: Final matrix = [[2,2],[2,2]]. There are no odd numbers in the final matrix.
      Constraints:
    1 <= m, n <= 50
    1 <= indices.length <= 100
    0 <= ri < m
    0 <= ci < n
      Follow up: Could you solve this in O(n + m + indices.length) time with only O(n + m) extra space?
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int m = 2;
        int n = 3;
        int[][] indices = new int[][]{{0, 1}, {1, 1}};
        int expected = 6;
        var result = solution.oddCells(m, n, indices);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int m = 2;
        int n = 2;
        int[][] indices = new int[][]{{1, 1}, {0, 0}};
        int expected = 0;
        var result = solution.oddCells(m, n, indices);
        assertThat(result).isEqualTo(expected);
    }

}
