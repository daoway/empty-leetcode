package com.blogspot.ostas.leetcode.all.easy.maximum_difference_by_remapping_a_digit;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: num = 11891
    Output: 99009
    Explanation:
    To achieve the maximum value, Bob can remap the digit 1 to the digit 9 to yield 99899.
    To achieve the minimum value, Bob can remap the digit 1 to the digit 0, yielding 890.
    The difference between these two numbers is 99009.
    Example 2:
    Input: num = 90
    Output: 99
    Explanation:
    The maximum value that can be returned by the function is 99 (if 0 is replaced by 9) and the minimum value that can be returned by the function is 0 (if 9 is replaced by 0).
    Thus, we return 99.
      Constraints:
    1 <= num <= 108
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int num = 11891;
        int expected = 99009;
        var result = solution.minMaxDifference(num);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int num = 90;
        int expected = 99;
        var result = solution.minMaxDifference(num);
        assertThat(result).isEqualTo(expected);
    }

}
