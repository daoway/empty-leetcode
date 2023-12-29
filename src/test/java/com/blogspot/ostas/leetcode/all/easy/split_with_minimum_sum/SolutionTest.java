package com.blogspot.ostas.leetcode.all.easy.split_with_minimum_sum;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: num = 4325
    Output: 59
    Explanation: We can split 4325 so that num1 is 24 and num2 is 35, giving a sum of 59. We can prove that 59 is indeed the minimal possible sum.
    Example 2:
    Input: num = 687
    Output: 75
    Explanation: We can split 687 so that num1 is 68 and num2 is 7, which would give an optimal sum of 75.
      Constraints:
    10 <= num <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int num = 4325;
        int expected = 59;
        var result = solution.splitNum(num);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int num = 687;
        int expected = 75;
        var result = solution.splitNum(num);
        assertThat(result).isEqualTo(expected);
    }

}
