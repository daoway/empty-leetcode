package com.blogspot.ostas.leetcode.all.medium.count_numbers_with_unique_digits;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 2
    Output: 91
    Explanation: The answer should be the total numbers in the range of 0 ≤ x < 100, excluding 11,22,33,44,55,66,77,88,99
    Example 2:
    Input: n = 0
    Output: 1
      Constraints:
    0 <= n <= 8
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 2;
        int expected = 91;
        var result = solution.countNumbersWithUniqueDigits(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 0;
        int expected = 1;
        var result = solution.countNumbersWithUniqueDigits(n);
        assertThat(result).isEqualTo(expected);
    }

}
