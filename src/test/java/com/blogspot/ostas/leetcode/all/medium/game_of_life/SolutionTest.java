package com.blogspot.ostas.leetcode.all.medium.game_of_life;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
        Example 1:
    Input: board = [[0,1,0],[0,0,1],[1,1,1],[0,0,0]]
    Output: [[0,0,0],[1,0,1],[0,1,1],[0,1,0]]
    Example 2:
    Input: board = [[1,1],[1,0]]
    Output: [[1,1],[1,1]]
      Constraints:
    m == board.length
    n == board[i].length
    1 <= m, n <= 25
    board[i][j] is 0 or 1.
      Follow up:
    Could you solve it in-place? Remember that the board needs to be updated simultaneously: You cannot update some cells first and then use their updated values to update other cells.
    In this question, we represent the board using a 2D array. In principle, the board is infinite, which would cause problems when the active area encroaches upon the border of the array (i.e., live cells reach the border). How would you address these problems?
    */

    @Test
    void test_0() {
        var solution = new Solution();
        int[][] board = new int[][]{{0, 1, 0}, {0, 0, 1}, {1, 1, 1}, {0, 0, 0}};
        int[][] expected = new int[][]{{0, 0, 0}, {1, 0, 1}, {0, 1, 1}, {0, 1, 0}};
        solution.gameOfLife(board);
        assertThat(board).isEqualTo(expected);
    }

    @Test
    void test_1() {
        var solution = new Solution();
        int[][] board = new int[][]{{1, 1}, {1, 0}};
        int[][] expected = new int[][]{{1, 1}, {1, 1}};
        solution.gameOfLife(board);
        assertThat(board).isEqualTo(expected);
    }
}
