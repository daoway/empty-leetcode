package com.blogspot.ostas.leetcode.all.medium.range_product_queries_of_powers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 15, queries = [[0,1],[2,2],[0,3]]
    Output: [2,4,64]
    Explanation:
    For n = 15, powers = [1,2,4,8]. It can be shown that powers cannot be a smaller size.
    Answer to 1st query: powers[0] * powers[1] = 1 * 2 = 2.
    Answer to 2nd query: powers[2] = 4.
    Answer to 3rd query: powers[0] * powers[1] * powers[2] * powers[3] = 1 * 2 * 4 * 8 = 64.
    Each answer modulo 109 + 7 yields the same answer, so [2,4,64] is returned.
    Example 2:
    Input: n = 2, queries = [[0,0]]
    Output: [2]
    Explanation:
    For n = 2, powers = [2].
    The answer to the only query is powers[0] = 2. The answer modulo 109 + 7 is the same, so [2] is returned.
      Constraints:
    1 <= n <= 109
    1 <= queries.length <= 105
    0 <= starti <= endi < powers.length
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 15;
        int[][] queries = new int[][]{{0, 1}, {2, 2}, {0, 3}};
        int[] expected = new int[]{2, 4, 64};
        var result = solution.productQueries(n, queries);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 2;
        int[][] queries = new int[][]{{0, 0}};
        int[] expected = new int[]{2};
        var result = solution.productQueries(n, queries);
        assertThat(result).isEqualTo(expected);
    }

}
