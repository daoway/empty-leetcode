package com.blogspot.ostas.leetcode.all.easy.three_divisors;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 2
    Output: false
    Explantion: 2 has only two divisors: 1 and 2.
    Example 2:
    Input: n = 4
    Output: true
    Explantion: 4 has three divisors: 1, 2, and 4.
      Constraints:
    1 <= n <= 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 2;
        boolean expected = false;
        var result = solution.isThree(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 4;
        boolean expected = true;
        var result = solution.isThree(n);
        assertThat(result).isEqualTo(expected);
    }

}
