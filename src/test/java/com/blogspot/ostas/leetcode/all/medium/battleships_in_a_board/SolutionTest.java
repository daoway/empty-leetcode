package com.blogspot.ostas.leetcode.all.medium.battleships_in_a_board;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: board = [["X",".",".","X"],[".",".",".","X"],[".",".",".","X"]]
    Output: 2
    Example 2:
    Input: board = [["."]]
    Output: 0
      Constraints:
    m == board.length
    n == board[i].length
    1 <= m, n <= 200
    board[i][j] is either '.' or 'X'.
      Follow up: Could you do it in one-pass, using only O(1) extra memory and without modifying the values board?
    */
    @Test
    void example_0() {
        var solution = new Solution();
        char[][] board =
                new char[][]{{'X', '.', '.', 'X'}, {'.', '.', '.', 'X'}, {'.', '.', '.', 'X'}};
        int expected = 2;
        var result = solution.countBattleships(board);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        char[][] board = new char[][]{{'.'}};
        int expected = 0;
        var result = solution.countBattleships(board);
        assertThat(result).isEqualTo(expected);
    }

}
