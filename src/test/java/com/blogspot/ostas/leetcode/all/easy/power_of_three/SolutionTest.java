package com.blogspot.ostas.leetcode.all.easy.power_of_three;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 27
    Output: true
    Explanation: 27 = 33
    Example 2:
    Input: n = 0
    Output: false
    Explanation: There is no x where 3x = 0.
    Example 3:
    Input: n = -1
    Output: false
    Explanation: There is no x where 3x = (-1).
      Constraints:
    -231 <= n <= 231 - 1
      Follow up: Could you solve it without loops/recursion?
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 27;
        boolean expected = true;
        var result = solution.isPowerOfThree(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 0;
        boolean expected = false;
        var result = solution.isPowerOfThree(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int n = -1;
        boolean expected = false;
        var result = solution.isPowerOfThree(n);
        assertThat(result).isEqualTo(expected);
    }

}
