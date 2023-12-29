package com.blogspot.ostas.leetcode.all.hard.basic_calculator_iv;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: expression = "e + 8 - a + 5", evalvars = ["e"], evalints = [1]
    Output: ["-1*a","14"]
    Example 2:
    Input: expression = "e - 8 + temperature - pressure", evalvars = ["e", "temperature"], evalints = [1, 12]
    Output: ["-1*pressure","5"]
    Example 3:
    Input: expression = "(e + 8) * (e - 8)", evalvars = [], evalints = []
    Output: ["1*e*e","-64"]
      Constraints:
    1 <= expression.length <= 250
    expression consists of lowercase English letters, digits, '+', '-', '*', '(', ')', ' '.
    expression does not contain any leading or trailing spaces.
    All the tokens in expression are separated by a single space.
    0 <= evalvars.length <= 100
    1 <= evalvars[i].length <= 20
    evalvars[i] consists of lowercase English letters.
    evalints.length == evalvars.length
    -100 <= evalints[i] <= 100
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String expression = "e + 8 - a + 5";
        String[] evalvars = new String[]{"e"};
        int[] evalints = new int[]{1};
        List<String> expected = List.of("-1*a", "14");
        var result = solution.basicCalculatorIV(expression, evalvars, evalints);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String expression = "e - 8 + temperature - pressure";
        String[] evalvars = new String[]{"e", "temperature"};
        int[] evalints = new int[]{1, 12};
        List<String> expected = List.of("-1*pressure", "5");
        var result = solution.basicCalculatorIV(expression, evalvars, evalints);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String expression = "(e + 8) * (e - 8)";
        String[] evalvars = new String[]{};
        int[] evalints = new int[]{};
        List<String> expected = List.of("1*e*e", "-64");
        var result = solution.basicCalculatorIV(expression, evalvars, evalints);
        assertThat(result).isEqualTo(expected);
    }

}
