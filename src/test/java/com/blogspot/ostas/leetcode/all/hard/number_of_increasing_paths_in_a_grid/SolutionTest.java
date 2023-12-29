package com.blogspot.ostas.leetcode.all.hard.number_of_increasing_paths_in_a_grid;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: grid = [[1,1],[3,4]]
    Output: 8
    Explanation: The strictly increasing paths are:
    - Paths with length 1: [1], [1], [3], [4].
    - Paths with length 2: [1 -> 3], [1 -> 4], [3 -> 4].
    - Paths with length 3: [1 -> 3 -> 4].
    The total number of paths is 4 + 3 + 1 = 8.
    Example 2:
    Input: grid = [[1],[2]]
    Output: 3
    Explanation: The strictly increasing paths are:
    - Paths with length 1: [1], [2].
    - Paths with length 2: [1 -> 2].
    The total number of paths is 2 + 1 = 3.
      Constraints:
    m == grid.length
    n == grid[i].length
    1 <= m, n <= 1000
    1 <= m * n <= 105
    1 <= grid[i][j] <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] grid = new int[][]{{1, 1}, {3, 4}};
        int expected = 8;
        var result = solution.countPaths(grid);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] grid = new int[][]{{1}, {2}};
        int expected = 3;
        var result = solution.countPaths(grid);
        assertThat(result).isEqualTo(expected);
    }

}
