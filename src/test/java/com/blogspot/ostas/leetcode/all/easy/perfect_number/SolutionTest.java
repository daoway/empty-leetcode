package com.blogspot.ostas.leetcode.all.easy.perfect_number;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: num = 28
    Output: true
    Explanation: 28 = 1 + 2 + 4 + 7 + 14
    1, 2, 4, 7, and 14 are all divisors of 28.
    Example 2:
    Input: num = 7
    Output: false
      Constraints:
    1 <= num <= 108
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int num = 28;
        boolean expected = true;
        var result = solution.checkPerfectNumber(num);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int num = 7;
        boolean expected = false;
        var result = solution.checkPerfectNumber(num);
        assertThat(result).isEqualTo(expected);
    }

}
