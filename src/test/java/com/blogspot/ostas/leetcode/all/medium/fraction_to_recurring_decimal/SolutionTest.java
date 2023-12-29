package com.blogspot.ostas.leetcode.all.medium.fraction_to_recurring_decimal;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: numerator = 1, denominator = 2
    Output: "0.5"
    Example 2:
    Input: numerator = 2, denominator = 1
    Output: "2"
    Example 3:
    Input: numerator = 4, denominator = 333
    Output: "0.(012)"
      Constraints:
    -231 <= numerator, denominator <= 231 - 1
    denominator != 0
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int numerator = 1;
        int denominator = 2;
        String expected = "0.5";
        var result = solution.fractionToDecimal(numerator, denominator);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int numerator = 2;
        int denominator = 1;
        String expected = "2";
        var result = solution.fractionToDecimal(numerator, denominator);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int numerator = 4;
        int denominator = 333;
        String expected = "0.(012)";
        var result = solution.fractionToDecimal(numerator, denominator);
        assertThat(result).isEqualTo(expected);
    }

}
