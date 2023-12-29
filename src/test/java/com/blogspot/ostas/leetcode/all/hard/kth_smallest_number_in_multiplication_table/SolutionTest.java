package com.blogspot.ostas.leetcode.all.hard.kth_smallest_number_in_multiplication_table;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: m = 3, n = 3, k = 5
    Output: 3
    Explanation: The 5th smallest number is 3.
    Example 2:
    Input: m = 2, n = 3, k = 6
    Output: 6
    Explanation: The 6th smallest number is 6.
      Constraints:
    1 <= m, n <= 3 * 104
    1 <= k <= m * n
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int m = 3;
        int n = 3;
        int k = 5;
        int expected = 3;
        var result = solution.findKthNumber(m, n, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int m = 2;
        int n = 3;
        int k = 6;
        int expected = 6;
        var result = solution.findKthNumber(m, n, k);
        assertThat(result).isEqualTo(expected);
    }

}
