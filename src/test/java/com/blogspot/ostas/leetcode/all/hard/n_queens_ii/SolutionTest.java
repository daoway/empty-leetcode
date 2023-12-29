package com.blogspot.ostas.leetcode.all.hard.n_queens_ii;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 4
    Output: 2
    Explanation: There are two distinct solutions to the 4-queens puzzle as shown.
    Example 2:
    Input: n = 1
    Output: 1
      Constraints:
    1 <= n <= 9
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 4;
        int expected = 2;
        var result = solution.totalNQueens(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 1;
        int expected = 1;
        var result = solution.totalNQueens(n);
        assertThat(result).isEqualTo(expected);
    }

}
