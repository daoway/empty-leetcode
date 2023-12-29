package com.blogspot.ostas.leetcode.all.hard.shortest_cycle_in_a_graph;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 7, edges = [[0,1],[1,2],[2,0],[3,4],[4,5],[5,6],[6,3]]
    Output: 3
    Explanation: The cycle with the smallest length is : 0 -> 1 -> 2 -> 0
    Example 2:
    Input: n = 4, edges = [[0,1],[0,2]]
    Output: -1
    Explanation: There are no cycles in this graph.
      Constraints:
    2 <= n <= 1000
    1 <= edges.length <= 1000
    edges[i].length == 2
    0 <= ui, vi < n
    ui != vi
    There are no repeated edges.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 7;
        int[][] edges = new int[][]{{0, 1}, {1, 2}, {2, 0}, {3, 4}, {4, 5}, {5, 6}, {6, 3}};
        int expected = 3;
        var result = solution.findShortestCycle(n, edges);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 4;
        int[][] edges = new int[][]{{0, 1}, {0, 2}};
        int expected = -1;
        var result = solution.findShortestCycle(n, edges);
        assertThat(result).isEqualTo(expected);
    }

}
