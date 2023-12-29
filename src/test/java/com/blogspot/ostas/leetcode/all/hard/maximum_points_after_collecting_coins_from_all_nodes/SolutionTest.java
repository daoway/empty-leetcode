package com.blogspot.ostas.leetcode.all.hard.maximum_points_after_collecting_coins_from_all_nodes;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: edges = [[0,1],[1,2],[2,3]], coins = [10,10,3,3], k = 5
    Output: 11
    Explanation:
    Collect all the coins from node 0 using the first way. Total points = 10 - 5 = 5.
    Collect all the coins from node 1 using the first way. Total points = 5 + (10 - 5) = 10.
    Collect all the coins from node 2 using the second way so coins left at node 3 will be floor(3 / 2) = 1. Total points = 10 + floor(3 / 2) = 11.
    Collect all the coins from node 3 using the second way. Total points = 11 + floor(1 / 2) = 11.
    It can be shown that the maximum points we can get after collecting coins from all the nodes is 11.
    Example 2:
    Input: edges = [[0,1],[0,2]], coins = [8,4,4], k = 0
    Output: 16
    Explanation:
    Coins will be collected from all the nodes using the first way. Therefore, total points = (8 - 0) + (4 - 0) + (4 - 0) = 16.
      Constraints:
    n == coins.length
    2 <= n <= 105
    0 <= coins[i] <= 104
    edges.length == n - 1
    0 <= edges[i][0], edges[i][1] < n
    0 <= k <= 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] edges = new int[][]{{0, 1}, {1, 2}, {2, 3}};
        int[] coins = new int[]{10, 10, 3, 3};
        int k = 5;
        int expected = 11;
        var result = solution.maximumPoints(edges, coins, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] edges = new int[][]{{0, 1}, {0, 2}};
        int[] coins = new int[]{8, 4, 4};
        int k = 0;
        int expected = 16;
        var result = solution.maximumPoints(edges, coins, k);
        assertThat(result).isEqualTo(expected);
    }

}
