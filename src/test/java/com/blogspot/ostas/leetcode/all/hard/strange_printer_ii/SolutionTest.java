package com.blogspot.ostas.leetcode.all.hard.strange_printer_ii;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: targetGrid = [[1,1,1,1],[1,2,2,1],[1,2,2,1],[1,1,1,1]]
    Output: true
    Example 2:
    Input: targetGrid = [[1,1,1,1],[1,1,3,3],[1,1,3,4],[5,5,1,4]]
    Output: true
    Example 3:
    Input: targetGrid = [[1,2,1],[2,1,2],[1,2,1]]
    Output: false
    Explanation: It is impossible to form targetGrid because it is not allowed to print the same color in different turns.
      Constraints:
    m == targetGrid.length
    n == targetGrid[i].length
    1 <= m, n <= 60
    1 <= targetGrid[row][col] <= 60
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] targetGrid = new int[][]{{1, 1, 1, 1}, {1, 2, 2, 1}, {1, 2, 2, 1}, {1, 1, 1, 1}};
        boolean expected = true;
        var result = solution.isPrintable(targetGrid);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] targetGrid = new int[][]{{1, 1, 1, 1}, {1, 1, 3, 3}, {1, 1, 3, 4}, {5, 5, 1, 4}};
        boolean expected = true;
        var result = solution.isPrintable(targetGrid);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[][] targetGrid = new int[][]{{1, 2, 1}, {2, 1, 2}, {1, 2, 1}};
        boolean expected = false;
        var result = solution.isPrintable(targetGrid);
        assertThat(result).isEqualTo(expected);
    }

}
