package com.blogspot.ostas.leetcode.all.hard.expression_add_operators;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: num = "123", target = 6
    Output: ["1*2*3","1+2+3"]
    Explanation: Both "1*2*3" and "1+2+3" evaluate to 6.
    Example 2:
    Input: num = "232", target = 8
    Output: ["2*3+2","2+3*2"]
    Explanation: Both "2*3+2" and "2+3*2" evaluate to 8.
    Example 3:
    Input: num = "3456237490", target = 9191
    Output: []
    Explanation: There are no expressions that can be created from "3456237490" to evaluate to 9191.
      Constraints:
    1 <= num.length <= 10
    num consists of only digits.
    -231 <= target <= 231 - 1
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String num = "123";
        int target = 6;
        List<String> expected = List.of("1*2*3", "1+2+3");
        var result = solution.addOperators(num, target);
        assertThat(result).containsExactlyInAnyOrderElementsOf(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String num = "232";
        int target = 8;
        List<String> expected = List.of("2*3+2", "2+3*2");
        var result = solution.addOperators(num, target);
        assertThat(result).containsExactlyInAnyOrderElementsOf(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String num = "3456237490";
        int target = 9191;
        List<String> expected = List.of();
        var result = solution.addOperators(num, target);
        assertThat(result).isEqualTo(expected);
    }

}
