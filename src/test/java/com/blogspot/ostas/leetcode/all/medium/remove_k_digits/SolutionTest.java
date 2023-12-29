package com.blogspot.ostas.leetcode.all.medium.remove_k_digits;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: num = "1432219", k = 3
    Output: "1219"
    Explanation: Remove the three digits 4, 3, and 2 to form the new number 1219 which is the smallest.
    Example 2:
    Input: num = "10200", k = 1
    Output: "200"
    Explanation: Remove the leading 1 and the number is 200. Note that the output must not contain leading zeroes.
    Example 3:
    Input: num = "10", k = 2
    Output: "0"
    Explanation: Remove all the digits from the number and it is left with nothing which is 0.
      Constraints:
    1 <= k <= num.length <= 105
    num consists of only digits.
    num does not have any leading zeros except for the zero itself.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String num = "1432219";
        int k = 3;
        String expected = "1219";
        var result = solution.removeKdigits(num, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String num = "10200";
        int k = 1;
        String expected = "200";
        var result = solution.removeKdigits(num, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String num = "10";
        int k = 2;
        String expected = "0";
        var result = solution.removeKdigits(num, k);
        assertThat(result).isEqualTo(expected);
    }

}
