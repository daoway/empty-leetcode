package com.blogspot.ostas.leetcode.all.medium.check_if_move_is_legal;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: board = [[".",".",".","B",".",".",".","."],[".",".",".","W",".",".",".","."],[".",".",".","W",".",".",".","."],[".",".",".","W",".",".",".","."],["W","B","B",".","W","W","W","B"],[".",".",".","B",".",".",".","."],[".",".",".","B",".",".",".","."],[".",".",".","W",".",".",".","."]], rMove = 4, cMove = 3, color = "B"
    Output: true
    Explanation: '.', 'W', and 'B' are represented by the colors blue, white, and black respectively, and cell (rMove, cMove) is marked with an 'X'.
    The two good lines with the chosen cell as an endpoint are annotated above with the red rectangles.
    Example 2:
    Input: board = [[".",".",".",".",".",".",".","."],[".","B",".",".","W",".",".","."],[".",".","W",".",".",".",".","."],[".",".",".","W","B",".",".","."],[".",".",".",".",".",".",".","."],[".",".",".",".","B","W",".","."],[".",".",".",".",".",".","W","."],[".",".",".",".",".",".",".","B"]], rMove = 4, cMove = 4, color = "W"
    Output: false
    Explanation: While there are good lines with the chosen cell as a middle cell, there are no good lines with the chosen cell as an endpoint.
      Constraints:
    board.length == board[r].length == 8
    0 <= rMove, cMove < 8
    board[rMove][cMove] == '.'
    color is either 'B' or 'W'.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        char[][] board = new char[][]{{'.', '.', '.', 'B', '.', '.', '.', '.'},
                {'.', '.', '.', 'W', '.', '.', '.', '.'}, {'.', '.', '.', 'W', '.', '.', '.', '.'},
                {'.', '.', '.', 'W', '.', '.', '.', '.'}, {'W', 'B', 'B', '.', 'W', 'W', 'W', 'B'},
                {'.', '.', '.', 'B', '.', '.', '.', '.'}, {'.', '.', '.', 'B', '.', '.', '.', '.'},
                {'.', '.', '.', 'W', '.', '.', '.', '.'}};
        int rMove = 4;
        int cMove = 3;
        char color = 'B';
        boolean expected = true;
        var result = solution.checkMove(board, rMove, cMove, color);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        char[][] board = new char[][]{{'.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', 'B', '.', '.', 'W', '.', '.', '.'}, {'.', '.', 'W', '.', '.', '.', '.', '.'},
                {'.', '.', '.', 'W', 'B', '.', '.', '.'}, {'.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', 'B', 'W', '.', '.'}, {'.', '.', '.', '.', '.', '.', 'W', '.'},
                {'.', '.', '.', '.', '.', '.', '.', 'B'}};
        int rMove = 4;
        int cMove = 4;
        char color = 'W';
        boolean expected = false;
        var result = solution.checkMove(board, rMove, cMove, color);
        assertThat(result).isEqualTo(expected);
    }

}
