package com.blogspot.ostas.leetcode.all.medium.prime_palindrome;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 6
    Output: 7
    Example 2:
    Input: n = 8
    Output: 11
    Example 3:
    Input: n = 13
    Output: 101
      Constraints:
    1 <= n <= 108
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 6;
        int expected = 7;
        var result = solution.primePalindrome(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 8;
        int expected = 11;
        var result = solution.primePalindrome(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int n = 13;
        int expected = 101;
        var result = solution.primePalindrome(n);
        assertThat(result).isEqualTo(expected);
    }

}
