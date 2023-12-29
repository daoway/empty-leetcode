package com.blogspot.ostas.leetcode.all.hard.largest_palindrome_product;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 2
    Output: 987
    Explanation: 99 x 91 = 9009, 9009 % 1337 = 987
    Example 2:
    Input: n = 1
    Output: 9
      Constraints:
    1 <= n <= 8
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 2;
        int expected = 987;
        var result = solution.largestPalindrome(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 1;
        int expected = 9;
        var result = solution.largestPalindrome(n);
        assertThat(result).isEqualTo(expected);
    }

}
