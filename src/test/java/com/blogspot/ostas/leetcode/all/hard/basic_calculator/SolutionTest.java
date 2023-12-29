package com.blogspot.ostas.leetcode.all.hard.basic_calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "1 + 1"
    Output: 2
    Example 2:
    Input: s = " 2-1 + 2 "
    Output: 3
    Example 3:
    Input: s = "(1+(4+5+2)-3)+(6+8)"
    Output: 23
      Constraints:
    1 <= s.length <= 3 * 105
    s consists of digits, '+', '-', '(', ')', and ' '.
    s represents a valid expression.
    '+' is not used as a unary operation (i.e., "+1" and "+(2 + 3)" is invalid).
    '-' could be used as a unary operation (i.e., "-1" and "-(2 + 3)" is valid).
    There will be no two consecutive operators in the input.
    Every number and running calculation will fit in a signed 32-bit integer.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "1 + 1";
        int expected = 2;
        var result = solution.calculate(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = " 2-1 + 2 ";
        int expected = 3;
        var result = solution.calculate(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "(1+(4+5+2)-3)+(6+8)";
        int expected = 23;
        var result = solution.calculate(s);
        assertThat(result).isEqualTo(expected);
    }

}
