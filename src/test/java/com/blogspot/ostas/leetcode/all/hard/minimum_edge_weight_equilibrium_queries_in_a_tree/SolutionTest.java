package com.blogspot.ostas.leetcode.all.hard.minimum_edge_weight_equilibrium_queries_in_a_tree;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 7, edges = [[0,1,1],[1,2,1],[2,3,1],[3,4,2],[4,5,2],[5,6,2]], queries = [[0,3],[3,6],[2,6],[0,6]]
    Output: [0,0,1,3]
    Explanation: In the first query, all the edges in the path from 0 to 3 have a weight of 1. Hence, the answer is 0.
    In the second query, all the edges in the path from 3 to 6 have a weight of 2. Hence, the answer is 0.
    In the third query, we change the weight of edge [2,3] to 2. After this operation, all the edges in the path from 2 to 6 have a weight of 2. Hence, the answer is 1.
    In the fourth query, we change the weights of edges [0,1], [1,2] and [2,3] to 2. After these operations, all the edges in the path from 0 to 6 have a weight of 2. Hence, the answer is 3.
    For each queries[i], it can be shown that answer[i] is the minimum number of operations needed to equalize all the edge weights in the path from ai to bi.
    Example 2:
    Input: n = 8, edges = [[1,2,6],[1,3,4],[2,4,6],[2,5,3],[3,6,6],[3,0,8],[7,0,2]], queries = [[4,6],[0,4],[6,5],[7,4]]
    Output: [1,2,2,3]
    Explanation: In the first query, we change the weight of edge [1,3] to 6. After this operation, all the edges in the path from 4 to 6 have a weight of 6. Hence, the answer is 1.
    In the second query, we change the weight of edges [0,3] and [3,1] to 6. After these operations, all the edges in the path from 0 to 4 have a weight of 6. Hence, the answer is 2.
    In the third query, we change the weight of edges [1,3] and [5,2] to 6. After these operations, all the edges in the path from 6 to 5 have a weight of 6. Hence, the answer is 2.
    In the fourth query, we change the weights of edges [0,7], [0,3] and [1,3] to 6. After these operations, all the edges in the path from 7 to 4 have a weight of 6. Hence, the answer is 3.
    For each queries[i], it can be shown that answer[i] is the minimum number of operations needed to equalize all the edge weights in the path from ai to bi.
      Constraints:
    1 <= n <= 104
    edges.length == n - 1
    edges[i].length == 3
    0 <= ui, vi < n
    1 <= wi <= 26
    The input is generated such that edges represents a valid tree.
    1 <= queries.length == m <= 2 * 104
    queries[i].length == 2
    0 <= ai, bi < n
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 7;
        int[][] edges = new int[][]{{0, 1, 1}, {1, 2, 1}, {2, 3, 1}, {3, 4, 2}, {4, 5, 2}, {5, 6, 2}};
        int[][] queries = new int[][]{{0, 3}, {3, 6}, {2, 6}, {0, 6}};
        int[] expected = new int[]{0, 0, 1, 3};
        var result = solution.minOperationsQueries(n, edges, queries);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 8;
        int[][] edges = new int[][]{{1, 2, 6}, {1, 3, 4}, {2, 4, 6}, {2, 5, 3}, {3, 6, 6}, {3, 0, 8},
                {7, 0, 2}};
        int[][] queries = new int[][]{{4, 6}, {0, 4}, {6, 5}, {7, 4}};
        int[] expected = new int[]{1, 2, 2, 3};
        var result = solution.minOperationsQueries(n, edges, queries);
        assertThat(result).isEqualTo(expected);
    }

}
