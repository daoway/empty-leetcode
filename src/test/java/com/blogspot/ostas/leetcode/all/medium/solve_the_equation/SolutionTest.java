package com.blogspot.ostas.leetcode.all.medium.solve_the_equation;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: equation = "x+5-3+x=6+x-2"
    Output: "x=2"
    Example 2:
    Input: equation = "x=x"
    Output: "Infinite solutions"
    Example 3:
    Input: equation = "2x=x"
    Output: "x=0"
      Constraints:
    3 <= equation.length <= 1000
    equation has exactly one '='.
    equation consists of integers with an absolute value in the range [0, 100] without any leading zeros, and the variable 'x'.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String equation = "x+5-3+x=6+x-2";
        String expected = "x=2";
        var result = solution.solveEquation(equation);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String equation = "x=x";
        String expected = "Infinite solutions";
        var result = solution.solveEquation(equation);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String equation = "2x=x";
        String expected = "x=0";
        var result = solution.solveEquation(equation);
        assertThat(result).isEqualTo(expected);
    }

}
