package com.blogspot.ostas.leetcode.all.hard.maximum_number_of_points_from_grid_queries;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: grid = [[1,2,3],[2,5,7],[3,5,1]], queries = [5,6,2]
    Output: [5,8,1]
    Explanation: The diagrams above show which cells we visit to get points for each query.
    Example 2:
    Input: grid = [[5,2,1],[1,1,2]], queries = [3]
    Output: [0]
    Explanation: We can not get any points because the value of the top left cell is already greater than or equal to 3.
      Constraints:
    m == grid.length
    n == grid[i].length
    2 <= m, n <= 1000
    4 <= m * n <= 105
    k == queries.length
    1 <= k <= 104
    1 <= grid[i][j], queries[i] <= 106
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] grid = new int[][]{{1, 2, 3}, {2, 5, 7}, {3, 5, 1}};
        int[] queries = new int[]{5, 6, 2};
        int[] expected = new int[]{5, 8, 1};
        var result = solution.maxPoints(grid, queries);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] grid = new int[][]{{5, 2, 1}, {1, 1, 2}};
        int[] queries = new int[]{3};
        int[] expected = new int[]{0};
        var result = solution.maxPoints(grid, queries);
        assertThat(result).isEqualTo(expected);
    }

}
