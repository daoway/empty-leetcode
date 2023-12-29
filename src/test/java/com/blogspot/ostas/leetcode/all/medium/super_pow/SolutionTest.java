package com.blogspot.ostas.leetcode.all.medium.super_pow;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: a = 2, b = [3]
    Output: 8
    Example 2:
    Input: a = 2, b = [1,0]
    Output: 1024
    Example 3:
    Input: a = 1, b = [4,3,3,8,5,2]
    Output: 1
      Constraints:
    1 <= a <= 231 - 1
    1 <= b.length <= 2000
    0 <= b[i] <= 9
    b does not contain leading zeros.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int a = 2;
        int[] b = new int[]{3};
        int expected = 8;
        var result = solution.superPow(a, b);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int a = 2;
        int[] b = new int[]{1, 0};
        int expected = 1024;
        var result = solution.superPow(a, b);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int a = 1;
        int[] b = new int[]{4, 3, 3, 8, 5, 2};
        int expected = 1;
        var result = solution.superPow(a, b);
        assertThat(result).isEqualTo(expected);
    }

}
