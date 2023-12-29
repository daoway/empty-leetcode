package com.blogspot.ostas.leetcode.all.hard.escape_the_spreading_fire;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: grid = [[0,2,0,0,0,0,0],[0,0,0,2,2,1,0],[0,2,0,0,1,2,0],[0,0,2,2,2,0,2],[0,0,0,0,0,0,0]]
    Output: 3
    Explanation: The figure above shows the scenario where you stay in the initial position for 3 minutes.
    You will still be able to safely reach the safehouse.
    Staying for more than 3 minutes will not allow you to safely reach the safehouse.
    Example 2:
    Input: grid = [[0,0,0,0],[0,1,2,0],[0,2,0,0]]
    Output: -1
    Explanation: The figure above shows the scenario where you immediately move towards the safehouse.
    Fire will spread to any cell you move towards and it is impossible to safely reach the safehouse.
    Thus, -1 is returned.
    Example 3:
    Input: grid = [[0,0,0],[2,2,0],[1,2,0]]
    Output: 1000000000
    Explanation: The figure above shows the initial grid.
    Notice that the fire is contained by walls and you will always be able to safely reach the safehouse.
    Thus, 109 is returned.
      Constraints:
    m == grid.length
    n == grid[i].length
    2 <= m, n <= 300
    4 <= m * n <= 2 * 104
    grid[i][j] is either 0, 1, or 2.
    grid[0][0] == grid[m - 1][n - 1] == 0
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] grid = new int[][]{{0, 2, 0, 0, 0, 0, 0}, {0, 0, 0, 2, 2, 1, 0}, {0, 2, 0, 0, 1, 2, 0},
                {0, 0, 2, 2, 2, 0, 2}, {0, 0, 0, 0, 0, 0, 0}};
        int expected = 3;
        var result = solution.maximumMinutes(grid);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] grid = new int[][]{{0, 0, 0, 0}, {0, 1, 2, 0}, {0, 2, 0, 0}};
        int expected = -1;
        var result = solution.maximumMinutes(grid);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[][] grid = new int[][]{{0, 0, 0}, {2, 2, 0}, {1, 2, 0}};
        int expected = 1000000000;
        var result = solution.maximumMinutes(grid);
        assertThat(result).isEqualTo(expected);
    }

}
