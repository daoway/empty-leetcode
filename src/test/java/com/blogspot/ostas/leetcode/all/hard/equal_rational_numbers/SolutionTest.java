package com.blogspot.ostas.leetcode.all.hard.equal_rational_numbers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "0.(52)", t = "0.5(25)"
    Output: true
    Explanation: Because "0.(52)" represents 0.52525252..., and "0.5(25)" represents 0.52525252525..... , the strings represent the same number.
    Example 2:
    Input: s = "0.1666(6)", t = "0.166(66)"
    Output: true
    Example 3:
    Input: s = "0.9(9)", t = "1."
    Output: true
    Explanation: "0.9(9)" represents 0.999999999... repeated forever, which equals 1.  [See this link for an explanation.]
    "1." represents the number 1, which is formed correctly: (IntegerPart) = "1" and (NonRepeatingPart) = "".
      Constraints:
    Each part consists only of digits.
    The <IntegerPart> does not have leading zeros (except for the zero itself).
    1 <= <IntegerPart>.length <= 4
    0 <= <NonRepeatingPart>.length <= 4
    1 <= <RepeatingPart>.length <= 4
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "0.(52)";
        String t = "0.5(25)";
        boolean expected = true;
        var result = solution.isRationalEqual(s, t);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "0.1666(6)";
        String t = "0.166(66)";
        boolean expected = true;
        var result = solution.isRationalEqual(s, t);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "0.9(9)";
        String t = "1.";
        boolean expected = true;
        var result = solution.isRationalEqual(s, t);
        assertThat(result).isEqualTo(expected);
    }

}
