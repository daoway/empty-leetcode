package com.blogspot.ostas.leetcode.all.medium.decode_ways;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "12"
    Output: 2
    Explanation: "12" could be decoded as "AB" (1 2) or "L" (12).
    Example 2:
    Input: s = "226"
    Output: 3
    Explanation: "226" could be decoded as "BZ" (2 26), "VF" (22 6), or "BBF" (2 2 6).
    Example 3:
    Input: s = "06"
    Output: 0
    Explanation: "06" cannot be mapped to "F" because of the leading zero ("6" is different from "06").
      Constraints:
    1 <= s.length <= 100
    s contains only digits and may contain leading zero(s).
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "12";
        int expected = 2;
        var result = solution.numDecodings(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "226";
        int expected = 3;
        var result = solution.numDecodings(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "06";
        int expected = 0;
        var result = solution.numDecodings(s);
        assertThat(result).isEqualTo(expected);
    }

}
