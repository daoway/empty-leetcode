package com.blogspot.ostas.leetcode.all.medium.minimum_operations_to_make_a_uni_value_grid;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: grid = [[2,4],[6,8]], x = 2
    Output: 4
    Explanation: We can make every element equal to 4 by doing the following:
    - Add x to 2 once.
    - Subtract x from 6 once.
    - Subtract x from 8 twice.
    A total of 4 operations were used.
    Example 2:
    Input: grid = [[1,5],[2,3]], x = 1
    Output: 5
    Explanation: We can make every element equal to 3.
    Example 3:
    Input: grid = [[1,2],[3,4]], x = 2
    Output: -1
    Explanation: It is impossible to make every element equal.
      Constraints:
    m == grid.length
    n == grid[i].length
    1 <= m, n <= 105
    1 <= m * n <= 105
    1 <= x, grid[i][j] <= 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] grid = new int[][]{{2, 4}, {6, 8}};
        int x = 2;
        int expected = 4;
        var result = solution.minOperations(grid, x);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] grid = new int[][]{{1, 5}, {2, 3}};
        int x = 1;
        int expected = 5;
        var result = solution.minOperations(grid, x);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[][] grid = new int[][]{{1, 2}, {3, 4}};
        int x = 2;
        int expected = -1;
        var result = solution.minOperations(grid, x);
        assertThat(result).isEqualTo(expected);
    }

}
