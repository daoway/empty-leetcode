package com.blogspot.ostas.leetcode.all.medium.sum_of_square_numbers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: c = 5
    Output: true
    Explanation: 1 * 1 + 2 * 2 = 5
    Example 2:
    Input: c = 3
    Output: false
      Constraints:
    0 <= c <= 231 - 1
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int c = 5;
        boolean expected = true;
        var result = solution.judgeSquareSum(c);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int c = 3;
        boolean expected = false;
        var result = solution.judgeSquareSum(c);
        assertThat(result).isEqualTo(expected);
    }

}
