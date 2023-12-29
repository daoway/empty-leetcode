package com.blogspot.ostas.leetcode.all.medium.complex_number_multiplication;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: num1 = "1+1i", num2 = "1+1i"
    Output: "0+2i"
    Explanation: (1 + i) * (1 + i) = 1 + i2 + 2 * i = 2i, and you need convert it to the form of 0+2i.
    Example 2:
    Input: num1 = "1+-1i", num2 = "1+-1i"
    Output: "0+-2i"
    Explanation: (1 - i) * (1 - i) = 1 + i2 - 2 * i = -2i, and you need convert it to the form of 0+-2i.
      Constraints:
    num1 and num2 are valid complex numbers.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String num1 = "1+1i";
        String num2 = "1+1i";
        String expected = "0+2i";
        var result = solution.complexNumberMultiply(num1, num2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String num1 = "1+-1i";
        String num2 = "1+-1i";
        String expected = "0+-2i";
        var result = solution.complexNumberMultiply(num1, num2);
        assertThat(result).isEqualTo(expected);
    }

}
