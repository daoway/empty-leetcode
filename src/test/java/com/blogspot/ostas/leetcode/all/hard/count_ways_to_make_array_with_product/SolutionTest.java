package com.blogspot.ostas.leetcode.all.hard.count_ways_to_make_array_with_product;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: queries = [[2,6],[5,1],[73,660]]
    Output: [4,1,50734910]
    Explanation: Each query is independent.
    [2,6]: There are 4 ways to fill an array of size 2 that multiply to 6: [1,6], [2,3], [3,2], [6,1].
    [5,1]: There is 1 way to fill an array of size 5 that multiply to 1: [1,1,1,1,1].
    [73,660]: There are 1050734917 ways to fill an array of size 73 that multiply to 660. 1050734917 modulo 109 + 7 = 50734910.
    Example 2:
    Input: queries = [[1,1],[2,2],[3,3],[4,4],[5,5]]
    Output: [1,2,3,10,5]
      Constraints:
    1 <= queries.length <= 104
    1 <= ni, ki <= 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] queries = new int[][]{{2, 6}, {5, 1}, {73, 660}};
        int[] expected = new int[]{4, 1, 50734910};
        var result = solution.waysToFillArray(queries);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] queries = new int[][]{{1, 1}, {2, 2}, {3, 3}, {4, 4}, {5, 5}};
        int[] expected = new int[]{1, 2, 3, 10, 5};
        var result = solution.waysToFillArray(queries);
        assertThat(result).isEqualTo(expected);
    }

}
