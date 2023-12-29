package com.blogspot.ostas.leetcode.all.medium.queries_on_a_permutation_with_key;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: queries = [3,1,2,1], m = 5
    Output: [2,1,2,1]
    Explanation: The queries are processed as follow:
    For i=0: queries[i]=3, P=[1,2,3,4,5], position of 3 in P is 2, then we move 3 to the beginning of P resulting in P=[3,1,2,4,5].
    For i=1: queries[i]=1, P=[3,1,2,4,5], position of 1 in P is 1, then we move 1 to the beginning of P resulting in P=[1,3,2,4,5].
    For i=2: queries[i]=2, P=[1,3,2,4,5], position of 2 in P is 2, then we move 2 to the beginning of P resulting in P=[2,1,3,4,5].
    For i=3: queries[i]=1, P=[2,1,3,4,5], position of 1 in P is 1, then we move 1 to the beginning of P resulting in P=[1,2,3,4,5].
    Therefore, the array containing the result is [2,1,2,1].
    Example 2:
    Input: queries = [4,1,2,2], m = 4
    Output: [3,1,2,0]
    Example 3:
    Input: queries = [7,5,5,8,3], m = 8
    Output: [6,5,0,7,5]
      Constraints:
    1 <= m <= 10^3
    1 <= queries.length <= m
    1 <= queries[i] <= m
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] queries = new int[]{3, 1, 2, 1};
        int m = 5;
        int[] expected = new int[]{2, 1, 2, 1};
        var result = solution.processQueries(queries, m);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] queries = new int[]{4, 1, 2, 2};
        int m = 4;
        int[] expected = new int[]{3, 1, 2, 0};
        var result = solution.processQueries(queries, m);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] queries = new int[]{7, 5, 5, 8, 3};
        int m = 8;
        int[] expected = new int[]{6, 5, 0, 7, 5};
        var result = solution.processQueries(queries, m);
        assertThat(result).isEqualTo(expected);
    }

}
