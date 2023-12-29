package com.blogspot.ostas.leetcode.all.medium.maximum_binary_string_after_change;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: binary = "000110"
    Output: "111011"
    Explanation: A valid transformation sequence can be:
    "000110" -> "000101"
    "000101" -> "100101"
    "100101" -> "110101"
    "110101" -> "110011"
    "110011" -> "111011"
    Example 2:
    Input: binary = "01"
    Output: "01"
    Explanation: "01" cannot be transformed any further.
      Constraints:
    1 <= binary.length <= 105
    binary consist of '0' and '1'.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String binary = "000110";
        String expected = "111011";
        var result = solution.maximumBinaryString(binary);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String binary = "01";
        String expected = "01";
        var result = solution.maximumBinaryString(binary);
        assertThat(result).isEqualTo(expected);
    }

}
