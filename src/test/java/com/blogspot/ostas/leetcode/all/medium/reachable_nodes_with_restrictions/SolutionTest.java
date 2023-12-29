package com.blogspot.ostas.leetcode.all.medium.reachable_nodes_with_restrictions;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 7, edges = [[0,1],[1,2],[3,1],[4,0],[0,5],[5,6]], restricted = [4,5]
    Output: 4
    Explanation: The diagram above shows the tree.
    We have that [0,1,2,3] are the only nodes that can be reached from node 0 without visiting a restricted node.
    Example 2:
    Input: n = 7, edges = [[0,1],[0,2],[0,5],[0,4],[3,2],[6,5]], restricted = [4,2,1]
    Output: 3
    Explanation: The diagram above shows the tree.
    We have that [0,5,6] are the only nodes that can be reached from node 0 without visiting a restricted node.
      Constraints:
    2 <= n <= 105
    edges.length == n - 1
    edges[i].length == 2
    0 <= ai, bi < n
    ai != bi
    edges represents a valid tree.
    1 <= restricted.length < n
    1 <= restricted[i] < n
    All the values of restricted are unique.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 7;
        int[][] edges = new int[][]{{0, 1}, {1, 2}, {3, 1}, {4, 0}, {0, 5}, {5, 6}};
        int[] restricted = new int[]{4, 5};
        int expected = 4;
        var result = solution.reachableNodes(n, edges, restricted);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 7;
        int[][] edges = new int[][]{{0, 1}, {0, 2}, {0, 5}, {0, 4}, {3, 2}, {6, 5}};
        int[] restricted = new int[]{4, 2, 1};
        int expected = 3;
        var result = solution.reachableNodes(n, edges, restricted);
        assertThat(result).isEqualTo(expected);
    }

}
