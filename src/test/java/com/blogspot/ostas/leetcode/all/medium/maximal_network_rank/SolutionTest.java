package com.blogspot.ostas.leetcode.all.medium.maximal_network_rank;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 4, roads = [[0,1],[0,3],[1,2],[1,3]]
    Output: 4
    Explanation: The network rank of cities 0 and 1 is 4 as there are 4 roads that are connected to either 0 or 1. The road between 0 and 1 is only counted once.
    Example 2:
    Input: n = 5, roads = [[0,1],[0,3],[1,2],[1,3],[2,3],[2,4]]
    Output: 5
    Explanation: There are 5 roads that are connected to cities 1 or 2.
    Example 3:
    Input: n = 8, roads = [[0,1],[1,2],[2,3],[2,4],[5,6],[5,7]]
    Output: 5
    Explanation: The network rank of 2 and 5 is 5. Notice that all the cities do not have to be connected.
      Constraints:
    2 <= n <= 100
    0 <= roads.length <= n * (n - 1) / 2
    roads[i].length == 2
    0 <= ai, bi <= n-1
    ai != bi
    Each pair of cities has at most one road connecting them.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 4;
        int[][] roads = new int[][]{{0, 1}, {0, 3}, {1, 2}, {1, 3}};
        int expected = 4;
        var result = solution.maximalNetworkRank(n, roads);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 5;
        int[][] roads = new int[][]{{0, 1}, {0, 3}, {1, 2}, {1, 3}, {2, 3}, {2, 4}};
        int expected = 5;
        var result = solution.maximalNetworkRank(n, roads);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int n = 8;
        int[][] roads = new int[][]{{0, 1}, {1, 2}, {2, 3}, {2, 4}, {5, 6}, {5, 7}};
        int expected = 5;
        var result = solution.maximalNetworkRank(n, roads);
        assertThat(result).isEqualTo(expected);
    }

}
