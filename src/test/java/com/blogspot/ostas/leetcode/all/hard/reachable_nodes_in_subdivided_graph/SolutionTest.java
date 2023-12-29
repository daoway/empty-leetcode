package com.blogspot.ostas.leetcode.all.hard.reachable_nodes_in_subdivided_graph;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: edges = [[0,1,10],[0,2,1],[1,2,2]], maxMoves = 6, n = 3
    Output: 13
    Explanation: The edge subdivisions are shown in the image above.
    The nodes that are reachable are highlighted in yellow.
    Example 2:
    Input: edges = [[0,1,4],[1,2,6],[0,2,8],[1,3,1]], maxMoves = 10, n = 4
    Output: 23
    Example 3:
    Input: edges = [[1,2,4],[1,4,5],[1,3,1],[2,3,4],[3,4,5]], maxMoves = 17, n = 5
    Output: 1
    Explanation: Node 0 is disconnected from the rest of the graph, so only node 0 is reachable.
      Constraints:
    0 <= edges.length <= min(n * (n - 1) / 2, 104)
    edges[i].length == 3
    0 <= ui < vi < n
    There are no multiple edges in the graph.
    0 <= cnti <= 104
    0 <= maxMoves <= 109
    1 <= n <= 3000
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] edges = new int[][]{{0, 1, 10}, {0, 2, 1}, {1, 2, 2}};
        int maxMoves = 6;
        int n = 3;
        int expected = 13;
        var result = solution.reachableNodes(edges, maxMoves, n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] edges = new int[][]{{0, 1, 4}, {1, 2, 6}, {0, 2, 8}, {1, 3, 1}};
        int maxMoves = 10;
        int n = 4;
        int expected = 23;
        var result = solution.reachableNodes(edges, maxMoves, n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[][] edges = new int[][]{{1, 2, 4}, {1, 4, 5}, {1, 3, 1}, {2, 3, 4}, {3, 4, 5}};
        int maxMoves = 17;
        int n = 5;
        int expected = 1;
        var result = solution.reachableNodes(edges, maxMoves, n);
        assertThat(result).isEqualTo(expected);
    }

}
