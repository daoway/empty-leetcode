package com.blogspot.ostas.leetcode.all.easy.fibonacci_number;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 2
    Output: 1
    Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.
    Example 2:
    Input: n = 3
    Output: 2
    Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.
    Example 3:
    Input: n = 4
    Output: 3
    Explanation: F(4) = F(3) + F(2) = 2 + 1 = 3.
      Constraints:
    0 <= n <= 30
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 2;
        int expected = 1;
        var result = solution.fib(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 3;
        int expected = 2;
        var result = solution.fib(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int n = 4;
        int expected = 3;
        var result = solution.fib(n);
        assertThat(result).isEqualTo(expected);
    }

}
