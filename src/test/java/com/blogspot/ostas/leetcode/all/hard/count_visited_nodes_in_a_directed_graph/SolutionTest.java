package com.blogspot.ostas.leetcode.all.hard.count_visited_nodes_in_a_directed_graph;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: edges = [1,2,0,0]
    Output: [3,3,3,4]
    Explanation: We perform the process starting from each node in the following way:
    - Starting from node 0, we visit the nodes 0 -> 1 -> 2 -> 0. The number of different nodes we visit is 3.
    - Starting from node 1, we visit the nodes 1 -> 2 -> 0 -> 1. The number of different nodes we visit is 3.
    - Starting from node 2, we visit the nodes 2 -> 0 -> 1 -> 2. The number of different nodes we visit is 3.
    - Starting from node 3, we visit the nodes 3 -> 0 -> 1 -> 2 -> 0. The number of different nodes we visit is 4.
    Example 2:
    Input: edges = [1,2,3,4,0]
    Output: [5,5,5,5,5]
    Explanation: Starting from any node we can visit every node in the graph in the process.
      Constraints:
    n == edges.length
    2 <= n <= 105
    0 <= edges[i] <= n - 1
    edges[i] != i
    */
    @Test
    void example_0() {
        var solution = new Solution();
        List<Integer> edges = List.of(1, 2, 0, 0);
        int[] expected = new int[]{3, 3, 3, 4};
        var result = solution.countVisitedNodes(edges);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        List<Integer> edges = List.of(1, 2, 3, 4, 0);
        int[] expected = new int[]{5, 5, 5, 5, 5};
        var result = solution.countVisitedNodes(edges);
        assertThat(result).isEqualTo(expected);
    }

}
