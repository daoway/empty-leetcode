package com.blogspot.ostas.leetcode.all.hard.minimum_moves_to_reach_target_with_rotations;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: grid = [[0,0,0,0,0,1],
               [1,1,0,0,1,0],
               [0,0,0,0,1,1],
               [0,0,1,0,1,0],
               [0,1,1,0,0,0],
               [0,1,1,0,0,0]]
    Output: 11
    Explanation:
    One possible solution is [right, right, rotate clockwise, right, down, down, down, down, rotate counterclockwise, right, down].
    Example 2:
    Input: grid = [[0,0,1,1,1,1],
               [0,0,0,0,1,1],
               [1,1,0,0,0,1],
               [1,1,1,0,0,1],
               [1,1,1,0,0,1],
               [1,1,1,0,0,0]]
    Output: 9
      Constraints:
    2 <= n <= 100
    0 <= grid[i][j] <= 1
    It is guaranteed that the snake starts at empty cells.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] grid = new int[][]{{0, 0, 0, 0, 0, 1}, {1, 1, 0, 0, 1, 0}, {0, 0, 0, 0, 1, 1},
                {0, 0, 1, 0, 1, 0}, {0, 1, 1, 0, 0, 0}, {0, 1, 1, 0, 0, 0}};
        int expected = 11;
        var result = solution.minimumMoves(grid);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] grid = new int[][]{{0, 0, 1, 1, 1, 1}, {0, 0, 0, 0, 1, 1}, {1, 1, 0, 0, 0, 1},
                {1, 1, 1, 0, 0, 1}, {1, 1, 1, 0, 0, 1}, {1, 1, 1, 0, 0, 0}};
        int expected = 9;
        var result = solution.minimumMoves(grid);
        assertThat(result).isEqualTo(expected);
    }

}
