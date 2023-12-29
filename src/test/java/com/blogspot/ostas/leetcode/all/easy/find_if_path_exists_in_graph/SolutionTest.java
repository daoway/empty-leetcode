package com.blogspot.ostas.leetcode.all.easy.find_if_path_exists_in_graph;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 3, edges = [[0,1],[1,2],[2,0]], source = 0, destination = 2
    Output: true
    Explanation: There are two paths from vertex 0 to vertex 2:
    - 0 → 1 → 2
    - 0 → 2
    Example 2:
    Input: n = 6, edges = [[0,1],[0,2],[3,5],[5,4],[4,3]], source = 0, destination = 5
    Output: false
    Explanation: There is no path from vertex 0 to vertex 5.
      Constraints:
    1 <= n <= 2 * 105
    0 <= edges.length <= 2 * 105
    edges[i].length == 2
    0 <= ui, vi <= n - 1
    ui != vi
    0 <= source, destination <= n - 1
    There are no duplicate edges.
    There are no self edges.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 3;
        int[][] edges = new int[][]{{0, 1}, {1, 2}, {2, 0}};
        int source = 0;
        int destination = 2;
        boolean expected = true;
        var result = solution.validPath(n, edges, source, destination);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 6;
        int[][] edges = new int[][]{{0, 1}, {0, 2}, {3, 5}, {5, 4}, {4, 3}};
        int source = 0;
        int destination = 5;
        boolean expected = false;
        var result = solution.validPath(n, edges, source, destination);
        assertThat(result).isEqualTo(expected);
    }

}
