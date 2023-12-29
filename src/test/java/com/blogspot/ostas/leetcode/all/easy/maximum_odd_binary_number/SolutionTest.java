package com.blogspot.ostas.leetcode.all.easy.maximum_odd_binary_number;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "010"
    Output: "001"
    Explanation: Because there is just one '1', it must be in the last position. So the answer is "001".
    Example 2:
    Input: s = "0101"
    Output: "1001"
    Explanation: One of the '1's must be in the last position. The maximum number that can be made with the remaining digits is "100". So the answer is "1001".
      Constraints:
    1 <= s.length <= 100
    s consists only of '0' and '1'.
    s contains at least one '1'.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "010";
        String expected = "001";
        var result = solution.maximumOddBinaryNumber(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "0101";
        String expected = "1001";
        var result = solution.maximumOddBinaryNumber(s);
        assertThat(result).isEqualTo(expected);
    }

}
