package com.blogspot.ostas.leetcode.all.medium.difference_of_number_of_distinct_values_on_diagonals;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: grid = [[1,2,3],[3,1,5],[3,2,1]]
    Output: [[1,1,0],[1,0,1],[0,1,1]]
    Explanation: The 1st diagram denotes the initial grid.
    The 2nd diagram denotes a grid for cell (0,0), where blue-colored cells are cells on its bottom-right diagonal.
    The 3rd diagram denotes a grid for cell (1,2), where red-colored cells are cells on its top-left diagonal.
    The 4th diagram denotes a grid for cell (1,1), where blue-colored cells are cells on its bottom-right diagonal and red-colored cells are cells on its top-left diagonal.
    - The cell (0,0) contains [1,1] on its bottom-right diagonal and [] on its top-left diagonal. The answer is |1 - 0| = 1.
    - The cell (1,2) contains [] on its bottom-right diagonal and [2] on its top-left diagonal. The answer is |0 - 1| = 1.
    - The cell (1,1) contains [1] on its bottom-right diagonal and [1] on its top-left diagonal. The answer is |1 - 1| = 0.
    The answers of other cells are similarly calculated.
    Example 2:
    Input: grid = [[1]]
    Output: [[0]]
    Explanation: - The cell (0,0) contains [] on its bottom-right diagonal and [] on its top-left diagonal. The answer is |0 - 0| = 0.
      Constraints:
    m == grid.length
    n == grid[i].length
    1 <= m, n, grid[i][j] <= 50
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] grid = new int[][]{{1, 2, 3}, {3, 1, 5}, {3, 2, 1}};
        int[][] expected = new int[][]{{1, 1, 0}, {1, 0, 1}, {0, 1, 1}};
        var result = solution.differenceOfDistinctValues(grid);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] grid = new int[][]{{1}};
        int[][] expected = new int[][]{{0}};
        var result = solution.differenceOfDistinctValues(grid);
        assertThat(result).isEqualTo(expected);
    }

}
