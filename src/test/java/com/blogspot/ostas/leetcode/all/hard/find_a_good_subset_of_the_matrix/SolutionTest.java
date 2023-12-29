package com.blogspot.ostas.leetcode.all.hard.find_a_good_subset_of_the_matrix;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: grid = [[0,1,1,0],[0,0,0,1],[1,1,1,1]]
    Output: [0,1]
    Explanation: We can choose the 0th and 1st rows to create a good subset of rows.
    The length of the chosen subset is 2.
    - The sum of the 0th column is 0 + 0 = 0, which is at most half of the length of the subset.
    - The sum of the 1st column is 1 + 0 = 1, which is at most half of the length of the subset.
    - The sum of the 2nd column is 1 + 0 = 1, which is at most half of the length of the subset.
    - The sum of the 3rd column is 0 + 1 = 1, which is at most half of the length of the subset.
    Example 2:
    Input: grid = [[0]]
    Output: [0]
    Explanation: We can choose the 0th row to create a good subset of rows.
    The length of the chosen subset is 1.
    - The sum of the 0th column is 0, which is at most half of the length of the subset.
    Example 3:
    Input: grid = [[1,1,1],[1,1,1]]
    Output: []
    Explanation: It is impossible to choose any subset of rows to create a good subset.
      Constraints:
    m == grid.length
    n == grid[i].length
    1 <= m <= 104
    1 <= n <= 5
    grid[i][j] is either 0 or 1.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] grid = new int[][]{{0, 1, 1, 0}, {0, 0, 0, 1}, {1, 1, 1, 1}};
        List<Integer> expected = List.of(0, 1);
        var result = solution.goodSubsetofBinaryMatrix(grid);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] grid = new int[][]{{0}};
        List<Integer> expected = List.of(0);
        var result = solution.goodSubsetofBinaryMatrix(grid);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[][] grid = new int[][]{{1, 1, 1}, {1, 1, 1}};
        List<Integer> expected = List.of();
        var result = solution.goodSubsetofBinaryMatrix(grid);
        assertThat(result).isEqualTo(expected);
    }

}
