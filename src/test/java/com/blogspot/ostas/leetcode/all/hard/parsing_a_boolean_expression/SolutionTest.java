package com.blogspot.ostas.leetcode.all.hard.parsing_a_boolean_expression;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: expression = "&(|(f))"
    Output: false
    Explanation:
    First, evaluate |(f) --> f. The expression is now "&(f)".
    Then, evaluate &(f) --> f. The expression is now "f".
    Finally, return false.
    Example 2:
    Input: expression = "|(f,f,f,t)"
    Output: true
    Explanation: The evaluation of (false OR false OR false OR true) is true.
    Example 3:
    Input: expression = "!(&(f,t))"
    Output: true
    Explanation:
    First, evaluate &(f,t) --> (false AND true) --> false --> f. The expression is now "!(f)".
    Then, evaluate !(f) --> NOT false --> true. We return true.
      Constraints:
    1 <= expression.length <= 2 * 104
    expression[i] is one following characters: '(', ')', '&', '|', '!', 't', 'f', and ','.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String expression = "&(|(f))";
        boolean expected = false;
        var result = solution.parseBoolExpr(expression);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String expression = "|(f,f,f,t)";
        boolean expected = true;
        var result = solution.parseBoolExpr(expression);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String expression = "!(&(f,t))";
        boolean expected = true;
        var result = solution.parseBoolExpr(expression);
        assertThat(result).isEqualTo(expected);
    }

}
