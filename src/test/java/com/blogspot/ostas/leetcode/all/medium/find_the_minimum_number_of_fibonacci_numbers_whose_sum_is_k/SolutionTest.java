package com.blogspot.ostas.leetcode.all.medium.find_the_minimum_number_of_fibonacci_numbers_whose_sum_is_k;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: k = 7
    Output: 2
    Explanation: The Fibonacci numbers are: 1, 1, 2, 3, 5, 8, 13, ...
    For k = 7 we can use 2 + 5 = 7.
    Example 2:
    Input: k = 10
    Output: 2
    Explanation: For k = 10 we can use 2 + 8 = 10.
    Example 3:
    Input: k = 19
    Output: 3
    Explanation: For k = 19 we can use 1 + 5 + 13 = 19.
      Constraints:
    1 <= k <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int k = 7;
        int expected = 2;
        var result = solution.findMinFibonacciNumbers(k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int k = 10;
        int expected = 2;
        var result = solution.findMinFibonacciNumbers(k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int k = 19;
        int expected = 3;
        var result = solution.findMinFibonacciNumbers(k);
        assertThat(result).isEqualTo(expected);
    }

}
