package com.blogspot.ostas.leetcode.all.hard.bricks_falling_when_hit;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: grid = [[1,0,0,0],[1,1,1,0]], hits = [[1,0]]
    Output: [2]
    Explanation: Starting with the grid:
    [[1,0,0,0],
     [1,1,1,0]]
    We erase the underlined brick at (1,0), resulting in the grid:
    [[1,0,0,0],
     [0,1,1,0]]
    The two underlined bricks are no longer stable as they are no longer connected to the top nor adjacent to another stable brick, so they will fall. The resulting grid is:
    [[1,0,0,0],
     [0,0,0,0]]
    Hence the result is [2].
    Example 2:
    Input: grid = [[1,0,0,0],[1,1,0,0]], hits = [[1,1],[1,0]]
    Output: [0,0]
    Explanation: Starting with the grid:
    [[1,0,0,0],
     [1,1,0,0]]
    We erase the underlined brick at (1,1), resulting in the grid:
    [[1,0,0,0],
     [1,0,0,0]]
    All remaining bricks are still stable, so no bricks fall. The grid remains the same:
    [[1,0,0,0],
     [1,0,0,0]]
    Next, we erase the underlined brick at (1,0), resulting in the grid:
    [[1,0,0,0],
     [0,0,0,0]]
    Once again, all remaining bricks are still stable, so no bricks fall.
    Hence the result is [0,0].
      Constraints:
    m == grid.length
    n == grid[i].length
    1 <= m, n <= 200
    grid[i][j] is 0 or 1.
    1 <= hits.length <= 4 * 104
    hits[i].length == 2
    0 <= xi <= m - 1
    0 <= yi <= n - 1
    All (xi, yi) are unique.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] grid = new int[][]{{1, 0, 0, 0}, {1, 1, 1, 0}};
        int[][] hits = new int[][]{{1, 0}};
        int[] expected = new int[]{2};
        var result = solution.hitBricks(grid, hits);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] grid = new int[][]{{1, 0, 0, 0}, {1, 1, 0, 0}};
        int[][] hits = new int[][]{{1, 1}, {1, 0}};
        int[] expected = new int[]{0, 0};
        var result = solution.hitBricks(grid, hits);
        assertThat(result).isEqualTo(expected);
    }

}
