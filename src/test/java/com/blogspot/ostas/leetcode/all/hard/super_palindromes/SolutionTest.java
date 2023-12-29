package com.blogspot.ostas.leetcode.all.hard.super_palindromes;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: left = "4", right = "1000"
    Output: 4
    Explanation: 4, 9, 121, and 484 are superpalindromes.
    Note that 676 is not a superpalindrome: 26 * 26 = 676, but 26 is not a palindrome.
    Example 2:
    Input: left = "1", right = "2"
    Output: 1
      Constraints:
    1 <= left.length, right.length <= 18
    left and right consist of only digits.
    left and right cannot have leading zeros.
    left and right represent integers in the range [1, 1018 - 1].
    left is less than or equal to right.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String left = "4";
        String right = "1000";
        int expected = 4;
        var result = solution.superpalindromesInRange(left, right);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String left = "1";
        String right = "2";
        int expected = 1;
        var result = solution.superpalindromesInRange(left, right);
        assertThat(result).isEqualTo(expected);
    }

}
