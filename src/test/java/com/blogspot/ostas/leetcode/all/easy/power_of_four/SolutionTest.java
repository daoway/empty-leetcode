package com.blogspot.ostas.leetcode.all.easy.power_of_four;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 16
    Output: true
    Example 2:
    Input: n = 5
    Output: false
    Example 3:
    Input: n = 1
    Output: true
      Constraints:
    -231 <= n <= 231 - 1
      Follow up: Could you solve it without loops/recursion?
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 16;
        boolean expected = true;
        var result = solution.isPowerOfFour(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 5;
        boolean expected = false;
        var result = solution.isPowerOfFour(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int n = 1;
        boolean expected = true;
        var result = solution.isPowerOfFour(n);
        assertThat(result).isEqualTo(expected);
    }

}
