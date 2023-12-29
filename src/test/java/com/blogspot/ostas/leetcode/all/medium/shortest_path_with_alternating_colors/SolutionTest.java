package com.blogspot.ostas.leetcode.all.medium.shortest_path_with_alternating_colors;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 3, redEdges = [[0,1],[1,2]], blueEdges = []
    Output: [0,1,-1]
    Example 2:
    Input: n = 3, redEdges = [[0,1]], blueEdges = [[2,1]]
    Output: [0,1,-1]
      Constraints:
    1 <= n <= 100
    0 <= redEdges.length, blueEdges.length <= 400
    redEdges[i].length == blueEdges[j].length == 2
    0 <= ai, bi, uj, vj < n
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 3;
        int[][] redEdges = new int[][]{{0, 1}, {1, 2}};
        int[][] blueEdges = new int[][]{};
        int[] expected = new int[]{0, 1, -1};
        var result = solution.shortestAlternatingPaths(n, redEdges, blueEdges);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 3;
        int[][] redEdges = new int[][]{{0, 1}};
        int[][] blueEdges = new int[][]{{2, 1}};
        int[] expected = new int[]{0, 1, -1};
        var result = solution.shortestAlternatingPaths(n, redEdges, blueEdges);
        assertThat(result).isEqualTo(expected);
    }

}
