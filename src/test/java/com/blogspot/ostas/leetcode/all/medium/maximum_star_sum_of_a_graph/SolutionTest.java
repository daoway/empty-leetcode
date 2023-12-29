package com.blogspot.ostas.leetcode.all.medium.maximum_star_sum_of_a_graph;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: vals = [1,2,3,4,10,-10,-20], edges = [[0,1],[1,2],[1,3],[3,4],[3,5],[3,6]], k = 2
    Output: 16
    Explanation: The above diagram represents the input graph.
    The star graph with the maximum star sum is denoted by blue. It is centered at 3 and includes its neighbors 1 and 4.
    It can be shown it is not possible to get a star graph with a sum greater than 16.
    Example 2:
    Input: vals = [-5], edges = [], k = 0
    Output: -5
    Explanation: There is only one possible star graph, which is node 0 itself.
    Hence, we return -5.
      Constraints:
    n == vals.length
    1 <= n <= 105
    -104 <= vals[i] <= 104
    0 <= edges.length <= min(n * (n - 1) / 2, 105)
    edges[i].length == 2
    0 <= ai, bi <= n - 1
    ai != bi
    0 <= k <= n - 1
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] vals = new int[]{1, 2, 3, 4, 10, -10, -20};
        int[][] edges = new int[][]{{0, 1}, {1, 2}, {1, 3}, {3, 4}, {3, 5}, {3, 6}};
        int k = 2;
        int expected = 16;
        var result = solution.maxStarSum(vals, edges, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] vals = new int[]{-5};
        int[][] edges = new int[][]{};
        int k = 0;
        int expected = -5;
        var result = solution.maxStarSum(vals, edges, k);
        assertThat(result).isEqualTo(expected);
    }

}
