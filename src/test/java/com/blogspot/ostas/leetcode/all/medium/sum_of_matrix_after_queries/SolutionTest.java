package com.blogspot.ostas.leetcode.all.medium.sum_of_matrix_after_queries;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 3, queries = [[0,0,1],[1,2,2],[0,2,3],[1,0,4]]
    Output: 23
    Explanation: The image above describes the matrix after each query. The sum of the matrix after all queries are applied is 23.
    Example 2:
    Input: n = 3, queries = [[0,0,4],[0,1,2],[1,0,1],[0,2,3],[1,2,1]]
    Output: 17
    Explanation: The image above describes the matrix after each query. The sum of the matrix after all queries are applied is 17.
      Constraints:
    1 <= n <= 104
    1 <= queries.length <= 5 * 104
    queries[i].length == 3
    0 <= typei <= 1
    0 <= indexi < n
    0 <= vali <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 3;
        int[][] queries = new int[][]{{0, 0, 1}, {1, 2, 2}, {0, 2, 3}, {1, 0, 4}};
        long expected = 23;
        var result = solution.matrixSumQueries(n, queries);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 3;
        int[][] queries = new int[][]{{0, 0, 4}, {0, 1, 2}, {1, 0, 1}, {0, 2, 3}, {1, 2, 1}};
        long expected = 17;
        var result = solution.matrixSumQueries(n, queries);
        assertThat(result).isEqualTo(expected);
    }

}
