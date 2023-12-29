package com.blogspot.ostas.leetcode.all.hard.count_palindromic_subsequences;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "103301"
    Output: 2
    Explanation:
    There are 6 possible subsequences of length 5: "10330","10331","10301","10301","13301","03301".
    Two of them (both equal to "10301") are palindromic.
    Example 2:
    Input: s = "0000000"
    Output: 21
    Explanation: All 21 subsequences are "00000", which is palindromic.
    Example 3:
    Input: s = "9999900000"
    Output: 2
    Explanation: The only two palindromic subsequences are "99999" and "00000".
      Constraints:
    1 <= s.length <= 104
    s consists of digits.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "103301";
        int expected = 2;
        var result = solution.countPalindromes(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "0000000";
        int expected = 21;
        var result = solution.countPalindromes(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "9999900000";
        int expected = 2;
        var result = solution.countPalindromes(s);
        assertThat(result).isEqualTo(expected);
    }

}
