package com.blogspot.ostas.leetcode.all.medium.minimum_flips_to_make_a_or_b_equal_to_c;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: a = 2, b = 6, c = 5
    Output: 3
    Explanation: After flips a = 1 , b = 4 , c = 5 such that (a OR b == c)
    Example 2:
    Input: a = 4, b = 2, c = 7
    Output: 1
    Example 3:
    Input: a = 1, b = 2, c = 3
    Output: 0
      Constraints:
    1 <= a <= 10^9
    1 <= b <= 10^9
    1 <= c <= 10^9
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int a = 2;
        int b = 6;
        int c = 5;
        int expected = 3;
        var result = solution.minFlips(a, b, c);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int a = 4;
        int b = 2;
        int c = 7;
        int expected = 1;
        var result = solution.minFlips(a, b, c);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int a = 1;
        int b = 2;
        int c = 3;
        int expected = 0;
        var result = solution.minFlips(a, b, c);
        assertThat(result).isEqualTo(expected);
    }

}
