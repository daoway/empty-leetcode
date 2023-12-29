package com.blogspot.ostas.leetcode.all.hard.redundant_connection_ii;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: edges = [[1,2],[1,3],[2,3]]
    Output: [2,3]
    Example 2:
    Input: edges = [[1,2],[2,3],[3,4],[4,1],[1,5]]
    Output: [4,1]
      Constraints:
    n == edges.length
    3 <= n <= 1000
    edges[i].length == 2
    1 <= ui, vi <= n
    ui != vi
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] edges = new int[][]{{1, 2}, {1, 3}, {2, 3}};
        int[] expected = new int[]{2, 3};
        var result = solution.findRedundantDirectedConnection(edges);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] edges = new int[][]{{1, 2}, {2, 3}, {3, 4}, {4, 1}, {1, 5}};
        int[] expected = new int[]{4, 1};
        var result = solution.findRedundantDirectedConnection(edges);
        assertThat(result).isEqualTo(expected);
    }

}
