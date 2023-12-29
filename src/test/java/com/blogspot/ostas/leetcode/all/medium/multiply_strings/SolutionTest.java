package com.blogspot.ostas.leetcode.all.medium.multiply_strings;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: num1 = "2", num2 = "3"
    Output: "6"
    Example 2:
    Input: num1 = "123", num2 = "456"
    Output: "56088"
      Constraints:
    1 <= num1.length, num2.length <= 200
    num1 and num2 consist of digits only.
    Both num1 and num2 do not contain any leading zero, except the number 0 itself.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String num1 = "2";
        String num2 = "3";
        String expected = "6";
        var result = solution.multiply(num1, num2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String num1 = "123";
        String num2 = "456";
        String expected = "56088";
        var result = solution.multiply(num1, num2);
        assertThat(result).isEqualTo(expected);
    }

}
