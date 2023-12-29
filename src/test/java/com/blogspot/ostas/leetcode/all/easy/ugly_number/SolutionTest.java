package com.blogspot.ostas.leetcode.all.easy.ugly_number;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 6
    Output: true
    Explanation: 6 = 2 × 3
    Example 2:
    Input: n = 1
    Output: true
    Explanation: 1 has no prime factors, therefore all of its prime factors are limited to 2, 3, and 5.
    Example 3:
    Input: n = 14
    Output: false
    Explanation: 14 is not ugly since it includes the prime factor 7.
      Constraints:
    -231 <= n <= 231 - 1
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 6;
        boolean expected = true;
        var result = solution.isUgly(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 1;
        boolean expected = true;
        var result = solution.isUgly(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int n = 14;
        boolean expected = false;
        var result = solution.isUgly(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_3() {
        var solution = new Solution();
        int n = -100;
        boolean expected = false;
        var result = solution.isUgly(n);
        assertThat(result).isEqualTo(expected);
    }

}
