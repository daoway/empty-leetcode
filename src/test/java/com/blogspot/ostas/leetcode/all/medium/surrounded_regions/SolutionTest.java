package com.blogspot.ostas.leetcode.all.medium.surrounded_regions;

import org.junit.jupiter.api.Test;

class SolutionTest {

    /*
        Example 1:
    Input: board = [["X","X","X","X"],["X","O","O","X"],["X","X","O","X"],["X","O","X","X"]]
    Output: [["X","X","X","X"],["X","X","X","X"],["X","X","X","X"],["X","O","X","X"]]
    Explanation: Notice that an 'O' should not be flipped if:
    - It is on the border, or
    - It is adjacent to an 'O' that should not be flipped.
    The bottom 'O' is on the border, so it is not flipped.
    The other three 'O' form a surrounded region, so they are flipped.
    Example 2:
    Input: board = [["X"]]
    Output: [["X"]]
      Constraints:
    m == board.length
    n == board[i].length
    1 <= m, n <= 200
    board[i][j] is 'X' or 'O'.
    */

    @Test
    void test_0() {
        var solution = new Solution();
        char[][] board = new char[][]{};
        solution.solve(board);
    }
}
