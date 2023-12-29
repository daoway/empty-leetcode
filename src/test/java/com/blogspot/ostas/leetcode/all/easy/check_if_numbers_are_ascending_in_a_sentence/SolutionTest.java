package com.blogspot.ostas.leetcode.all.easy.check_if_numbers_are_ascending_in_a_sentence;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "1 box has 3 blue 4 red 6 green and 12 yellow marbles"
    Output: true
    Explanation: The numbers in s are: 1, 3, 4, 6, 12.
    They are strictly increasing from left to right: 1 < 3 < 4 < 6 < 12.
    Example 2:
    Input: s = "hello world 5 x 5"
    Output: false
    Explanation: The numbers in s are: 5, 5. They are not strictly increasing.
    Example 3:
    Input: s = "sunset is at 7 51 pm overnight lows will be in the low 50 and 60 s"
    Output: false
    Explanation: The numbers in s are: 7, 51, 50, 60. They are not strictly increasing.
      Constraints:
    3 <= s.length <= 200
    s consists of lowercase English letters, spaces, and digits from 0 to 9, inclusive.
    The number of tokens in s is between 2 and 100, inclusive.
    The tokens in s are separated by a single space.
    There are at least two numbers in s.
    Each number in s is a positive number less than 100, with no leading zeros.
    s contains no leading or trailing spaces.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "1 box has 3 blue 4 red 6 green and 12 yellow marbles";
        boolean expected = true;
        var result = solution.areNumbersAscending(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "hello world 5 x 5";
        boolean expected = false;
        var result = solution.areNumbersAscending(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "sunset is at 7 51 pm overnight lows will be in the low 50 and 60 s";
        boolean expected = false;
        var result = solution.areNumbersAscending(s);
        assertThat(result).isEqualTo(expected);
    }

}
