package com.blogspot.ostas.leetcode.all.easy.count_negative_numbers_in_a_sorted_matrix;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
    Output: 8
    Explanation: There are 8 negatives number in the matrix.
    Example 2:
    Input: grid = [[3,2],[1,0]]
    Output: 0
      Constraints:
    m == grid.length
    n == grid[i].length
    1 <= m, n <= 100
    -100 <= grid[i][j] <= 100
      Follow up: Could you find an O(n + m) solution?
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] grid = new int[][]{{4, 3, 2, -1}, {3, 2, 1, -1}, {1, 1, -1, -2}, {-1, -1, -2, -3}};
        int expected = 8;
        var result = solution.countNegatives(grid);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] grid = new int[][]{{3, 2}, {1, 0}};
        int expected = 0;
        var result = solution.countNegatives(grid);
        assertThat(result).isEqualTo(expected);
    }

}
