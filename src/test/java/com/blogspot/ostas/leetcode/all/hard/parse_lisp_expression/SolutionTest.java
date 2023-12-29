package com.blogspot.ostas.leetcode.all.hard.parse_lisp_expression;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: expression = "(let x 2 (mult x (let x 3 y 4 (add x y))))"
    Output: 14
    Explanation: In the expression (add x y), when checking for the value of the variable x,
    we check from the innermost scope to the outermost in the context of the variable we are trying to evaluate.
    Since x = 3 is found first, the value of x is 3.
    Example 2:
    Input: expression = "(let x 3 x 2 x)"
    Output: 2
    Explanation: Assignment in let statements is processed sequentially.
    Example 3:
    Input: expression = "(let x 1 y 2 x (add x y) (add x y))"
    Output: 5
    Explanation: The first (add x y) evaluates as 3, and is assigned to x.
    The second (add x y) evaluates as 3+2 = 5.
      Constraints:
    1 <= expression.length <= 2000
    There are no leading or trailing spaces in expression.
    All tokens are separated by a single space in expression.
    The answer and all intermediate calculations of that answer are guaranteed to fit in a 32-bit integer.
    The expression is guaranteed to be legal and evaluate to an integer.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String expression = "(let x 2 (mult x (let x 3 y 4 (add x y))))";
        int expected = 14;
        var result = solution.evaluate(expression);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String expression = "(let x 3 x 2 x)";
        int expected = 2;
        var result = solution.evaluate(expression);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String expression = "(let x 1 y 2 x (add x y) (add x y))";
        int expected = 5;
        var result = solution.evaluate(expression);
        assertThat(result).isEqualTo(expected);
    }

}
