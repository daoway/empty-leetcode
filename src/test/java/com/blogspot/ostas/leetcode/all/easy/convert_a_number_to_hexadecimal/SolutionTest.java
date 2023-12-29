package com.blogspot.ostas.leetcode.all.easy.convert_a_number_to_hexadecimal;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: num = 26
    Output: "1a"
    Example 2:
    Input: num = -1
    Output: "ffffffff"
      Constraints:
    -231 <= num <= 231 - 1
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int num = 26;
        String expected = "1a";
        var result = solution.toHex(num);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int num = -1;
        String expected = "ffffffff";
        var result = solution.toHex(num);
        assertThat(result).isEqualTo(expected);
    }

}
