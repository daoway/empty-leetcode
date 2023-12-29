package com.blogspot.ostas.leetcode.all.hard.checking_existence_of_edge_length_limited_paths;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 3, edgeList = [[0,1,2],[1,2,4],[2,0,8],[1,0,16]], queries = [[0,1,2],[0,2,5]]
    Output: [false,true]
    Explanation: The above figure shows the given graph. Note that there are two overlapping edges between 0 and 1 with distances 2 and 16.
    For the first query, between 0 and 1 there is no path where each distance is less than 2, thus we return false for this query.
    For the second query, there is a path (0 -> 1 -> 2) of two edges with distances less than 5, thus we return true for this query.
    Example 2:
    Input: n = 5, edgeList = [[0,1,10],[1,2,5],[2,3,9],[3,4,13]], queries = [[0,4,14],[1,4,13]]
    Output: [true,false]
    Explanation: The above figure shows the given graph.
      Constraints:
    2 <= n <= 105
    1 <= edgeList.length, queries.length <= 105
    edgeList[i].length == 3
    queries[j].length == 3
    0 <= ui, vi, pj, qj <= n - 1
    ui != vi
    pj != qj
    1 <= disi, limitj <= 109
    There may be multiple edges between two nodes.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 3;
        int[][] edgeList = new int[][]{{0, 1, 2}, {1, 2, 4}, {2, 0, 8}, {1, 0, 16}};
        int[][] queries = new int[][]{{0, 1, 2}, {0, 2, 5}};
        boolean[] expected = new boolean[]{false, true};
        var result = solution.distanceLimitedPathsExist(n, edgeList, queries);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 5;
        int[][] edgeList = new int[][]{{0, 1, 10}, {1, 2, 5}, {2, 3, 9}, {3, 4, 13}};
        int[][] queries = new int[][]{{0, 4, 14}, {1, 4, 13}};
        boolean[] expected = new boolean[]{true, false};
        var result = solution.distanceLimitedPathsExist(n, edgeList, queries);
        assertThat(result).isEqualTo(expected);
    }

}
