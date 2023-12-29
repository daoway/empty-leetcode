package com.blogspot.ostas.leetcode.all.medium.disconnect_path_in_a_binary_matrix_by_at_most_one_flip;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: grid = [[1,1,1],[1,0,0],[1,1,1]]
    Output: true
    Explanation: We can change the cell shown in the diagram above. There is no path from (0, 0) to (2, 2) in the resulting grid.
    Example 2:
    Input: grid = [[1,1,1],[1,0,1],[1,1,1]]
    Output: false
    Explanation: It is not possible to change at most one cell such that there is not path from (0, 0) to (2, 2).
      Constraints:
    m == grid.length
    n == grid[i].length
    1 <= m, n <= 1000
    1 <= m * n <= 105
    grid[i][j] is either 0 or 1.
    grid[0][0] == grid[m - 1][n - 1] == 1
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] grid = new int[][]{{1, 1, 1}, {1, 0, 0}, {1, 1, 1}};
        boolean expected = true;
        var result = solution.isPossibleToCutPath(grid);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] grid = new int[][]{{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        boolean expected = false;
        var result = solution.isPossibleToCutPath(grid);
        assertThat(result).isEqualTo(expected);
    }

}
