package com.blogspot.ostas.leetcode.all.medium.basic_calculator_ii;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "3+2*2"
    Output: 7
    Example 2:
    Input: s = " 3/2 "
    Output: 1
    Example 3:
    Input: s = " 3+5 / 2 "
    Output: 5
      Constraints:
    1 <= s.length <= 3 * 105
    s consists of integers and operators ('+', '-', '*', '/') separated by some number of spaces.
    s represents a valid expression.
    All the integers in the expression are non-negative integers in the range [0, 231 - 1].
    The answer is guaranteed to fit in a 32-bit integer.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "3+2*2";
        int expected = 7;
        var result = solution.calculate(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = " 3/2 ";
        int expected = 1;
        var result = solution.calculate(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = " 3+5 / 2 ";
        int expected = 5;
        var result = solution.calculate(s);
        assertThat(result).isEqualTo(expected);
    }

}
