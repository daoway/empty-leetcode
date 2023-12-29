package com.blogspot.ostas.leetcode.all.medium.map_of_highest_peak;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: isWater = [[0,1],[0,0]]
    Output: [[1,0],[2,1]]
    Explanation: The image shows the assigned heights of each cell.
    The blue cell is the water cell, and the green cells are the land cells.
    Example 2:
    Input: isWater = [[0,0,1],[1,0,0],[0,0,0]]
    Output: [[1,1,0],[0,1,1],[1,2,2]]
    Explanation: A height of 2 is the maximum possible height of any assignment.
    Any height assignment that has a maximum height of 2 while still meeting the rules will also be accepted.
      Constraints:
    m == isWater.length
    n == isWater[i].length
    1 <= m, n <= 1000
    isWater[i][j] is 0 or 1.
    There is at least one water cell.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] isWater = new int[][]{{0, 1}, {0, 0}};
        int[][] expected = new int[][]{{1, 0}, {2, 1}};
        var result = solution.highestPeak(isWater);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] isWater = new int[][]{{0, 0, 1}, {1, 0, 0}, {0, 0, 0}};
        int[][] expected = new int[][]{{1, 1, 0}, {0, 1, 1}, {1, 2, 2}};
        var result = solution.highestPeak(isWater);
        assertThat(result).isEqualTo(expected);
    }

}
