package com.blogspot.ostas.leetcode.all.hard.modify_graph_edge_weights;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 5, edges = [[4,1,-1],[2,0,-1],[0,3,-1],[4,3,-1]], source = 0, destination = 1, target = 5
    Output: [[4,1,1],[2,0,1],[0,3,3],[4,3,1]]
    Explanation: The graph above shows a possible modification to the edges, making the distance from 0 to 1 equal to 5.
    Example 2:
    Input: n = 3, edges = [[0,1,-1],[0,2,5]], source = 0, destination = 2, target = 6
    Output: []
    Explanation: The graph above contains the initial edges. It is not possible to make the distance from 0 to 2 equal to 6 by modifying the edge with weight -1. So, an empty array is returned.
    Example 3:
    Input: n = 4, edges = [[1,0,4],[1,2,3],[2,3,5],[0,3,-1]], source = 0, destination = 2, target = 6
    Output: [[1,0,4],[1,2,3],[2,3,5],[0,3,1]]
    Explanation: The graph above shows a modified graph having the shortest distance from 0 to 2 as 6.
      Constraints:
    1 <= n <= 100
    1 <= edges.length <= n * (n - 1) / 2
    edges[i].length == 3
    0 <= ai, bi < n
    wi = -1 or 1 <= wi <= 107
    ai != bi
    0 <= source, destination < n
    source != destination
    1 <= target <= 109
    The graph is connected, and there are no self-loops or repeated edges
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 5;
        int[][] edges = new int[][]{{4, 1, -1}, {2, 0, -1}, {0, 3, -1}, {4, 3, -1}};
        int source = 0;
        int destination = 1;
        int target = 5;
        int[][] expected = new int[][]{{4, 1, 1}, {2, 0, 1}, {0, 3, 3}, {4, 3, 1}};
        var result = solution.modifiedGraphEdges(n, edges, source, destination, target);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 3;
        int[][] edges = new int[][]{{0, 1, -1}, {0, 2, 5}};
        int source = 0;
        int destination = 2;
        int target = 6;
        int[][] expected = new int[][]{};
        var result = solution.modifiedGraphEdges(n, edges, source, destination, target);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int n = 4;
        int[][] edges = new int[][]{{1, 0, 4}, {1, 2, 3}, {2, 3, 5}, {0, 3, -1}};
        int source = 0;
        int destination = 2;
        int target = 6;
        int[][] expected = new int[][]{{1, 0, 4}, {1, 2, 3}, {2, 3, 5}, {0, 3, 1}};
        var result = solution.modifiedGraphEdges(n, edges, source, destination, target);
        assertThat(result).isEqualTo(expected);
    }

}
