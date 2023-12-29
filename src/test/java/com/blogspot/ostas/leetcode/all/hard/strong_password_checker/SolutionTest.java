package com.blogspot.ostas.leetcode.all.hard.strong_password_checker;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: password = "a"
    Output: 5
    Example 2:
    Input: password = "aA1"
    Output: 3
    Example 3:
    Input: password = "1337C0d3"
    Output: 0
      Constraints:
    1 <= password.length <= 50
    password consists of letters, digits, dot '.' or exclamation mark '!'.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String password = "a";
        int expected = 5;
        var result = solution.strongPasswordChecker(password);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String password = "aA1";
        int expected = 3;
        var result = solution.strongPasswordChecker(password);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String password = "1337C0d3";
        int expected = 0;
        var result = solution.strongPasswordChecker(password);
        assertThat(result).isEqualTo(expected);
    }

}
