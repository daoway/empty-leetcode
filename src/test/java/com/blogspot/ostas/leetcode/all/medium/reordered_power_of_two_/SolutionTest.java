package com.blogspot.ostas.leetcode.all.medium.reordered_power_of_two_;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 1
    Output: true
    Example 2:
    Input: n = 10
    Output: false
      Constraints:
    1 <= n <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 1;
        boolean expected = true;
        var result = solution.reorderedPowerOf2(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 10;
        boolean expected = false;
        var result = solution.reorderedPowerOf2(n);
        assertThat(result).isEqualTo(expected);
    }

}
