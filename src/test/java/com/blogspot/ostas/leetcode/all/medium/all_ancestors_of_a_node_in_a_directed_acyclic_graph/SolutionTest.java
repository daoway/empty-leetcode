package com.blogspot.ostas.leetcode.all.medium.all_ancestors_of_a_node_in_a_directed_acyclic_graph;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 8, edgeList = [[0,3],[0,4],[1,3],[2,4],[2,7],[3,5],[3,6],[3,7],[4,6]]
    Output: [[],[],[],[0,1],[0,2],[0,1,3],[0,1,2,3,4],[0,1,2,3]]
    Explanation:
    The above diagram represents the input graph.
    - Nodes 0, 1, and 2 do not have any ancestors.
    - Node 3 has two ancestors 0 and 1.
    - Node 4 has two ancestors 0 and 2.
    - Node 5 has three ancestors 0, 1, and 3.
    - Node 6 has five ancestors 0, 1, 2, 3, and 4.
    - Node 7 has four ancestors 0, 1, 2, and 3.
    Example 2:
    Input: n = 5, edgeList = [[0,1],[0,2],[0,3],[0,4],[1,2],[1,3],[1,4],[2,3],[2,4],[3,4]]
    Output: [[],[0],[0,1],[0,1,2],[0,1,2,3]]
    Explanation:
    The above diagram represents the input graph.
    - Node 0 does not have any ancestor.
    - Node 1 has one ancestor 0.
    - Node 2 has two ancestors 0 and 1.
    - Node 3 has three ancestors 0, 1, and 2.
    - Node 4 has four ancestors 0, 1, 2, and 3.
      Constraints:
    1 <= n <= 1000
    0 <= edges.length <= min(2000, n * (n - 1) / 2)
    edges[i].length == 2
    0 <= fromi, toi <= n - 1
    fromi != toi
    There are no duplicate edges.
    The graph is directed and acyclic.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 8;
        int[][] edges = new int[][]{{0, 3}, {0, 4}, {1, 3}, {2, 4}, {2, 7}, {3, 5}, {3, 6}, {3, 7}, {4, 6}};
        List<List<Integer>> expected =
                List.of(List.of(), List.of(), List.of(), List.of(0, 1), List.of(0, 2),
                        List.of(0, 1, 3), List.of(0, 1, 2, 3, 4), List.of(0, 1, 2, 3));
        var result = solution.getAncestors(n, edges);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 5;
        int[][] edges = new int[][]{{0, 1}, {0, 2}, {0, 3}, {0, 4}, {1, 2}, {1, 3}, {1, 4}, {2, 3}, {2, 4}, {3, 4}};
        List<List<Integer>> expected = List.of(List.of(), List.of(0), List.of(0, 1), List.of(0, 1, 2),
                List.of(0, 1, 2, 3));
        var result = solution.getAncestors(n, edges);
        assertThat(result).isEqualTo(expected);
    }

}
