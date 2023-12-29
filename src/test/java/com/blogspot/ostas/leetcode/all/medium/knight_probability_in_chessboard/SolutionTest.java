package com.blogspot.ostas.leetcode.all.medium.knight_probability_in_chessboard;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 3, k = 2, row = 0, column = 0
    Output: 0.06250
    Explanation: There are two moves (to (1,2), (2,1)) that will keep the knight on the board.
    From each of those positions, there are also two moves that will keep the knight on the board.
    The total probability the knight stays on the board is 0.0625.
    Example 2:
    Input: n = 1, k = 0, row = 0, column = 0
    Output: 1.00000
      Constraints:
    1 <= n <= 25
    0 <= k <= 100
    0 <= row, column <= n - 1
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 3;
        int k = 2;
        int row = 0;
        int column = 0;
        double expected = 0.06250;
        var result = solution.knightProbability(n, k, row, column);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 1;
        int k = 0;
        int row = 0;
        int column = 0;
        double expected = 1.00000;
        var result = solution.knightProbability(n, k, row, column);
        assertThat(result).isEqualTo(expected);
    }

}
