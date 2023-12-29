package com.blogspot.ostas.leetcode.all.hard.difference_between_maximum_and_minimum_price_sum;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 6, edges = [[0,1],[1,2],[1,3],[3,4],[3,5]], price = [9,8,7,6,10,5]
    Output: 24
    Explanation: The diagram above denotes the tree after rooting it at node 2. The first part (colored in red) shows the path with the maximum price sum. The second part (colored in blue) shows the path with the minimum price sum.
    - The first path contains nodes [2,1,3,4]: the prices are [7,8,6,10], and the sum of the prices is 31.
    - The second path contains the node [2] with the price [7].
    The difference between the maximum and minimum price sum is 24. It can be proved that 24 is the maximum cost.
    Example 2:
    Input: n = 3, edges = [[0,1],[1,2]], price = [1,1,1]
    Output: 2
    Explanation: The diagram above denotes the tree after rooting it at node 0. The first part (colored in red) shows the path with the maximum price sum. The second part (colored in blue) shows the path with the minimum price sum.
    - The first path contains nodes [0,1,2]: the prices are [1,1,1], and the sum of the prices is 3.
    - The second path contains node [0] with a price [1].
    The difference between the maximum and minimum price sum is 2. It can be proved that 2 is the maximum cost.
      Constraints:
    1 <= n <= 105
    edges.length == n - 1
    0 <= ai, bi <= n - 1
    edges represents a valid tree.
    price.length == n
    1 <= price[i] <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 6;
        int[][] edges = new int[][]{{0, 1}, {1, 2}, {1, 3}, {3, 4}, {3, 5}};
        int[] price = new int[]{9, 8, 7, 6, 10, 5};
        long expected = 24;
        var result = solution.maxOutput(n, edges, price);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 3;
        int[][] edges = new int[][]{{0, 1}, {1, 2}};
        int[] price = new int[]{1, 1, 1};
        long expected = 2;
        var result = solution.maxOutput(n, edges, price);
        assertThat(result).isEqualTo(expected);
    }

}
