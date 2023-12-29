package com.blogspot.ostas.leetcode.all.hard.numbers_with_repeated_digits;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 20
    Output: 1
    Explanation: The only positive number (<= 20) with at least 1 repeated digit is 11.
    Example 2:
    Input: n = 100
    Output: 10
    Explanation: The positive numbers (<= 100) with atleast 1 repeated digit are 11, 22, 33, 44, 55, 66, 77, 88, 99, and 100.
    Example 3:
    Input: n = 1000
    Output: 262
      Constraints:
    1 <= n <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 20;
        int expected = 1;
        var result = solution.numDupDigitsAtMostN(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 100;
        int expected = 10;
        var result = solution.numDupDigitsAtMostN(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int n = 1000;
        int expected = 262;
        var result = solution.numDupDigitsAtMostN(n);
        assertThat(result).isEqualTo(expected);
    }

}
