package com.blogspot.ostas.leetcode.all.hard.build_array_where_you_can_find_the_maximum_exactly_k_comparisons;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 2, m = 3, k = 1
    Output: 6
    Explanation: The possible arrays are [1, 1], [2, 1], [2, 2], [3, 1], [3, 2] [3, 3]
    Example 2:
    Input: n = 5, m = 2, k = 3
    Output: 0
    Explanation: There are no possible arrays that satisfy the mentioned conditions.
    Example 3:
    Input: n = 9, m = 1, k = 1
    Output: 1
    Explanation: The only possible array is [1, 1, 1, 1, 1, 1, 1, 1, 1]
      Constraints:
    1 <= n <= 50
    1 <= m <= 100
    0 <= k <= n
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 2;
        int m = 3;
        int k = 1;
        int expected = 6;
        var result = solution.numOfArrays(n, m, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 5;
        int m = 2;
        int k = 3;
        int expected = 0;
        var result = solution.numOfArrays(n, m, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int n = 9;
        int m = 1;
        int k = 1;
        int expected = 1;
        var result = solution.numOfArrays(n, m, k);
        assertThat(result).isEqualTo(expected);
    }

}
