package com.blogspot.ostas.leetcode.all.easy.n_th_tribonacci_number;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 4
    Output: 4
    Explanation:
    T_3 = 0 + 1 + 1 = 2
    T_4 = 1 + 1 + 2 = 4
    Example 2:
    Input: n = 25
    Output: 1389537
      Constraints:
    0 <= n <= 37
    The answer is guaranteed to fit within a 32-bit integer, ie. answer <= 2^31 - 1.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 4;
        int expected = 4;
        var result = solution.tribonacci(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 25;
        int expected = 1389537;
        var result = solution.tribonacci(n);
        assertThat(result).isEqualTo(expected);
    }

}
