package com.blogspot.ostas.leetcode.all.medium.fraction_addition_and_subtraction;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: expression = "-1/2+1/2"
    Output: "0/1"
    Example 2:
    Input: expression = "-1/2+1/2+1/3"
    Output: "1/3"
    Example 3:
    Input: expression = "1/3-1/2"
    Output: "-1/6"
      Constraints:
    The input string only contains '0' to '9', '/', '+' and '-'. So does the output.
    Each fraction (input and output) has the format ±numerator/denominator. If the first input fraction or the output is positive, then '+' will be omitted.
    The input only contains valid irreducible fractions, where the numerator and denominator of each fraction will always be in the range [1, 10]. If the denominator is 1, it means this fraction is actually an integer in a fraction format defined above.
    The number of given fractions will be in the range [1, 10].
    The numerator and denominator of the final result are guaranteed to be valid and in the range of 32-bit int.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String expression = "-1/2+1/2";
        String expected = "0/1";
        var result = solution.fractionAddition(expression);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String expression = "-1/2+1/2+1/3";
        String expected = "1/3";
        var result = solution.fractionAddition(expression);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String expression = "1/3-1/2";
        String expected = "-1/6";
        var result = solution.fractionAddition(expression);
        assertThat(result).isEqualTo(expected);
    }

}
