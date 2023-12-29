package com.blogspot.ostas.leetcode.all.hard.count_fertile_pyramids_in_a_land;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: grid = [[0,1,1,0],[1,1,1,1]]
    Output: 2
    Explanation: The 2 possible pyramidal plots are shown in blue and red respectively.
    There are no inverse pyramidal plots in this grid.
    Hence total number of pyramidal and inverse pyramidal plots is 2 + 0 = 2.
    Example 2:
    Input: grid = [[1,1,1],[1,1,1]]
    Output: 2
    Explanation: The pyramidal plot is shown in blue, and the inverse pyramidal plot is shown in red.
    Hence the total number of plots is 1 + 1 = 2.
    Example 3:
    Input: grid = [[1,1,1,1,0],[1,1,1,1,1],[1,1,1,1,1],[0,1,0,0,1]]
    Output: 13
    Explanation: There are 7 pyramidal plots, 3 of which are shown in the 2nd and 3rd figures.
    There are 6 inverse pyramidal plots, 2 of which are shown in the last figure.
    The total number of plots is 7 + 6 = 13.
      Constraints:
    m == grid.length
    n == grid[i].length
    1 <= m, n <= 1000
    1 <= m * n <= 105
    grid[i][j] is either 0 or 1.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] grid = new int[][]{{0, 1, 1, 0}, {1, 1, 1, 1}};
        int expected = 2;
        var result = solution.countPyramids(grid);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] grid = new int[][]{{1, 1, 1}, {1, 1, 1}};
        int expected = 2;
        var result = solution.countPyramids(grid);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[][] grid = new int[][]{{1, 1, 1, 1, 0}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {0, 1, 0, 0, 1}};
        int expected = 13;
        var result = solution.countPyramids(grid);
        assertThat(result).isEqualTo(expected);
    }

}
