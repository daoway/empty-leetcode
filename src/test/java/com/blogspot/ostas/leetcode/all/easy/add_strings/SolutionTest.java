package com.blogspot.ostas.leetcode.all.easy.add_strings;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: num1 = "11", num2 = "123"
    Output: "134"
    Example 2:
    Input: num1 = "456", num2 = "77"
    Output: "533"
    Example 3:
    Input: num1 = "0", num2 = "0"
    Output: "0"
      Constraints:
    1 <= num1.length, num2.length <= 104
    num1 and num2 consist of only digits.
    num1 and num2 don't have any leading zeros except for the zero itself.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String num1 = "11";
        String num2 = "123";
        String expected = "134";
        var result = solution.addStrings(num1, num2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String num1 = "456";
        String num2 = "77";
        String expected = "533";
        var result = solution.addStrings(num1, num2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String num1 = "0";
        String num2 = "0";
        String expected = "0";
        var result = solution.addStrings(num1, num2);
        assertThat(result).isEqualTo(expected);
    }

}
