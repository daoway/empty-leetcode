package com.blogspot.ostas.leetcode.all.medium.spiral_matrix_iii;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: rows = 1, cols = 4, rStart = 0, cStart = 0
    Output: [[0,0],[0,1],[0,2],[0,3]]
    Example 2:
    Input: rows = 5, cols = 6, rStart = 1, cStart = 4
    Output: [[1,4],[1,5],[2,5],[2,4],[2,3],[1,3],[0,3],[0,4],[0,5],[3,5],[3,4],[3,3],[3,2],[2,2],[1,2],[0,2],[4,5],[4,4],[4,3],[4,2],[4,1],[3,1],[2,1],[1,1],[0,1],[4,0],[3,0],[2,0],[1,0],[0,0]]
      Constraints:
    1 <= rows, cols <= 100
    0 <= rStart < rows
    0 <= cStart < cols
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int rows = 1;
        int cols = 4;
        int rStart = 0;
        int cStart = 0;
        int[][] expected = new int[][]{{0, 0}, {0, 1}, {0, 2}, {0, 3}};
        var result = solution.spiralMatrixIII(rows, cols, rStart, cStart);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int rows = 5;
        int cols = 6;
        int rStart = 1;
        int cStart = 4;
        int[][] expected = new int[][]{{1, 4}, {1, 5}, {2, 5}, {2, 4}, {2, 3}, {1, 3}, {0, 3}, {0, 4},
                {0, 5}, {3, 5}, {3, 4}, {3, 3}, {3, 2}, {2, 2}, {1, 2}, {0, 2}, {4, 5}, {4, 4},
                {4, 3}, {4, 2}, {4, 1}, {3, 1}, {2, 1}, {1, 1}, {0, 1}, {4, 0}, {3, 0}, {2, 0},
                {1, 0}, {0, 0}};
        var result = solution.spiralMatrixIII(rows, cols, rStart, cStart);
        assertThat(result).isEqualTo(expected);
    }

}
