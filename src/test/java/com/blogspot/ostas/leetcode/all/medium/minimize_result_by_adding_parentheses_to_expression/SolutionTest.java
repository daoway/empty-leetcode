package com.blogspot.ostas.leetcode.all.medium.minimize_result_by_adding_parentheses_to_expression;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: expression = "247+38"
    Output: "2(47+38)"
    Explanation: The expression evaluates to 2 * (47 + 38) = 2 * 85 = 170.
    Note that "2(4)7+38" is invalid because the right parenthesis must be to the right of the '+'.
    It can be shown that 170 is the smallest possible value.
    Example 2:
    Input: expression = "12+34"
    Output: "1(2+3)4"
    Explanation: The expression evaluates to 1 * (2 + 3) * 4 = 1 * 5 * 4 = 20.
    Example 3:
    Input: expression = "999+999"
    Output: "(999+999)"
    Explanation: The expression evaluates to 999 + 999 = 1998.
      Constraints:
    3 <= expression.length <= 10
    expression consists of digits from '1' to '9' and '+'.
    expression starts and ends with digits.
    expression contains exactly one '+'.
    The original value of expression, and the value of expression after adding any pair of parentheses that meets the requirements fits within a signed 32-bit integer.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String expression = "247+38";
        String expected = "2(47+38)";
        var result = solution.minimizeResult(expression);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String expression = "12+34";
        String expected = "1(2+3)4";
        var result = solution.minimizeResult(expression);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String expression = "999+999";
        String expected = "(999+999)";
        var result = solution.minimizeResult(expression);
        assertThat(result).isEqualTo(expected);
    }

}
