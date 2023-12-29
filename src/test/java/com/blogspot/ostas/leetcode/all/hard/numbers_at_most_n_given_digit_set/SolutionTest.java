package com.blogspot.ostas.leetcode.all.hard.numbers_at_most_n_given_digit_set;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: digits = ["1","3","5","7"], n = 100
    Output: 20
    Explanation:
    The 20 numbers that can be written are:
    1, 3, 5, 7, 11, 13, 15, 17, 31, 33, 35, 37, 51, 53, 55, 57, 71, 73, 75, 77.
    Example 2:
    Input: digits = ["1","4","9"], n = 1000000000
    Output: 29523
    Explanation:
    We can write 3 one digit numbers, 9 two digit numbers, 27 three digit numbers,
    81 four digit numbers, 243 five digit numbers, 729 six digit numbers,
    2187 seven digit numbers, 6561 eight digit numbers, and 19683 nine digit numbers.
    In total, this is 29523 integers that can be written using the digits array.
    Example 3:
    Input: digits = ["7"], n = 8
    Output: 1
      Constraints:
    1 <= digits.length <= 9
    digits[i].length == 1
    digits[i] is a digit from '1' to '9'.
    All the values in digits are unique.
    digits is sorted in non-decreasing order.
    1 <= n <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String[] digits = new String[]{"1", "3", "5", "7"};
        int n = 100;
        int expected = 20;
        var result = solution.atMostNGivenDigitSet(digits, n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String[] digits = new String[]{"1", "4", "9"};
        int n = 1000000000;
        int expected = 29523;
        var result = solution.atMostNGivenDigitSet(digits, n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String[] digits = new String[]{"7"};
        int n = 8;
        int expected = 1;
        var result = solution.atMostNGivenDigitSet(digits, n);
        assertThat(result).isEqualTo(expected);
    }

}
