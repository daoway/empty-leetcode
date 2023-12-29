package com.blogspot.ostas.leetcode.all.medium.find_all_groups_of_farmland;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: land = [[1,0,0],[0,1,1],[0,1,1]]
    Output: [[0,0,0,0],[1,1,2,2]]
    Explanation:
    The first group has a top left corner at land[0][0] and a bottom right corner at land[0][0].
    The second group has a top left corner at land[1][1] and a bottom right corner at land[2][2].
    Example 2:
    Input: land = [[1,1],[1,1]]
    Output: [[0,0,1,1]]
    Explanation:
    The first group has a top left corner at land[0][0] and a bottom right corner at land[1][1].
    Example 3:
    Input: land = [[0]]
    Output: []
    Explanation:
    There are no groups of farmland.
      Constraints:
    m == land.length
    n == land[i].length
    1 <= m, n <= 300
    land consists of only 0's and 1's.
    Groups of farmland are rectangular in shape.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] land = new int[][]{{1, 0, 0}, {0, 1, 1}, {0, 1, 1}};
        int[][] expected = new int[][]{{0, 0, 0, 0}, {1, 1, 2, 2}};
        var result = solution.findFarmland(land);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] land = new int[][]{{1, 1}, {1, 1}};
        int[][] expected = new int[][]{{0, 0, 1, 1}};
        var result = solution.findFarmland(land);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[][] land = new int[][]{{0}};
        int[][] expected = new int[][]{};
        var result = solution.findFarmland(land);
        assertThat(result).isEqualTo(expected);
    }

}
