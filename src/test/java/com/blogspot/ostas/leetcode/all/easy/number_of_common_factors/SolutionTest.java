package com.blogspot.ostas.leetcode.all.easy.number_of_common_factors;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: a = 12, b = 6
    Output: 4
    Explanation: The common factors of 12 and 6 are 1, 2, 3, 6.
    Example 2:
    Input: a = 25, b = 30
    Output: 2
    Explanation: The common factors of 25 and 30 are 1, 5.
      Constraints:
    1 <= a, b <= 1000
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int a = 12;
        int b = 6;
        int expected = 4;
        var result = solution.commonFactors(a, b);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int a = 25;
        int b = 30;
        int expected = 2;
        var result = solution.commonFactors(a, b);
        assertThat(result).isEqualTo(expected);
    }

}
