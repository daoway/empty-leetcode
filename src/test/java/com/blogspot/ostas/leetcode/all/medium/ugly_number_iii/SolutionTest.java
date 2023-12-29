package com.blogspot.ostas.leetcode.all.medium.ugly_number_iii;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 3, a = 2, b = 3, c = 5
    Output: 4
    Explanation: The ugly numbers are 2, 3, 4, 5, 6, 8, 9, 10... The 3rd is 4.
    Example 2:
    Input: n = 4, a = 2, b = 3, c = 4
    Output: 6
    Explanation: The ugly numbers are 2, 3, 4, 6, 8, 9, 10, 12... The 4th is 6.
    Example 3:
    Input: n = 5, a = 2, b = 11, c = 13
    Output: 10
    Explanation: The ugly numbers are 2, 4, 6, 8, 10, 11, 12, 13... The 5th is 10.
      Constraints:
    1 <= n, a, b, c <= 109
    1 <= a * b * c <= 1018
    It is guaranteed that the result will be in range [1, 2 * 109].
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 3;
        int a = 2;
        int b = 3;
        int c = 5;
        int expected = 4;
        var result = solution.nthUglyNumber(n, a, b, c);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 4;
        int a = 2;
        int b = 3;
        int c = 4;
        int expected = 6;
        var result = solution.nthUglyNumber(n, a, b, c);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int n = 5;
        int a = 2;
        int b = 11;
        int c = 13;
        int expected = 10;
        var result = solution.nthUglyNumber(n, a, b, c);
        assertThat(result).isEqualTo(expected);
    }

}
