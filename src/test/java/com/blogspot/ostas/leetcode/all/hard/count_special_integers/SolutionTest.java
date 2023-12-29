package com.blogspot.ostas.leetcode.all.hard.count_special_integers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 20
    Output: 19
    Explanation: All the integers from 1 to 20, except 11, are special. Thus, there are 19 special integers.
    Example 2:
    Input: n = 5
    Output: 5
    Explanation: All the integers from 1 to 5 are special.
    Example 3:
    Input: n = 135
    Output: 110
    Explanation: There are 110 integers from 1 to 135 that are special.
    Some of the integers that are not special are: 22, 114, and 131.
      Constraints:
    1 <= n <= 2 * 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 20;
        int expected = 19;
        var result = solution.countSpecialNumbers(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 5;
        int expected = 5;
        var result = solution.countSpecialNumbers(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int n = 135;
        int expected = 110;
        var result = solution.countSpecialNumbers(n);
        assertThat(result).isEqualTo(expected);
    }

}
