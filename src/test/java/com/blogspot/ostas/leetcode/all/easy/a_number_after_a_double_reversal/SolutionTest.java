package com.blogspot.ostas.leetcode.all.easy.a_number_after_a_double_reversal;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: num = 526
    Output: true
    Explanation: Reverse num to get 625, then reverse 625 to get 526, which equals num.
    Example 2:
    Input: num = 1800
    Output: false
    Explanation: Reverse num to get 81, then reverse 81 to get 18, which does not equal num.
    Example 3:
    Input: num = 0
    Output: true
    Explanation: Reverse num to get 0, then reverse 0 to get 0, which equals num.
      Constraints:
    0 <= num <= 106
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int num = 526;
        boolean expected = true;
        var result = solution.isSameAfterReversals(num);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int num = 1800;
        boolean expected = false;
        var result = solution.isSameAfterReversals(num);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int num = 0;
        boolean expected = true;
        var result = solution.isSameAfterReversals(num);
        assertThat(result).isEqualTo(expected);
    }

}
