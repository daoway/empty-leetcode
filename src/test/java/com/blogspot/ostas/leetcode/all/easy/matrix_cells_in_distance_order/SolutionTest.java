package com.blogspot.ostas.leetcode.all.easy.matrix_cells_in_distance_order;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: rows = 1, cols = 2, rCenter = 0, cCenter = 0
    Output: [[0,0],[0,1]]
    Explanation: The distances from (0, 0) to other cells are: [0,1]
    Example 2:
    Input: rows = 2, cols = 2, rCenter = 0, cCenter = 1
    Output: [[0,1],[0,0],[1,1],[1,0]]
    Explanation: The distances from (0, 1) to other cells are: [0,1,1,2]
    The answer [[0,1],[1,1],[0,0],[1,0]] would also be accepted as correct.
    Example 3:
    Input: rows = 2, cols = 3, rCenter = 1, cCenter = 2
    Output: [[1,2],[0,2],[1,1],[0,1],[1,0],[0,0]]
    Explanation: The distances from (1, 2) to other cells are: [0,1,1,2,2,3]
    There are other answers that would also be accepted as correct, such as [[1,2],[1,1],[0,2],[1,0],[0,1],[0,0]].
      Constraints:
    1 <= rows, cols <= 100
    0 <= rCenter < rows
    0 <= cCenter < cols
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int rows = 1;
        int cols = 2;
        int rCenter = 0;
        int cCenter = 0;
        int[][] expected = new int[][]{{0, 0}, {0, 1}};
        var result = solution.allCellsDistOrder(rows, cols, rCenter, cCenter);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int rows = 2;
        int cols = 2;
        int rCenter = 0;
        int cCenter = 1;
        int[][] expected1 = new int[][]{{0, 1}, {0, 0}, {1, 1}, {1, 0}};
        int[][] expected2 = new int[][]{{0, 1}, {1, 1}, {0, 0}, {1, 0}};
        var result = solution.allCellsDistOrder(rows, cols, rCenter, cCenter);
        assertThat(result).isIn(expected1, expected2);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int rows = 2;
        int cols = 3;
        int rCenter = 1;
        int cCenter = 2;
        int[][] expected1 = new int[][]{{1, 2}, {0, 2}, {1, 1}, {0, 1}, {1, 0}, {0, 0}};
        int[][] expected2 = new int[][]{{1, 2}, {1, 1}, {0, 2}, {1, 0}, {0, 1}, {0, 0}};

        var result = solution.allCellsDistOrder(rows, cols, rCenter, cCenter);
        assertThat(result).isIn(expected1, expected2);
    }

}
