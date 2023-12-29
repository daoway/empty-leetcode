package com.blogspot.ostas.leetcode.all.easy.thousand_separator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 987
    Output: "987"
    Example 2:
    Input: n = 1234
    Output: "1.234"
      Constraints:
    0 <= n <= 231 - 1
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 987;
        String expected = "987";
        var result = solution.thousandSeparator(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 1234;
        String expected = "1.234";
        var result = solution.thousandSeparator(n);
        assertThat(result).isEqualTo(expected);
    }

}
