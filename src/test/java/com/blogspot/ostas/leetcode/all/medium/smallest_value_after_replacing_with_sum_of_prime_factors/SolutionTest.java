package com.blogspot.ostas.leetcode.all.medium.smallest_value_after_replacing_with_sum_of_prime_factors;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 15
    Output: 5
    Explanation: Initially, n = 15.
    15 = 3 * 5, so replace n with 3 + 5 = 8.
    8 = 2 * 2 * 2, so replace n with 2 + 2 + 2 = 6.
    6 = 2 * 3, so replace n with 2 + 3 = 5.
    5 is the smallest value n will take on.
    Example 2:
    Input: n = 3
    Output: 3
    Explanation: Initially, n = 3.
    3 is the smallest value n will take on.
      Constraints:
    2 <= n <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 15;
        int expected = 5;
        var result = solution.smallestValue(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 3;
        int expected = 3;
        var result = solution.smallestValue(n);
        assertThat(result).isEqualTo(expected);
    }

}
