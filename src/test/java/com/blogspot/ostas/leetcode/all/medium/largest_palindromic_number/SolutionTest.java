package com.blogspot.ostas.leetcode.all.medium.largest_palindromic_number;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: num = "444947137"
    Output: "7449447"
    Explanation:
    Use the digits "4449477" from "444947137" to form the palindromic integer "7449447".
    It can be shown that "7449447" is the largest palindromic integer that can be formed.
    Example 2:
    Input: num = "00009"
    Output: "9"
    Explanation:
    It can be shown that "9" is the largest palindromic integer that can be formed.
    Note that the integer returned should not contain leading zeroes.
      Constraints:
    1 <= num.length <= 105
    num consists of digits.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String num = "444947137";
        String expected = "7449447";
        var result = solution.largestPalindromic(num);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String num = "00009";
        String expected = "9";
        var result = solution.largestPalindromic(num);
        assertThat(result).isEqualTo(expected);
    }

}
