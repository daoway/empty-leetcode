package com.blogspot.ostas.leetcode.all.hard.transform_to_chessboard;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: board = [[0,1,1,0],[0,1,1,0],[1,0,0,1],[1,0,0,1]]
    Output: 2
    Explanation: One potential sequence of moves is shown.
    The first move swaps the first and second column.
    The second move swaps the second and third row.
    Example 2:
    Input: board = [[0,1],[1,0]]
    Output: 0
    Explanation: Also note that the board with 0 in the top left corner, is also a valid chessboard.
    Example 3:
    Input: board = [[1,0],[1,0]]
    Output: -1
    Explanation: No matter what sequence of moves you make, you cannot end with a valid chessboard.
      Constraints:
    n == board.length
    n == board[i].length
    2 <= n <= 30
    board[i][j] is either 0 or 1.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] board = new int[][]{{0, 1, 1, 0}, {0, 1, 1, 0}, {1, 0, 0, 1}, {1, 0, 0, 1}};
        int expected = 2;
        var result = solution.movesToChessboard(board);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] board = new int[][]{{0, 1}, {1, 0}};
        int expected = 0;
        var result = solution.movesToChessboard(board);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[][] board = new int[][]{{1, 0}, {1, 0}};
        int expected = -1;
        var result = solution.movesToChessboard(board);
        assertThat(result).isEqualTo(expected);
    }

}
