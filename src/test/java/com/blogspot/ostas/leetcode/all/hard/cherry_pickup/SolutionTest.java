package com.blogspot.ostas.leetcode.all.hard.cherry_pickup;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: grid = [[0,1,-1],[1,0,-1],[1,1,1]]
    Output: 5
    Explanation: The player started at (0, 0) and went down, down, right right to reach (2, 2).
    4 cherries were picked up during this single trip, and the matrix becomes [[0,1,-1],[0,0,-1],[0,0,0]].
    Then, the player went left, up, up, left to return home, picking up one more cherry.
    The total number of cherries picked up is 5, and this is the maximum possible.
    Example 2:
    Input: grid = [[1,1,-1],[1,-1,1],[-1,1,1]]
    Output: 0
      Constraints:
    n == grid.length
    n == grid[i].length
    1 <= n <= 50
    grid[i][j] is -1, 0, or 1.
    grid[0][0] != -1
    grid[n - 1][n - 1] != -1
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] grid = new int[][]{{0, 1, -1}, {1, 0, -1}, {1, 1, 1}};
        int expected = 5;
        var result = solution.cherryPickup(grid);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] grid = new int[][]{{1, 1, -1}, {1, -1, 1}, {-1, 1, 1}};
        int expected = 0;
        var result = solution.cherryPickup(grid);
        assertThat(result).isEqualTo(expected);
    }

}
