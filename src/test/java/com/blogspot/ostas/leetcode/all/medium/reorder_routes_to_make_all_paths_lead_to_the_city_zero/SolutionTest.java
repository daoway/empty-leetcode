package com.blogspot.ostas.leetcode.all.medium.reorder_routes_to_make_all_paths_lead_to_the_city_zero;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 6, connections = [[0,1],[1,3],[2,3],[4,0],[4,5]]
    Output: 3
    Explanation: Change the direction of edges show in red such that each node can reach the node 0 (capital).
    Example 2:
    Input: n = 5, connections = [[1,0],[1,2],[3,2],[3,4]]
    Output: 2
    Explanation: Change the direction of edges show in red such that each node can reach the node 0 (capital).
    Example 3:
    Input: n = 3, connections = [[1,0],[2,0]]
    Output: 0
      Constraints:
    2 <= n <= 5 * 104
    connections.length == n - 1
    connections[i].length == 2
    0 <= ai, bi <= n - 1
    ai != bi
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 6;
        int[][] connections = new int[][]{{0, 1}, {1, 3}, {2, 3}, {4, 0}, {4, 5}};
        int expected = 3;
        var result = solution.minReorder(n, connections);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 5;
        int[][] connections = new int[][]{{1, 0}, {1, 2}, {3, 2}, {3, 4}};
        int expected = 2;
        var result = solution.minReorder(n, connections);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int n = 3;
        int[][] connections = new int[][]{{1, 0}, {2, 0}};
        int expected = 0;
        var result = solution.minReorder(n, connections);
        assertThat(result).isEqualTo(expected);
    }

}
