package com.blogspot.ostas.leetcode.all.hard.count_valid_paths_in_a_tree;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 5, edges = [[1,2],[1,3],[2,4],[2,5]]
    Output: 4
    Explanation: The pairs with exactly one prime number on the path between them are:
    - (1, 2) since the path from 1 to 2 contains prime number 2.
    - (1, 3) since the path from 1 to 3 contains prime number 3.
    - (1, 4) since the path from 1 to 4 contains prime number 2.
    - (2, 4) since the path from 2 to 4 contains prime number 2.
    It can be shown that there are only 4 valid paths.
    Example 2:
    Input: n = 6, edges = [[1,2],[1,3],[2,4],[3,5],[3,6]]
    Output: 6
    Explanation: The pairs with exactly one prime number on the path between them are:
    - (1, 2) since the path from 1 to 2 contains prime number 2.
    - (1, 3) since the path from 1 to 3 contains prime number 3.
    - (1, 4) since the path from 1 to 4 contains prime number 2.
    - (1, 6) since the path from 1 to 6 contains prime number 3.
    - (2, 4) since the path from 2 to 4 contains prime number 2.
    - (3, 6) since the path from 3 to 6 contains prime number 3.
    It can be shown that there are only 6 valid paths.
      Constraints:
    1 <= n <= 105
    edges.length == n - 1
    edges[i].length == 2
    1 <= ui, vi <= n
    The input is generated such that edges represent a valid tree.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 5;
        int[][] edges = new int[][]{{1, 2}, {1, 3}, {2, 4}, {2, 5}};
        long expected = 4;
        var result = solution.countPaths(n, edges);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 6;
        int[][] edges = new int[][]{{1, 2}, {1, 3}, {2, 4}, {3, 5}, {3, 6}};
        long expected = 6;
        var result = solution.countPaths(n, edges);
        assertThat(result).isEqualTo(expected);
    }

}
