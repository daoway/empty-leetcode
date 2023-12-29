package com.blogspot.ostas.leetcode.all.medium.max_increase_to_keep_city_skyline;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: grid = [[3,0,8,4],[2,4,5,7],[9,2,6,3],[0,3,1,0]]
    Output: 35
    Explanation: The building heights are shown in the center of the above image.
    The skylines when viewed from each cardinal direction are drawn in red.
    The grid after increasing the height of buildings without affecting skylines is:
    gridNew = [ [8, 4, 8, 7],
            [7, 4, 7, 7],
            [9, 4, 8, 7],
            [3, 3, 3, 3] ]
    Example 2:
    Input: grid = [[0,0,0],[0,0,0],[0,0,0]]
    Output: 0
    Explanation: Increasing the height of any building will result in the skyline changing.
      Constraints:
    n == grid.length
    n == grid[r].length
    2 <= n <= 50
    0 <= grid[r][c] <= 100
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] grid = new int[][]{{3, 0, 8, 4}, {2, 4, 5, 7}, {9, 2, 6, 3}, {0, 3, 1, 0}};
        int expected = 35;
        var result = solution.maxIncreaseKeepingSkyline(grid);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] grid = new int[][]{{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        int expected = 0;
        var result = solution.maxIncreaseKeepingSkyline(grid);
        assertThat(result).isEqualTo(expected);
    }

}
