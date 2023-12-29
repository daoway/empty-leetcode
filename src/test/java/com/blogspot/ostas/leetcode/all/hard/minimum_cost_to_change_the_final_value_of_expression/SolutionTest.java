package com.blogspot.ostas.leetcode.all.hard.minimum_cost_to_change_the_final_value_of_expression;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: expression = "1&(0|1)"
    Output: 1
    Explanation: We can turn "1&(0|1)" into "1&(0&1)" by changing the '|' to a '&' using 1 operation.
    The new expression evaluates to 0.
    Example 2:
    Input: expression = "(0&0)&(0&0&0)"
    Output: 3
    Explanation: We can turn "(0&0)&(0&0&0)" into "(0|1)|(0&0&0)" using 3 operations.
    The new expression evaluates to 1.
    Example 3:
    Input: expression = "(0|(1|0&1))"
    Output: 1
    Explanation: We can turn "(0|(1|0&1))" into "(0|(0|0&1))" using 1 operation.
    The new expression evaluates to 0.
      Constraints:
    1 <= expression.length <= 105
    expression only contains '1','0','&','|','(', and ')'
    All parentheses are properly matched.
    There will be no empty parentheses (i.e: "()" is not a substring of expression).
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String expression = "1&(0|1)";
        int expected = 1;
        var result = solution.minOperationsToFlip(expression);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String expression = "(0&0)&(0&0&0)";
        int expected = 3;
        var result = solution.minOperationsToFlip(expression);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String expression = "(0|(1|0&1))";
        int expected = 1;
        var result = solution.minOperationsToFlip(expression);
        assertThat(result).isEqualTo(expected);
    }

}
