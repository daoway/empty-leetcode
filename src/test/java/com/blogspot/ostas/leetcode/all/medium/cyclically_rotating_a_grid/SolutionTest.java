package com.blogspot.ostas.leetcode.all.medium.cyclically_rotating_a_grid;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: grid = [[40,10],[30,20]], k = 1
    Output: [[10,20],[40,30]]
    Explanation: The figures above represent the grid at every state.
    Example 2:
    Input: grid = [[1,2,3,4],[5,6,7,8],[9,10,11,12],[13,14,15,16]], k = 2
    Output: [[3,4,8,12],[2,11,10,16],[1,7,6,15],[5,9,13,14]]
    Explanation: The figures above represent the grid at every state.
      Constraints:
    m == grid.length
    n == grid[i].length
    2 <= m, n <= 50
    Both m and n are even integers.
    1 <= grid[i][j] <= 5000
    1 <= k <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] grid = new int[][]{{40, 10}, {30, 20}};
        int k = 1;
        int[][] expected = new int[][]{{10, 20}, {40, 30}};
        var result = solution.rotateGrid(grid, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] grid = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int k = 2;
        int[][] expected = new int[][]{{3, 4, 8, 12}, {2, 11, 10, 16}, {1, 7, 6, 15}, {5, 9, 13, 14}};
        var result = solution.rotateGrid(grid, k);
        assertThat(result).isEqualTo(expected);
    }

}
