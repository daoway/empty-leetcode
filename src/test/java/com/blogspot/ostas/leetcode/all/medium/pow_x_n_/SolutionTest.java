package com.blogspot.ostas.leetcode.all.medium.pow_x_n_;

import org.junit.jupiter.api.Test;

import static com.blogspot.ostas.leetcode.all.common.Utils.round;
import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: x = 2.00000, n = 10
    Output: 1024.00000
    Example 2:
    Input: x = 2.10000, n = 3
    Output: 9.26100
    Example 3:
    Input: x = 2.00000, n = -2
    Output: 0.25000
    Explanation: 2-2 = 1/22 = 1/4 = 0.25
      Constraints:
    -100.0 < x < 100.0
    -231 <= n <= 231-1
    n is an integer.
    Either x is not zero or n > 0.
    -104 <= xn <= 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        double x = 2.00000;
        int n = 10;
        double expected = 1024.00000;
        var result = solution.myPow(x, n);
        assertThat(result).isEqualTo(expected);
    }

    /*
      expected: 9.261
      but was: 9.261000000000001
      but passed on LC
     */
    @Test
    void example_1() {
        var solution = new Solution();
        double x = 2.10000;
        int n = 3;
        double expected = 9.26100;
        var result = solution.myPow(x, n);
        assertThat(round(result)).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        double x = 2.00000;
        int n = -2;
        double expected = 0.25000;
        var result = solution.myPow(x, n);
        assertThat(result).isEqualTo(expected);
    }

}
