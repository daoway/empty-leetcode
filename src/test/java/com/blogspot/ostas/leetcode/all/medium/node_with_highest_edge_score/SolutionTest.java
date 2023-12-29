package com.blogspot.ostas.leetcode.all.medium.node_with_highest_edge_score;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: edges = [1,0,0,0,0,7,7,5]
    Output: 7
    Explanation:
    - The nodes 1, 2, 3 and 4 have an edge pointing to node 0. The edge score of node 0 is 1 + 2 + 3 + 4 = 10.
    - The node 0 has an edge pointing to node 1. The edge score of node 1 is 0.
    - The node 7 has an edge pointing to node 5. The edge score of node 5 is 7.
    - The nodes 5 and 6 have an edge pointing to node 7. The edge score of node 7 is 5 + 6 = 11.
    Node 7 has the highest edge score so return 7.
    Example 2:
    Input: edges = [2,0,0,2]
    Output: 0
    Explanation:
    - The nodes 1 and 2 have an edge pointing to node 0. The edge score of node 0 is 1 + 2 = 3.
    - The nodes 0 and 3 have an edge pointing to node 2. The edge score of node 2 is 0 + 3 = 3.
    Nodes 0 and 2 both have an edge score of 3. Since node 0 has a smaller index, we return 0.
      Constraints:
    n == edges.length
    2 <= n <= 105
    0 <= edges[i] < n
    edges[i] != i
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] edges = new int[]{1, 0, 0, 0, 0, 7, 7, 5};
        int expected = 7;
        var result = solution.edgeScore(edges);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] edges = new int[]{2, 0, 0, 2};
        int expected = 0;
        var result = solution.edgeScore(edges);
        assertThat(result).isEqualTo(expected);
    }

}
