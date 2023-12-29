package com.blogspot.ostas.leetcode.all.medium.number_of_black_blocks;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: m = 3, n = 3, coordinates = [[0,0]]
    Output: [3,1,0,0,0]
    Explanation: The grid looks like this:
    There is only 1 block with one black cell, and it is the block starting with cell [0,0].
    The other 3 blocks start with cells [0,1], [1,0] and [1,1]. They all have zero black cells.
    Thus, we return [3,1,0,0,0].
    Example 2:
    Input: m = 3, n = 3, coordinates = [[0,0],[1,1],[0,2]]
    Output: [0,2,2,0,0]
    Explanation: The grid looks like this:
    There are 2 blocks with two black cells (the ones starting with cell coordinates [0,0] and [0,1]).
    The other 2 blocks have starting cell coordinates of [1,0] and [1,1]. They both have 1 black cell.
    Therefore, we return [0,2,2,0,0].
      Constraints:
    2 <= m <= 105
    2 <= n <= 105
    0 <= coordinates.length <= 104
    coordinates[i].length == 2
    0 <= coordinates[i][0] < m
    0 <= coordinates[i][1] < n
    It is guaranteed that coordinates contains pairwise distinct coordinates.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int m = 3;
        int n = 3;
        int[][] coordinates = new int[][]{{0, 0}};
        long[] expected = new long[]{3, 1, 0, 0, 0};
        var result = solution.countBlackBlocks(m, n, coordinates);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int m = 3;
        int n = 3;
        int[][] coordinates = new int[][]{{0, 0}, {1, 1}, {0, 2}};
        long[] expected = new long[]{0, 2, 2, 0, 0};
        var result = solution.countBlackBlocks(m, n, coordinates);
        assertThat(result).isEqualTo(expected);
    }

}
