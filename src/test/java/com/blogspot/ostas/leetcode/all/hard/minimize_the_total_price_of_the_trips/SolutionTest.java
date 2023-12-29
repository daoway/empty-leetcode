package com.blogspot.ostas.leetcode.all.hard.minimize_the_total_price_of_the_trips;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 4, edges = [[0,1],[1,2],[1,3]], price = [2,2,10,6], trips = [[0,3],[2,1],[2,3]]
    Output: 23
    Explanation: The diagram above denotes the tree after rooting it at node 2. The first part shows the initial tree and the second part shows the tree after choosing nodes 0, 2, and 3, and making their price half.
    For the 1st trip, we choose path [0,1,3]. The price sum of that path is 1 + 2 + 3 = 6.
    For the 2nd trip, we choose path [2,1]. The price sum of that path is 2 + 5 = 7.
    For the 3rd trip, we choose path [2,1,3]. The price sum of that path is 5 + 2 + 3 = 10.
    The total price sum of all trips is 6 + 7 + 10 = 23.
    It can be proven, that 23 is the minimum answer that we can achieve.
    Example 2:
    Input: n = 2, edges = [[0,1]], price = [2,2], trips = [[0,0]]
    Output: 1
    Explanation: The diagram above denotes the tree after rooting it at node 0. The first part shows the initial tree and the second part shows the tree after choosing node 0, and making its price half.
    For the 1st trip, we choose path [0]. The price sum of that path is 1.
    The total price sum of all trips is 1. It can be proven, that 1 is the minimum answer that we can achieve.
      Constraints:
    1 <= n <= 50
    edges.length == n - 1
    0 <= ai, bi <= n - 1
    edges represents a valid tree.
    price.length == n
    price[i] is an even integer.
    1 <= price[i] <= 1000
    1 <= trips.length <= 100
    0 <= starti, endi <= n - 1
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 4;
        int[][] edges = new int[][]{{0, 1}, {1, 2}, {1, 3}};
        int[] price = new int[]{2, 2, 10, 6};
        int[][] trips = new int[][]{{0, 3}, {2, 1}, {2, 3}};
        int expected = 23;
        var result = solution.minimumTotalPrice(n, edges, price, trips);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 2;
        int[][] edges = new int[][]{{0, 1}};
        int[] price = new int[]{2, 2};
        int[][] trips = new int[][]{{0, 0}};
        int expected = 1;
        var result = solution.minimumTotalPrice(n, edges, price, trips);
        assertThat(result).isEqualTo(expected);
    }

}
