package com.blogspot.ostas.leetcode.all.hard.consecutive_numbers_sum;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 5
    Output: 2
    Explanation: 5 = 2 + 3
    Example 2:
    Input: n = 9
    Output: 3
    Explanation: 9 = 4 + 5 = 2 + 3 + 4
    Example 3:
    Input: n = 15
    Output: 4
    Explanation: 15 = 8 + 7 = 4 + 5 + 6 = 1 + 2 + 3 + 4 + 5
      Constraints:
    1 <= n <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 5;
        int expected = 2;
        var result = solution.consecutiveNumbersSum(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 9;
        int expected = 3;
        var result = solution.consecutiveNumbersSum(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int n = 15;
        int expected = 4;
        var result = solution.consecutiveNumbersSum(n);
        assertThat(result).isEqualTo(expected);
    }

}
