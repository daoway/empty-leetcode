package com.blogspot.ostas.leetcode.all.medium.check_if_number_is_a_sum_of_powers_of_three;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 12
    Output: true
    Explanation: 12 = 31 + 32
    Example 2:
    Input: n = 91
    Output: true
    Explanation: 91 = 30 + 32 + 34
    Example 3:
    Input: n = 21
    Output: false
      Constraints:
    1 <= n <= 107
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 12;
        boolean expected = true;
        var result = solution.checkPowersOfThree(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 91;
        boolean expected = true;
        var result = solution.checkPowersOfThree(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int n = 21;
        boolean expected = false;
        var result = solution.checkPowersOfThree(n);
        assertThat(result).isEqualTo(expected);
    }

}
