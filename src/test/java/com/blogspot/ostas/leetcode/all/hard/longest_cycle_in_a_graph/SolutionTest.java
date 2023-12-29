package com.blogspot.ostas.leetcode.all.hard.longest_cycle_in_a_graph;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: edges = [3,3,4,2,3]
    Output: 3
    Explanation: The longest cycle in the graph is the cycle: 2 -> 4 -> 3 -> 2.
    The length of this cycle is 3, so 3 is returned.
    Example 2:
    Input: edges = [2,-1,3,1]
    Output: -1
    Explanation: There are no cycles in this graph.
      Constraints:
    n == edges.length
    2 <= n <= 105
    -1 <= edges[i] < n
    edges[i] != i
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] edges = new int[]{3, 3, 4, 2, 3};
        int expected = 3;
        var result = solution.longestCycle(edges);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] edges = new int[]{2, -1, 3, 1};
        int expected = -1;
        var result = solution.longestCycle(edges);
        assertThat(result).isEqualTo(expected);
    }

}
