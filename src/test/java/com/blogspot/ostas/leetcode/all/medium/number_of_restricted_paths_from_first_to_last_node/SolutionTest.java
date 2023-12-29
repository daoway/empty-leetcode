package com.blogspot.ostas.leetcode.all.medium.number_of_restricted_paths_from_first_to_last_node;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 5, edges = [[1,2,3],[1,3,3],[2,3,1],[1,4,2],[5,2,2],[3,5,1],[5,4,10]]
    Output: 3
    Explanation: Each circle contains the node number in black and its distanceToLastNode value in blue. The three restricted paths are:
    1) 1 --> 2 --> 5
    2) 1 --> 2 --> 3 --> 5
    3) 1 --> 3 --> 5
    Example 2:
    Input: n = 7, edges = [[1,3,1],[4,1,2],[7,3,4],[2,5,3],[5,6,1],[6,7,2],[7,5,3],[2,6,4]]
    Output: 1
    Explanation: Each circle contains the node number in black and its distanceToLastNode value in blue. The only restricted path is 1 --> 3 --> 7.
      Constraints:
    1 <= n <= 2 * 104
    n - 1 <= edges.length <= 4 * 104
    edges[i].length == 3
    1 <= ui, vi <= n
    ui != vi
    1 <= weighti <= 105
    There is at most one edge between any two nodes.
    There is at least one path between any two nodes.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 5;
        int[][] edges = new int[][]{{1, 2, 3}, {1, 3, 3}, {2, 3, 1}, {1, 4, 2}, {5, 2, 2}, {3, 5, 1},
                {5, 4, 10}};
        int expected = 3;
        var result = solution.countRestrictedPaths(n, edges);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 7;
        int[][] edges = new int[][]{{1, 3, 1}, {4, 1, 2}, {7, 3, 4}, {2, 5, 3}, {5, 6, 1}, {6, 7, 2},
                {7, 5, 3}, {2, 6, 4}};
        int expected = 1;
        var result = solution.countRestrictedPaths(n, edges);
        assertThat(result).isEqualTo(expected);
    }

}
