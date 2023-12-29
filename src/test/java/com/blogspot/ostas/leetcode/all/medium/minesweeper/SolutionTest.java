package com.blogspot.ostas.leetcode.all.medium.minesweeper;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: board = [["E","E","E","E","E"],["E","E","M","E","E"],["E","E","E","E","E"],["E","E","E","E","E"]], click = [3,0]
    Output: [["B","1","E","1","B"],["B","1","M","1","B"],["B","1","1","1","B"],["B","B","B","B","B"]]
    Example 2:
    Input: board = [["B","1","E","1","B"],["B","1","M","1","B"],["B","1","1","1","B"],["B","B","B","B","B"]], click = [1,2]
    Output: [["B","1","E","1","B"],["B","1","X","1","B"],["B","1","1","1","B"],["B","B","B","B","B"]]
      Constraints:
    m == board.length
    n == board[i].length
    1 <= m, n <= 50
    board[i][j] is either 'M', 'E', 'B', or a digit from '1' to '8'.
    click.length == 2
    0 <= clickr < m
    0 <= clickc < n
    board[clickr][clickc] is either 'M' or 'E'.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        char[][] board = new char[][]{{'E', 'E', 'E', 'E', 'E'}, {'E', 'E', 'M', 'E', 'E'},
                {'E', 'E', 'E', 'E', 'E'}, {'E', 'E', 'E', 'E', 'E'}};
        int[] click = new int[]{3, 0};
        char[][] expected = new char[][]{{'B', '1', 'E', '1', 'B'}, {'B', '1', 'M', '1', 'B'},
                {'B', '1', '1', '1', 'B'}, {'B', 'B', 'B', 'B', 'B'}};
        var result = solution.updateBoard(board, click);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        char[][] board = new char[][]{{'B', '1', 'E', '1', 'B'}, {'B', '1', 'M', '1', 'B'},
                {'B', '1', '1', '1', 'B'}, {'B', 'B', 'B', 'B', 'B'}};
        int[] click = new int[]{1, 2};
        char[][] expected = new char[][]{{'B', '1', 'E', '1', 'B'}, {'B', '1', 'X', '1', 'B'},
                {'B', '1', '1', '1', 'B'}, {'B', 'B', 'B', 'B', 'B'}};
        var result = solution.updateBoard(board, click);
        assertThat(result).isEqualTo(expected);
    }

}
