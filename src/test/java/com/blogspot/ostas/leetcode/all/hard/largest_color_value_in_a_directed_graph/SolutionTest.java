package com.blogspot.ostas.leetcode.all.hard.largest_color_value_in_a_directed_graph;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: colors = "abaca", edges = [[0,1],[0,2],[2,3],[3,4]]
    Output: 3
    Explanation: The path 0 -> 2 -> 3 -> 4 contains 3 nodes that are colored "a" (red in the above image).
    Example 2:
    Input: colors = "a", edges = [[0,0]]
    Output: -1
    Explanation: There is a cycle from 0 to 0.
      Constraints:
    n == colors.length
    m == edges.length
    1 <= n <= 105
    0 <= m <= 105
    colors consists of lowercase English letters.
    0 <= aj, bj < n
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String colors = "abaca";
        int[][] edges = new int[][]{{0, 1}, {0, 2}, {2, 3}, {3, 4}};
        int expected = 3;
        var result = solution.largestPathValue(colors, edges);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String colors = "a";
        int[][] edges = new int[][]{{0, 0}};
        int expected = -1;
        var result = solution.largestPathValue(colors, edges);
        assertThat(result).isEqualTo(expected);
    }

}
