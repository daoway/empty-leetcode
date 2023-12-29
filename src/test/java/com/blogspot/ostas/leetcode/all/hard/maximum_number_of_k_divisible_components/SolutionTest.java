package com.blogspot.ostas.leetcode.all.hard.maximum_number_of_k_divisible_components;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 5, edges = [[0,2],[1,2],[1,3],[2,4]], values = [1,8,1,4,4], k = 6
    Output: 2
    Explanation: We remove the edge connecting node 1 with 2. The resulting split is valid because:
    - The value of the component containing nodes 1 and 3 is values[1] + values[3] = 12.
    - The value of the component containing nodes 0, 2, and 4 is values[0] + values[2] + values[4] = 6.
    It can be shown that no other valid split has more than 2 connected components.
    Example 2:
    Input: n = 7, edges = [[0,1],[0,2],[1,3],[1,4],[2,5],[2,6]], values = [3,0,6,1,5,2,1], k = 3
    Output: 3
    Explanation: We remove the edge connecting node 0 with 2, and the edge connecting node 0 with 1. The resulting split is valid because:
    - The value of the component containing node 0 is values[0] = 3.
    - The value of the component containing nodes 2, 5, and 6 is values[2] + values[5] + values[6] = 9.
    - The value of the component containing nodes 1, 3, and 4 is values[1] + values[3] + values[4] = 6.
    It can be shown that no other valid split has more than 3 connected components.
      Constraints:
    1 <= n <= 3 * 104
    edges.length == n - 1
    edges[i].length == 2
    0 <= ai, bi < n
    values.length == n
    0 <= values[i] <= 109
    1 <= k <= 109
    Sum of values is divisible by k.
    The input is generated such that edges represents a valid tree.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 5;
        int[][] edges = new int[][]{{0, 2}, {1, 2}, {1, 3}, {2, 4}};
        int[] values = new int[]{1, 8, 1, 4, 4};
        int k = 6;
        int expected = 2;
        var result = solution.maxKDivisibleComponents(n, edges, values, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 7;
        int[][] edges = new int[][]{{0, 1}, {0, 2}, {1, 3}, {1, 4}, {2, 5}, {2, 6}};
        int[] values = new int[]{3, 0, 6, 1, 5, 2, 1};
        int k = 3;
        int expected = 3;
        var result = solution.maxKDivisibleComponents(n, edges, values, k);
        assertThat(result).isEqualTo(expected);
    }

}
