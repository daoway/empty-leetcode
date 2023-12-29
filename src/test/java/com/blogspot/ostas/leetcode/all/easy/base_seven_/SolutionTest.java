package com.blogspot.ostas.leetcode.all.easy.base_seven_;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: num = 100
    Output: "202"
    Example 2:
    Input: num = -7
    Output: "-10"
      Constraints:
    -107 <= num <= 107
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int num = 100;
        String expected = "202";
        var result = solution.convertToBase7(num);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int num = -7;
        String expected = "-10";
        var result = solution.convertToBase7(num);
        assertThat(result).isEqualTo(expected);
    }

}
