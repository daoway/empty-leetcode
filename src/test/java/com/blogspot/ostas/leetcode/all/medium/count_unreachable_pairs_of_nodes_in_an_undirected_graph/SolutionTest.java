package com.blogspot.ostas.leetcode.all.medium.count_unreachable_pairs_of_nodes_in_an_undirected_graph;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 3, edges = [[0,1],[0,2],[1,2]]
    Output: 0
    Explanation: There are no pairs of nodes that are unreachable from each other. Therefore, we return 0.
    Example 2:
    Input: n = 7, edges = [[0,2],[0,5],[2,4],[1,6],[5,4]]
    Output: 14
    Explanation: There are 14 pairs of nodes that are unreachable from each other:
    [[0,1],[0,3],[0,6],[1,2],[1,3],[1,4],[1,5],[2,3],[2,6],[3,4],[3,5],[3,6],[4,6],[5,6]].
    Therefore, we return 14.
      Constraints:
    1 <= n <= 105
    0 <= edges.length <= 2 * 105
    edges[i].length == 2
    0 <= ai, bi < n
    ai != bi
    There are no repeated edges.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 3;
        int[][] edges = new int[][]{{0, 1}, {0, 2}, {1, 2}};
        long expected = 0;
        var result = solution.countPairs(n, edges);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 7;
        int[][] edges = new int[][]{{0, 2}, {0, 5}, {2, 4}, {1, 6}, {5, 4}};
        long expected = 14;
        var result = solution.countPairs(n, edges);
        assertThat(result).isEqualTo(expected);
    }

}
