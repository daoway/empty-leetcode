package com.blogspot.ostas.leetcode.all.hard.find_the_closest_palindrome;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = "123"
    Output: "121"
    Example 2:
    Input: n = "1"
    Output: "0"
    Explanation: 0 and 2 are the closest palindromes but we return the smallest which is 0.
      Constraints:
    1 <= n.length <= 18
    n consists of only digits.
    n does not have leading zeros.
    n is representing an integer in the range [1, 1018 - 1].
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String n = "123";
        String expected = "121";
        var result = solution.nearestPalindromic(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String n = "1";
        String expected = "0";
        var result = solution.nearestPalindromic(n);
        assertThat(result).isEqualTo(expected);
    }

}
