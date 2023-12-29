package com.blogspot.ostas.leetcode.all.hard.paths_in_matrix_whose_sum_is_divisible_by_k;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: grid = [[5,2,4],[3,0,5],[0,7,2]], k = 3
    Output: 2
    Explanation: There are two paths where the sum of the elements on the path is divisible by k.
    The first path highlighted in red has a sum of 5 + 2 + 4 + 5 + 2 = 18 which is divisible by 3.
    The second path highlighted in blue has a sum of 5 + 3 + 0 + 5 + 2 = 15 which is divisible by 3.
    Example 2:
    Input: grid = [[0,0]], k = 5
    Output: 1
    Explanation: The path highlighted in red has a sum of 0 + 0 = 0 which is divisible by 5.
    Example 3:
    Input: grid = [[7,3,4,9],[2,3,6,2],[2,3,7,0]], k = 1
    Output: 10
    Explanation: Every integer is divisible by 1 so the sum of the elements on every possible path is divisible by k.
      Constraints:
    m == grid.length
    n == grid[i].length
    1 <= m, n <= 5 * 104
    1 <= m * n <= 5 * 104
    0 <= grid[i][j] <= 100
    1 <= k <= 50
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] grid = new int[][]{{5, 2, 4}, {3, 0, 5}, {0, 7, 2}};
        int k = 3;
        int expected = 2;
        var result = solution.numberOfPaths(grid, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] grid = new int[][]{{0, 0}};
        int k = 5;
        int expected = 1;
        var result = solution.numberOfPaths(grid, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[][] grid = new int[][]{{7, 3, 4, 9}, {2, 3, 6, 2}, {2, 3, 7, 0}};
        int k = 1;
        int expected = 10;
        var result = solution.numberOfPaths(grid, k);
        assertThat(result).isEqualTo(expected);
    }

}
