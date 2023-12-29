package com.blogspot.ostas.leetcode.all.medium.ugly_number_ii;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 10
    Output: 12
    Explanation: [1, 2, 3, 4, 5, 6, 8, 9, 10, 12] is the sequence of the first 10 ugly numbers.
    Example 2:
    Input: n = 1
    Output: 1
    Explanation: 1 has no prime factors, therefore all of its prime factors are limited to 2, 3, and 5.
      Constraints:
    1 <= n <= 1690
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 10;
        int expected = 12;
        var result = solution.nthUglyNumber(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 1;
        int expected = 1;
        var result = solution.nthUglyNumber(n);
        assertThat(result).isEqualTo(expected);
    }

}
