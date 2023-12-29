package com.blogspot.ostas.leetcode.all.hard.grid_illumination;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 5, lamps = [[0,0],[4,4]], queries = [[1,1],[1,0]]
    Output: [1,0]
    Explanation: We have the initial grid with all lamps turned off. In the above picture we see the grid after turning on the lamp at grid[0][0] then turning on the lamp at grid[4][4].
    The 0th query asks if the lamp at grid[1][1] is illuminated or not (the blue square). It is illuminated, so set ans[0] = 1. Then, we turn off all lamps in the red square.
    The 1st query asks if the lamp at grid[1][0] is illuminated or not (the blue square). It is not illuminated, so set ans[1] = 0. Then, we turn off all lamps in the red rectangle.
    Example 2:
    Input: n = 5, lamps = [[0,0],[4,4]], queries = [[1,1],[1,1]]
    Output: [1,1]
    Example 3:
    Input: n = 5, lamps = [[0,0],[0,4]], queries = [[0,4],[0,1],[1,4]]
    Output: [1,1,0]
      Constraints:
    1 <= n <= 109
    0 <= lamps.length <= 20000
    0 <= queries.length <= 20000
    lamps[i].length == 2
    0 <= rowi, coli < n
    queries[j].length == 2
    0 <= rowj, colj < n
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 5;
        int[][] lamps = new int[][]{{0, 0}, {4, 4}};
        int[][] queries = new int[][]{{1, 1}, {1, 0}};
        int[] expected = new int[]{1, 0};
        var result = solution.gridIllumination(n, lamps, queries);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 5;
        int[][] lamps = new int[][]{{0, 0}, {4, 4}};
        int[][] queries = new int[][]{{1, 1}, {1, 1}};
        int[] expected = new int[]{1, 1};
        var result = solution.gridIllumination(n, lamps, queries);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int n = 5;
        int[][] lamps = new int[][]{{0, 0}, {0, 4}};
        int[][] queries = new int[][]{{0, 4}, {0, 1}, {1, 4}};
        int[] expected = new int[]{1, 1, 0};
        var result = solution.gridIllumination(n, lamps, queries);
        assertThat(result).isEqualTo(expected);
    }

}
