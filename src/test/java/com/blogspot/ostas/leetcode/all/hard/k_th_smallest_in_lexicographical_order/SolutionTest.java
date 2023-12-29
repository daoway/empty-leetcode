package com.blogspot.ostas.leetcode.all.hard.k_th_smallest_in_lexicographical_order;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 13, k = 2
    Output: 10
    Explanation: The lexicographical order is [1, 10, 11, 12, 13, 2, 3, 4, 5, 6, 7, 8, 9], so the second smallest number is 10.
    Example 2:
    Input: n = 1, k = 1
    Output: 1
      Constraints:
    1 <= k <= n <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 13;
        int k = 2;
        int expected = 10;
        var result = solution.findKthNumber(n, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 1;
        int k = 1;
        int expected = 1;
        var result = solution.findKthNumber(n, k);
        assertThat(result).isEqualTo(expected);
    }

}
