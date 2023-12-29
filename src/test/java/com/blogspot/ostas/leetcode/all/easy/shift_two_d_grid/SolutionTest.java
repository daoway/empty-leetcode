package com.blogspot.ostas.leetcode.all.easy.shift_two_d_grid;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: grid = [[1,2,3],[4,5,6],[7,8,9]], k = 1
    Output: [[9,1,2],[3,4,5],[6,7,8]]
    Example 2:
    Input: grid = [[3,8,1,9],[19,7,2,5],[4,6,11,10],[12,0,21,13]], k = 4
    Output: [[12,0,21,13],[3,8,1,9],[19,7,2,5],[4,6,11,10]]
    Example 3:
    Input: grid = [[1,2,3],[4,5,6],[7,8,9]], k = 9
    Output: [[1,2,3],[4,5,6],[7,8,9]]
      Constraints:
    m == grid.length
    n == grid[i].length
    1 <= m <= 50
    1 <= n <= 50
    -1000 <= grid[i][j] <= 1000
    0 <= k <= 100
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] grid = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int k = 1;
        List<List<Integer>> expected = List.of(List.of(9, 1, 2), List.of(3, 4, 5), List.of(6, 7, 8));
        var result = solution.shiftGrid(grid, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] grid = new int[][]{{3, 8, 1, 9}, {19, 7, 2, 5}, {4, 6, 11, 10}, {12, 0, 21, 13}};
        int k = 4;
        List<List<Integer>> expected =
                List.of(List.of(12, 0, 21, 13), List.of(3, 8, 1, 9), List.of(19, 7, 2, 5),
                        List.of(4, 6, 11, 10));
        var result = solution.shiftGrid(grid, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[][] grid = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int k = 9;
        List<List<Integer>> expected = List.of(List.of(1, 2, 3), List.of(4, 5, 6), List.of(7, 8, 9));
        var result = solution.shiftGrid(grid, k);
        assertThat(result).isEqualTo(expected);
    }

}
