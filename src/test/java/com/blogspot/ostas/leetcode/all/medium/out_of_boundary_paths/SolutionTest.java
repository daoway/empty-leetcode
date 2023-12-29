package com.blogspot.ostas.leetcode.all.medium.out_of_boundary_paths;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: m = 2, n = 2, maxMove = 2, startRow = 0, startColumn = 0
    Output: 6
    Example 2:
    Input: m = 1, n = 3, maxMove = 3, startRow = 0, startColumn = 1
    Output: 12
      Constraints:
    1 <= m, n <= 50
    0 <= maxMove <= 50
    0 <= startRow < m
    0 <= startColumn < n
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int m = 2;
        int n = 2;
        int maxMove = 2;
        int startRow = 0;
        int startColumn = 0;
        int expected = 6;
        var result = solution.findPaths(m, n, maxMove, startRow, startColumn);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int m = 1;
        int n = 3;
        int maxMove = 3;
        int startRow = 0;
        int startColumn = 1;
        int expected = 12;
        var result = solution.findPaths(m, n, maxMove, startRow, startColumn);
        assertThat(result).isEqualTo(expected);
    }

}
