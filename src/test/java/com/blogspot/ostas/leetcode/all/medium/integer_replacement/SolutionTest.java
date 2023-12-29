package com.blogspot.ostas.leetcode.all.medium.integer_replacement;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 8
    Output: 3
    Explanation: 8 -> 4 -> 2 -> 1
    Example 2:
    Input: n = 7
    Output: 4
    Explanation: 7 -> 8 -> 4 -> 2 -> 1
    or 7 -> 6 -> 3 -> 2 -> 1
    Example 3:
    Input: n = 4
    Output: 2
      Constraints:
    1 <= n <= 231 - 1
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 8;
        int expected = 3;
        var result = solution.integerReplacement(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 7;
        int expected = 4;
        var result = solution.integerReplacement(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int n = 4;
        int expected = 2;
        var result = solution.integerReplacement(n);
        assertThat(result).isEqualTo(expected);
    }

}
