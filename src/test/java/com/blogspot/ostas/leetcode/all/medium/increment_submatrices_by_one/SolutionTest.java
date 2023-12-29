package com.blogspot.ostas.leetcode.all.medium.increment_submatrices_by_one;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 3, queries = [[1,1,2,2],[0,0,1,1]]
    Output: [[1,1,0],[1,2,1],[0,1,1]]
    Explanation: The diagram above shows the initial matrix, the matrix after the first query, and the matrix after the second query.
    - In the first query, we add 1 to every element in the submatrix with the top left corner (1, 1) and bottom right corner (2, 2).
    - In the second query, we add 1 to every element in the submatrix with the top left corner (0, 0) and bottom right corner (1, 1).
    Example 2:
    Input: n = 2, queries = [[0,0,1,1]]
    Output: [[1,1],[1,1]]
    Explanation: The diagram above shows the initial matrix and the matrix after the first query.
    - In the first query we add 1 to every element in the matrix.
      Constraints:
    1 <= n <= 500
    1 <= queries.length <= 104
    0 <= row1i <= row2i < n
    0 <= col1i <= col2i < n
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 3;
        int[][] queries = new int[][]{{1, 1, 2, 2}, {0, 0, 1, 1}};
        int[][] expected = new int[][]{{1, 1, 0}, {1, 2, 1}, {0, 1, 1}};
        var result = solution.rangeAddQueries(n, queries);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 2;
        int[][] queries = new int[][]{{0, 0, 1, 1}};
        int[][] expected = new int[][]{{1, 1}, {1, 1}};
        var result = solution.rangeAddQueries(n, queries);
        assertThat(result).isEqualTo(expected);
    }

}
