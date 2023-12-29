package com.blogspot.ostas.leetcode.all.medium.find_closest_node_to_given_two_nodes;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: edges = [2,2,3,-1], node1 = 0, node2 = 1
    Output: 2
    Explanation: The distance from node 0 to node 2 is 1, and the distance from node 1 to node 2 is 1.
    The maximum of those two distances is 1. It can be proven that we cannot get a node with a smaller maximum distance than 1, so we return node 2.
    Example 2:
    Input: edges = [1,2,-1], node1 = 0, node2 = 2
    Output: 2
    Explanation: The distance from node 0 to node 2 is 2, and the distance from node 2 to itself is 0.
    The maximum of those two distances is 2. It can be proven that we cannot get a node with a smaller maximum distance than 2, so we return node 2.
      Constraints:
    n == edges.length
    2 <= n <= 105
    -1 <= edges[i] < n
    edges[i] != i
    0 <= node1, node2 < n
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] edges = new int[]{2, 2, 3, -1};
        int node1 = 0;
        int node2 = 1;
        int expected = 2;
        var result = solution.closestMeetingNode(edges, node1, node2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] edges = new int[]{1, 2, -1};
        int node1 = 0;
        int node2 = 2;
        int expected = 2;
        var result = solution.closestMeetingNode(edges, node1, node2);
        assertThat(result).isEqualTo(expected);
    }

}
