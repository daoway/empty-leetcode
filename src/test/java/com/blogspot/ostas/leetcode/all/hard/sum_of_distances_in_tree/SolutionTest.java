package com.blogspot.ostas.leetcode.all.hard.sum_of_distances_in_tree;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 6, edges = [[0,1],[0,2],[2,3],[2,4],[2,5]]
    Output: [8,12,6,10,10,10]
    Explanation: The tree is shown above.
    We can see that dist(0,1) + dist(0,2) + dist(0,3) + dist(0,4) + dist(0,5)
    equals 1 + 1 + 2 + 2 + 2 = 8.
    Hence, answer[0] = 8, and so on.
    Example 2:
    Input: n = 1, edges = []
    Output: [0]
    Example 3:
    Input: n = 2, edges = [[1,0]]
    Output: [1,1]
      Constraints:
    1 <= n <= 3 * 104
    edges.length == n - 1
    edges[i].length == 2
    0 <= ai, bi < n
    ai != bi
    The given input represents a valid tree.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 6;
        int[][] edges = new int[][]{{0, 1}, {0, 2}, {2, 3}, {2, 4}, {2, 5}};
        int[] expected = new int[]{8, 12, 6, 10, 10, 10};
        var result = solution.sumOfDistancesInTree(n, edges);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 1;
        int[][] edges = new int[][]{};
        int[] expected = new int[]{0};
        var result = solution.sumOfDistancesInTree(n, edges);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int n = 2;
        int[][] edges = new int[][]{{1, 0}};
        int[] expected = new int[]{1, 1};
        var result = solution.sumOfDistancesInTree(n, edges);
        assertThat(result).isEqualTo(expected);
    }

}
