package com.blogspot.ostas.leetcode.all.medium.integer_to_roman;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: num = 3
    Output: "III"
    Explanation: 3 is represented as 3 ones.
    Example 2:
    Input: num = 58
    Output: "LVIII"
    Explanation: L = 50, V = 5, III = 3.
    Example 3:
    Input: num = 1994
    Output: "MCMXCIV"
    Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
      Constraints:
    1 <= num <= 3999
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int num = 3;
        String expected = "III";
        var result = solution.intToRoman(num);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int num = 58;
        String expected = "LVIII";
        var result = solution.intToRoman(num);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int num = 1994;
        String expected = "MCMXCIV";
        var result = solution.intToRoman(num);
        assertThat(result).isEqualTo(expected);
    }

}
