package com.blogspot.ostas.leetcode.all.easy.greatest_common_divisor_of_strings;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: str1 = "ABCABC", str2 = "ABC"
    Output: "ABC"
    Example 2:
    Input: str1 = "ABABAB", str2 = "ABAB"
    Output: "AB"
    Example 3:
    Input: str1 = "LEET", str2 = "CODE"
    Output: ""
      Constraints:
    1 <= str1.length, str2.length <= 1000
    str1 and str2 consist of English uppercase letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String str1 = "ABCABC";
        String str2 = "ABC";
        String expected = "ABC";
        var result = solution.gcdOfStrings(str1, str2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String str1 = "ABABAB";
        String str2 = "ABAB";
        String expected = "AB";
        var result = solution.gcdOfStrings(str1, str2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String str1 = "LEET";
        String str2 = "CODE";
        String expected = "";
        var result = solution.gcdOfStrings(str1, str2);
        assertThat(result).isEqualTo(expected);
    }

}
