package com.blogspot.ostas.leetcode.all.hard.nth_magical_number;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 1, a = 2, b = 3
    Output: 2
    Example 2:
    Input: n = 4, a = 2, b = 3
    Output: 6
      Constraints:
    1 <= n <= 109
    2 <= a, b <= 4 * 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 1;
        int a = 2;
        int b = 3;
        int expected = 2;
        var result = solution.nthMagicalNumber(n, a, b);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 4;
        int a = 2;
        int b = 3;
        int expected = 6;
        var result = solution.nthMagicalNumber(n, a, b);
        assertThat(result).isEqualTo(expected);
    }

}
