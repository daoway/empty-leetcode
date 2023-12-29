package com.blogspot.ostas.leetcode.all.hard.count_subtrees_with_max_distance_between_cities;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 4, edges = [[1,2],[2,3],[2,4]]
    Output: [3,4,0]
    Explanation:
    The subtrees with subsets {1,2}, {2,3} and {2,4} have a max distance of 1.
    The subtrees with subsets {1,2,3}, {1,2,4}, {2,3,4} and {1,2,3,4} have a max distance of 2.
    No subtree has two nodes where the max distance between them is 3.
    Example 2:
    Input: n = 2, edges = [[1,2]]
    Output: [1]
    Example 3:
    Input: n = 3, edges = [[1,2],[2,3]]
    Output: [2,1]
      Constraints:
    2 <= n <= 15
    edges.length == n-1
    edges[i].length == 2
    1 <= ui, vi <= n
    All pairs (ui, vi) are distinct.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 4;
        int[][] edges = new int[][]{{1, 2}, {2, 3}, {2, 4}};
        int[] expected = new int[]{3, 4, 0};
        var result = solution.countSubgraphsForEachDiameter(n, edges);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 2;
        int[][] edges = new int[][]{{1, 2}};
        int[] expected = new int[]{1};
        var result = solution.countSubgraphsForEachDiameter(n, edges);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int n = 3;
        int[][] edges = new int[][]{{1, 2}, {2, 3}};
        int[] expected = new int[]{2, 1};
        var result = solution.countSubgraphsForEachDiameter(n, edges);
        assertThat(result).isEqualTo(expected);
    }

}
