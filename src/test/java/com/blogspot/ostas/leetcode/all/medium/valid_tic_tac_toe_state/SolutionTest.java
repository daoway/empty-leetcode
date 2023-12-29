package com.blogspot.ostas.leetcode.all.medium.valid_tic_tac_toe_state;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: board = ["O  ","   ","   "]
    Output: false
    Explanation: The first player always plays "X".
    Example 2:
    Input: board = ["XOX"," X ","   "]
    Output: false
    Explanation: Players take turns making moves.
    Example 3:
    Input: board = ["XOX","O O","XOX"]
    Output: true
      Constraints:
    board.length == 3
    board[i].length == 3
    board[i][j] is either 'X', 'O', or ' '.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String[] board = new String[]{"O  ", "   ", "   "};
        boolean expected = false;
        var result = solution.validTicTacToe(board);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String[] board = new String[]{"XOX", " X ", "   "};
        boolean expected = false;
        var result = solution.validTicTacToe(board);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String[] board = new String[]{"XOX", "O O", "XOX"};
        boolean expected = true;
        var result = solution.validTicTacToe(board);
        assertThat(result).isEqualTo(expected);
    }

}
