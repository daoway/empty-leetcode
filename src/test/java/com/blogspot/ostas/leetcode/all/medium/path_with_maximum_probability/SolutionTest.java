package com.blogspot.ostas.leetcode.all.medium.path_with_maximum_probability;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 3, edges = [[0,1],[1,2],[0,2]], succProb = [0.5,0.5,0.2], start = 0, end = 2
    Output: 0.25000
    Explanation: There are two paths from start to end, one having a probability of success = 0.2 and the other has 0.5 * 0.5 = 0.25.
    Example 2:
    Input: n = 3, edges = [[0,1],[1,2],[0,2]], succProb = [0.5,0.5,0.3], start = 0, end = 2
    Output: 0.30000
    Example 3:
    Input: n = 3, edges = [[0,1]], succProb = [0.5], start = 0, end = 2
    Output: 0.00000
    Explanation: There is no path between 0 and 2.
      Constraints:
    2 <= n <= 10^4
    0 <= start, end < n
    start != end
    0 <= a, b < n
    a != b
    0 <= succProb.length == edges.length <= 2*10^4
    0 <= succProb[i] <= 1
    There is at most one edge between every two nodes.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 3;
        int[][] edges = new int[][]{{0, 1}, {1, 2}, {0, 2}};
        double[] succProb = new double[]{0.5, 0.5, 0.2};
        int start_node = 0;
        int end_node = 2;
        double expected = 0.25000;
        var result = solution.maxProbability(n, edges, succProb, start_node, end_node);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 3;
        int[][] edges = new int[][]{{0, 1}, {1, 2}, {0, 2}};
        double[] succProb = new double[]{0.5, 0.5, 0.3};
        int start_node = 0;
        int end_node = 2;
        double expected = 0.30000;
        var result = solution.maxProbability(n, edges, succProb, start_node, end_node);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int n = 3;
        int[][] edges = new int[][]{{0, 1}};
        double[] succProb = new double[]{0.5};
        int start_node = 0;
        int end_node = 2;
        double expected = 0.00000;
        var result = solution.maxProbability(n, edges, succProb, start_node, end_node);
        assertThat(result).isEqualTo(expected);
    }

}
