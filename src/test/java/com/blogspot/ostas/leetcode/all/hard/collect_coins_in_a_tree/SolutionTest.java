package com.blogspot.ostas.leetcode.all.hard.collect_coins_in_a_tree;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: coins = [1,0,0,0,0,1], edges = [[0,1],[1,2],[2,3],[3,4],[4,5]]
    Output: 2
    Explanation: Start at vertex 2, collect the coin at vertex 0, move to vertex 3, collect the coin at vertex 5 then move back to vertex 2.
    Example 2:
    Input: coins = [0,0,0,1,1,0,0,1], edges = [[0,1],[0,2],[1,3],[1,4],[2,5],[5,6],[5,7]]
    Output: 2
    Explanation: Start at vertex 0, collect the coins at vertices 4 and 3, move to vertex 2,  collect the coin at vertex 7, then move back to vertex 0.
      Constraints:
    n == coins.length
    1 <= n <= 3 * 104
    0 <= coins[i] <= 1
    edges.length == n - 1
    edges[i].length == 2
    0 <= ai, bi < n
    ai != bi
    edges represents a valid tree.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] coins = new int[]{1, 0, 0, 0, 0, 1};
        int[][] edges = new int[][]{{0, 1}, {1, 2}, {2, 3}, {3, 4}, {4, 5}};
        int expected = 2;
        var result = solution.collectTheCoins(coins, edges);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] coins = new int[]{0, 0, 0, 1, 1, 0, 0, 1};
        int[][] edges = new int[][]{{0, 1}, {0, 2}, {1, 3}, {1, 4}, {2, 5}, {5, 6}, {5, 7}};
        int expected = 2;
        var result = solution.collectTheCoins(coins, edges);
        assertThat(result).isEqualTo(expected);
    }

}
