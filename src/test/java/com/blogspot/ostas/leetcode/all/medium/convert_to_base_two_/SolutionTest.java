package com.blogspot.ostas.leetcode.all.medium.convert_to_base_two_;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 2
    Output: "110"
    Explantion: (-2)2 + (-2)1 = 2
    Example 2:
    Input: n = 3
    Output: "111"
    Explantion: (-2)2 + (-2)1 + (-2)0 = 3
    Example 3:
    Input: n = 4
    Output: "100"
    Explantion: (-2)2 = 4
      Constraints:
    0 <= n <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 2;
        String expected = "110";
        var result = solution.baseNeg2(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 3;
        String expected = "111";
        var result = solution.baseNeg2(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int n = 4;
        String expected = "100";
        var result = solution.baseNeg2(n);
        assertThat(result).isEqualTo(expected);
    }

}
