package com.blogspot.ostas.leetcode.all.medium.number_of_operations_to_make_network_connected;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 4, connections = [[0,1],[0,2],[1,2]]
    Output: 1
    Explanation: Remove cable between computer 1 and 2 and place between computers 1 and 3.
    Example 2:
    Input: n = 6, connections = [[0,1],[0,2],[0,3],[1,2],[1,3]]
    Output: 2
    Example 3:
    Input: n = 6, connections = [[0,1],[0,2],[0,3],[1,2]]
    Output: -1
    Explanation: There are not enough cables.
      Constraints:
    1 <= n <= 105
    1 <= connections.length <= min(n * (n - 1) / 2, 105)
    connections[i].length == 2
    0 <= ai, bi < n
    ai != bi
    There are no repeated connections.
    No two computers are connected by more than one cable.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 4;
        int[][] connections = new int[][]{{0, 1}, {0, 2}, {1, 2}};
        int expected = 1;
        var result = solution.makeConnected(n, connections);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 6;
        int[][] connections = new int[][]{{0, 1}, {0, 2}, {0, 3}, {1, 2}, {1, 3}};
        int expected = 2;
        var result = solution.makeConnected(n, connections);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int n = 6;
        int[][] connections = new int[][]{{0, 1}, {0, 2}, {0, 3}, {1, 2}};
        int expected = -1;
        var result = solution.makeConnected(n, connections);
        assertThat(result).isEqualTo(expected);
    }

}
