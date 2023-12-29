package com.blogspot.ostas.leetcode.all.medium.reverse_integer;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: x = 123
    Output: 321
    Example 2:
    Input: x = -123
    Output: -321
    Example 3:
    Input: x = 120
    Output: 21
      Constraints:
    -231 <= x <= 231 - 1
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int x = 123;
        int expected = 321;
        var result = solution.reverse(x);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int x = -123;
        int expected = -321;
        var result = solution.reverse(x);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int x = 120;
        int expected = 21;
        var result = solution.reverse(x);
        assertThat(result).isEqualTo(expected);
    }

}
