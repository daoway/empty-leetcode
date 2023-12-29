package com.blogspot.ostas.leetcode.all.easy.largest_local_values_in_a_matrix;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: grid = [[9,9,8,1],[5,6,2,6],[8,2,6,4],[6,2,2,2]]
    Output: [[9,9],[8,6]]
    Explanation: The diagram above shows the original matrix and the generated matrix.
    Notice that each value in the generated matrix corresponds to the largest value of a contiguous 3 x 3 matrix in grid.
    Example 2:
    Input: grid = [[1,1,1,1,1],[1,1,1,1,1],[1,1,2,1,1],[1,1,1,1,1],[1,1,1,1,1]]
    Output: [[2,2,2],[2,2,2],[2,2,2]]
    Explanation: Notice that the 2 is contained within every contiguous 3 x 3 matrix in grid.
      Constraints:
    n == grid.length == grid[i].length
    3 <= n <= 100
    1 <= grid[i][j] <= 100
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] grid = new int[][]{{9, 9, 8, 1}, {5, 6, 2, 6}, {8, 2, 6, 4}, {6, 2, 2, 2}};
        int[][] expected = new int[][]{{9, 9}, {8, 6}};
        var result = solution.largestLocal(grid);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] grid = new int[][]{{1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 2, 1, 1}, {1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1}};
        int[][] expected = new int[][]{{2, 2, 2}, {2, 2, 2}, {2, 2, 2}};
        var result = solution.largestLocal(grid);
        assertThat(result).isEqualTo(expected);
    }

}
