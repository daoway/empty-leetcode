package com.blogspot.ostas.leetcode.all.hard.sliding_puzzle;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: board = [[1,2,3],[4,0,5]]
    Output: 1
    Explanation: Swap the 0 and the 5 in one move.
    Example 2:
    Input: board = [[1,2,3],[5,4,0]]
    Output: -1
    Explanation: No number of moves will make the board solved.
    Example 3:
    Input: board = [[4,1,2],[5,0,3]]
    Output: 5
    Explanation: 5 is the smallest number of moves that solves the board.
    An example path:
    After move 0: [[4,1,2],[5,0,3]]
    After move 1: [[4,1,2],[0,5,3]]
    After move 2: [[0,1,2],[4,5,3]]
    After move 3: [[1,0,2],[4,5,3]]
    After move 4: [[1,2,0],[4,5,3]]
    After move 5: [[1,2,3],[4,5,0]]
      Constraints:
    board.length == 2
    board[i].length == 3
    0 <= board[i][j] <= 5
    Each value board[i][j] is unique.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] board = new int[][]{{1, 2, 3}, {4, 0, 5}};
        int expected = 1;
        var result = solution.slidingPuzzle(board);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] board = new int[][]{{1, 2, 3}, {5, 4, 0}};
        int expected = -1;
        var result = solution.slidingPuzzle(board);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[][] board = new int[][]{{4, 1, 2}, {5, 0, 3}};
        int expected = 5;
        var result = solution.slidingPuzzle(board);
        assertThat(result).isEqualTo(expected);
    }

}
