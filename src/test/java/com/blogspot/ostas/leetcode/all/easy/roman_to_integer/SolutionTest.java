package com.blogspot.ostas.leetcode.all.easy.roman_to_integer;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "III"
    Output: 3
    Explanation: III = 3.
    Example 2:
    Input: s = "LVIII"
    Output: 58
    Explanation: L = 50, V= 5, III = 3.
    Example 3:
    Input: s = "MCMXCIV"
    Output: 1994
    Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
      Constraints:
    1 <= s.length <= 15
    s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
    It is guaranteed that s is a valid roman numeral in the range [1, 3999].
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "III";
        int expected = 3;
        var result = solution.romanToInt(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "LVIII";
        int expected = 58;
        var result = solution.romanToInt(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "MCMXCIV";
        int expected = 1994;
        var result = solution.romanToInt(s);
        assertThat(result).isEqualTo(expected);
    }

}
