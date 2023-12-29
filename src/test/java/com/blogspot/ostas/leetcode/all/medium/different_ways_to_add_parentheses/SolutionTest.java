package com.blogspot.ostas.leetcode.all.medium.different_ways_to_add_parentheses;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: expression = "2-1-1"
    Output: [0,2]
    Explanation:
    ((2-1)-1) = 0
    (2-(1-1)) = 2
    Example 2:
    Input: expression = "2*3-4*5"
    Output: [-34,-14,-10,-10,10]
    Explanation:
    (2*(3-(4*5))) = -34
    ((2*3)-(4*5)) = -14
    ((2*(3-4))*5) = -10
    (2*((3-4)*5)) = -10
    (((2*3)-4)*5) = 10
      Constraints:
    1 <= expression.length <= 20
    expression consists of digits and the operator '+', '-', and '*'.
    All the integer values in the input expression are in the range [0, 99].
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String expression = "2-1-1";
        List<Integer> expected = List.of(0, 2);
        var result = solution.diffWaysToCompute(expression);
        assertThat(result).containsExactlyInAnyOrderElementsOf(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String expression = "2*3-4*5";
        List<Integer> expected = List.of(-34, -14, -10, -10, 10);
        var result = solution.diffWaysToCompute(expression);
        assertThat(result).containsExactlyInAnyOrderElementsOf(expected);
    }

}
