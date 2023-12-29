package com.blogspot.ostas.leetcode.all.hard.count_pairs_of_nodes;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 4, edges = [[1,2],[2,4],[1,3],[2,3],[2,1]], queries = [2,3]
    Output: [6,5]
    Explanation: The calculations for incident(a, b) are shown in the table above.
    The answers for each of the queries are as follows:
    - answers[0] = 6. All the pairs have an incident(a, b) value greater than 2.
    - answers[1] = 5. All the pairs except (3, 4) have an incident(a, b) value greater than 3.
    Example 2:
    Input: n = 5, edges = [[1,5],[1,5],[3,4],[2,5],[1,3],[5,1],[2,3],[2,5]], queries = [1,2,3,4,5]
    Output: [10,10,9,8,6]
      Constraints:
    2 <= n <= 2 * 104
    1 <= edges.length <= 105
    1 <= ui, vi <= n
    ui != vi
    1 <= queries.length <= 20
    0 <= queries[j] < edges.length
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 4;
        int[][] edges = new int[][]{{1, 2}, {2, 4}, {1, 3}, {2, 3}, {2, 1}};
        int[] queries = new int[]{2, 3};
        int[] expected = new int[]{6, 5};
        var result = solution.countPairs(n, edges, queries);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 5;
        int[][] edges = new int[][]{{1, 5}, {1, 5}, {3, 4}, {2, 5}, {1, 3}, {5, 1}, {2, 3}, {2, 5}};
        int[] queries = new int[]{1, 2, 3, 4, 5};
        int[] expected = new int[]{10, 10, 9, 8, 6};
        var result = solution.countPairs(n, edges, queries);
        assertThat(result).isEqualTo(expected);
    }

}
