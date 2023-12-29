package com.blogspot.ostas.leetcode.all.easy.find_center_of_star_graph;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: edges = [[1,2],[2,3],[4,2]]
    Output: 2
    Explanation: As shown in the figure above, node 2 is connected to every other node, so 2 is the center.
    Example 2:
    Input: edges = [[1,2],[5,1],[1,3],[1,4]]
    Output: 1
      Constraints:
    3 <= n <= 105
    edges.length == n - 1
    edges[i].length == 2
    1 <= ui, vi <= n
    ui != vi
    The given edges represent a valid star graph.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] edges = new int[][]{{1, 2}, {2, 3}, {4, 2}};
        int expected = 2;
        var result = solution.findCenter(edges);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] edges = new int[][]{{1, 2}, {5, 1}, {1, 3}, {1, 4}};
        int expected = 1;
        var result = solution.findCenter(edges);
        assertThat(result).isEqualTo(expected);
    }

}
