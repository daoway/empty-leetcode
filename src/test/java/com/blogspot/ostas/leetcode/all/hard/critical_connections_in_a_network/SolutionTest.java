package com.blogspot.ostas.leetcode.all.hard.critical_connections_in_a_network;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 4, connections = [[0,1],[1,2],[2,0],[1,3]]
    Output: [[1,3]]
    Explanation: [[3,1]] is also accepted.
    Example 2:
    Input: n = 2, connections = [[0,1]]
    Output: [[0,1]]
      Constraints:
    2 <= n <= 105
    n - 1 <= connections.length <= 105
    0 <= ai, bi <= n - 1
    ai != bi
    There are no repeated connections.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 4;
        List<List<Integer>> connections =
                List.of(List.of(0, 1), List.of(1, 2), List.of(2, 0), List.of(1, 3));
        List<List<Integer>> expected = List.of(List.of(1, 3));
        var result = solution.criticalConnections(n, connections);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 2;
        List<List<Integer>> connections = List.of(List.of(0, 1));
        List<List<Integer>> expected = List.of(List.of(0, 1));
        var result = solution.criticalConnections(n, connections);
        assertThat(result).isEqualTo(expected);
    }

}
