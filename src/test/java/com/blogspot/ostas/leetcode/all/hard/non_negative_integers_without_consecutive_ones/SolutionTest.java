package com.blogspot.ostas.leetcode.all.hard.non_negative_integers_without_consecutive_ones;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 5
    Output: 5
    Explanation:
    Here are the non-negative integers <= 5 with their corresponding binary representations:
    0 : 0
    1 : 1
    2 : 10
    3 : 11
    4 : 100
    5 : 101
    Among them, only integer 3 disobeys the rule (two consecutive ones) and the other 5 satisfy the rule.
    Example 2:
    Input: n = 1
    Output: 2
    Example 3:
    Input: n = 2
    Output: 3
      Constraints:
    1 <= n <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 5;
        int expected = 5;
        var result = solution.findIntegers(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 1;
        int expected = 2;
        var result = solution.findIntegers(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int n = 2;
        int expected = 3;
        var result = solution.findIntegers(n);
        assertThat(result).isEqualTo(expected);
    }

}
