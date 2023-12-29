package com.blogspot.ostas.leetcode.all.hard.n_queens.v1;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 4
    Output: [[".Q..","...Q","Q...","..Q."],["..Q.","Q...","...Q",".Q.."]]
    Explanation: There exist two distinct solutions to the 4-queens puzzle as shown above
    Example 2:
    Input: n = 1
    Output: [["Q"]]
      Constraints:
    1 <= n <= 9
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 4;
        List<List<String>> expected = List.of(
                List.of(
                        ".Q..",
                        "...Q",
                        "Q...",
                        "..Q."
                ),
                List.of(
                        "..Q.",
                        "Q...",
                        "...Q",
                        ".Q.."
                )
        );
        var result = solution.solveNQueens(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 1;
        List<List<String>> expected = List.of(List.of("Q"));
        var result = solution.solveNQueens(n);
        assertThat(result).isEqualTo(expected);
    }

}
