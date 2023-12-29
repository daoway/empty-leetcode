package com.blogspot.ostas.leetcode.all.hard.shortest_path_visiting_all_nodes;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: graph = [[1,2,3],[0],[0],[0]]
    Output: 4
    Explanation: One possible path is [1,0,2,0,3]
    Example 2:
    Input: graph = [[1],[0,2,4],[1,3,4],[2],[1,2]]
    Output: 4
    Explanation: One possible path is [0,1,4,2,3]
      Constraints:
    n == graph.length
    1 <= n <= 12
    0 <= graph[i].length < n
    graph[i] does not contain i.
    If graph[a] contains b, then graph[b] contains a.
    The input graph is always connected.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] graph = new int[][]{{1, 2, 3}, {0}, {0}, {0}};
        int expected = 4;
        var result = solution.shortestPathLength(graph);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] graph = new int[][]{{1}, {0, 2, 4}, {1, 3, 4}, {2}, {1, 2}};
        int expected = 4;
        var result = solution.shortestPathLength(graph);
        assertThat(result).isEqualTo(expected);
    }

}
