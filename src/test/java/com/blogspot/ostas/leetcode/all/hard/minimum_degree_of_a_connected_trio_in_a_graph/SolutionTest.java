package com.blogspot.ostas.leetcode.all.hard.minimum_degree_of_a_connected_trio_in_a_graph;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 6, edges = [[1,2],[1,3],[3,2],[4,1],[5,2],[3,6]]
    Output: 3
    Explanation: There is exactly one trio, which is [1,2,3]. The edges that form its degree are bolded in the figure above.
    Example 2:
    Input: n = 7, edges = [[1,3],[4,1],[4,3],[2,5],[5,6],[6,7],[7,5],[2,6]]
    Output: 0
    Explanation: There are exactly three trios:
    1) [1,4,3] with degree 0.
    2) [2,5,6] with degree 2.
    3) [5,6,7] with degree 2.
      Constraints:
    2 <= n <= 400
    edges[i].length == 2
    1 <= edges.length <= n * (n-1) / 2
    1 <= ui, vi <= n
    ui != vi
    There are no repeated edges.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 6;
        int[][] edges = new int[][]{{1, 2}, {1, 3}, {3, 2}, {4, 1}, {5, 2}, {3, 6}};
        int expected = 3;
        var result = solution.minTrioDegree(n, edges);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 7;
        int[][] edges = new int[][]{{1, 3}, {4, 1}, {4, 3}, {2, 5}, {5, 6}, {6, 7}, {7, 5}, {2, 6}};
        int expected = 0;
        var result = solution.minTrioDegree(n, edges);
        assertThat(result).isEqualTo(expected);
    }

}
