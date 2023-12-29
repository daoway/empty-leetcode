package com.blogspot.ostas.leetcode.all.hard.maximum_path_quality_of_a_graph;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: values = [0,32,10,43], edges = [[0,1,10],[1,2,15],[0,3,10]], maxTime = 49
    Output: 75
    Explanation:
    One possible path is 0 -> 1 -> 0 -> 3 -> 0. The total time taken is 10 + 10 + 10 + 10 = 40 <= 49.
    The nodes visited are 0, 1, and 3, giving a maximal path quality of 0 + 32 + 43 = 75.
    Example 2:
    Input: values = [5,10,15,20], edges = [[0,1,10],[1,2,10],[0,3,10]], maxTime = 30
    Output: 25
    Explanation:
    One possible path is 0 -> 3 -> 0. The total time taken is 10 + 10 = 20 <= 30.
    The nodes visited are 0 and 3, giving a maximal path quality of 5 + 20 = 25.
    Example 3:
    Input: values = [1,2,3,4], edges = [[0,1,10],[1,2,11],[2,3,12],[1,3,13]], maxTime = 50
    Output: 7
    Explanation:
    One possible path is 0 -> 1 -> 3 -> 1 -> 0. The total time taken is 10 + 13 + 13 + 10 = 46 <= 50.
    The nodes visited are 0, 1, and 3, giving a maximal path quality of 1 + 2 + 4 = 7.
      Constraints:
    n == values.length
    1 <= n <= 1000
    0 <= values[i] <= 108
    0 <= edges.length <= 2000
    edges[j].length == 3
    0 <= uj < vj <= n - 1
    10 <= timej, maxTime <= 100
    All the pairs [uj, vj] are unique.
    There are at most four edges connected to each node.
    The graph may not be connected.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] values = new int[]{0, 32, 10, 43};
        int[][] edges = new int[][]{{0, 1, 10}, {1, 2, 15}, {0, 3, 10}};
        int maxTime = 49;
        int expected = 75;
        var result = solution.maximalPathQuality(values, edges, maxTime);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] values = new int[]{5, 10, 15, 20};
        int[][] edges = new int[][]{{0, 1, 10}, {1, 2, 10}, {0, 3, 10}};
        int maxTime = 30;
        int expected = 25;
        var result = solution.maximalPathQuality(values, edges, maxTime);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] values = new int[]{1, 2, 3, 4};
        int[][] edges = new int[][]{{0, 1, 10}, {1, 2, 11}, {2, 3, 12}, {1, 3, 13}};
        int maxTime = 50;
        int expected = 7;
        var result = solution.maximalPathQuality(values, edges, maxTime);
        assertThat(result).isEqualTo(expected);
    }

}
