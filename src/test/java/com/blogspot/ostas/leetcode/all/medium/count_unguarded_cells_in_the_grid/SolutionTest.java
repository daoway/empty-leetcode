package com.blogspot.ostas.leetcode.all.medium.count_unguarded_cells_in_the_grid;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: m = 4, n = 6, guards = [[0,0],[1,1],[2,3]], walls = [[0,1],[2,2],[1,4]]
    Output: 7
    Explanation: The guarded and unguarded cells are shown in red and green respectively in the above diagram.
    There are a total of 7 unguarded cells, so we return 7.
    Example 2:
    Input: m = 3, n = 3, guards = [[1,1]], walls = [[0,1],[1,0],[2,1],[1,2]]
    Output: 4
    Explanation: The unguarded cells are shown in green in the above diagram.
    There are a total of 4 unguarded cells, so we return 4.
      Constraints:
    1 <= m, n <= 105
    2 <= m * n <= 105
    1 <= guards.length, walls.length <= 5 * 104
    2 <= guards.length + walls.length <= m * n
    guards[i].length == walls[j].length == 2
    0 <= rowi, rowj < m
    0 <= coli, colj < n
    All the positions in guards and walls are unique.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int m = 4;
        int n = 6;
        int[][] guards = new int[][]{{0, 0}, {1, 1}, {2, 3}};
        int[][] walls = new int[][]{{0, 1}, {2, 2}, {1, 4}};
        int expected = 7;
        var result = solution.countUnguarded(m, n, guards, walls);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int m = 3;
        int n = 3;
        int[][] guards = new int[][]{{1, 1}};
        int[][] walls = new int[][]{{0, 1}, {1, 0}, {2, 1}, {1, 2}};
        int expected = 4;
        var result = solution.countUnguarded(m, n, guards, walls);
        assertThat(result).isEqualTo(expected);
    }

}
