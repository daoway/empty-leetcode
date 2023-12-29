package com.blogspot.ostas.leetcode.all.medium.maximum_swap;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: num = 2736
    Output: 7236
    Explanation: Swap the number 2 and the number 7.
    Example 2:
    Input: num = 9973
    Output: 9973
    Explanation: No swap.
      Constraints:
    0 <= num <= 108
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int num = 2736;
        int expected = 7236;
        var result = solution.maximumSwap(num);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int num = 9973;
        int expected = 9973;
        var result = solution.maximumSwap(num);
        assertThat(result).isEqualTo(expected);
    }

}
