package com.blogspot.ostas.leetcode.all.medium.where_will_the_ball_fall;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: grid = [[1,1,1,-1,-1],[1,1,1,-1,-1],[-1,-1,-1,1,1],[1,1,1,1,-1],[-1,-1,-1,-1,-1]]
    Output: [1,-1,-1,-1,-1]
    Explanation: This example is shown in the photo.
    Ball b0 is dropped at column 0 and falls out of the box at column 1.
    Ball b1 is dropped at column 1 and will get stuck in the box between column 2 and 3 and row 1.
    Ball b2 is dropped at column 2 and will get stuck on the box between column 2 and 3 and row 0.
    Ball b3 is dropped at column 3 and will get stuck on the box between column 2 and 3 and row 0.
    Ball b4 is dropped at column 4 and will get stuck on the box between column 2 and 3 and row 1.
    Example 2:
    Input: grid = [[-1]]
    Output: [-1]
    Explanation: The ball gets stuck against the left wall.
    Example 3:
    Input: grid = [[1,1,1,1,1,1],[-1,-1,-1,-1,-1,-1],[1,1,1,1,1,1],[-1,-1,-1,-1,-1,-1]]
    Output: [0,1,2,3,4,-1]
      Constraints:
    m == grid.length
    n == grid[i].length
    1 <= m, n <= 100
    grid[i][j] is 1 or -1.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] grid =
                new int[][]{{1, 1, 1, -1, -1}, {1, 1, 1, -1, -1}, {-1, -1, -1, 1, 1}, {1, 1, 1, 1, -1},
                        {-1, -1, -1, -1, -1}};
        int[] expected = new int[]{1, -1, -1, -1, -1};
        var result = solution.findBall(grid);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] grid = new int[][]{{-1}};
        int[] expected = new int[]{-1};
        var result = solution.findBall(grid);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[][] grid = new int[][]{{1, 1, 1, 1, 1, 1}, {-1, -1, -1, -1, -1, -1}, {1, 1, 1, 1, 1, 1},
                {-1, -1, -1, -1, -1, -1}};
        int[] expected = new int[]{0, 1, 2, 3, 4, -1};
        var result = solution.findBall(grid);
        assertThat(result).isEqualTo(expected);
    }

}
