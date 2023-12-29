package com.blogspot.ostas.leetcode.all.medium.unique_paths_ii;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: obstacleGrid = [[0,0,0],[0,1,0],[0,0,0]]
    Output: 2
    Explanation: There is one obstacle in the middle of the 3x3 grid above.
    There are two ways to reach the bottom-right corner:
    1. Right -> Right -> Down -> Down
    2. Down -> Down -> Right -> Right
    Example 2:
    Input: obstacleGrid = [[0,1],[0,0]]
    Output: 1
      Constraints:
    m == obstacleGrid.length
    n == obstacleGrid[i].length
    1 <= m, n <= 100
    obstacleGrid[i][j] is 0 or 1.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] obstacleGrid = new int[][]{{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        int expected = 2;
        var result = solution.uniquePathsWithObstacles(obstacleGrid);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] obstacleGrid = new int[][]{{0, 1}, {0, 0}};
        int expected = 1;
        var result = solution.uniquePathsWithObstacles(obstacleGrid);
        assertThat(result).isEqualTo(expected);
    }

}
