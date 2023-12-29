package com.blogspot.ostas.leetcode.all.easy.guess_number_higher_or_lower;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 10, pick = 6
    Output: 6
    Example 2:
    Input: n = 1, pick = 1
    Output: 1
    Example 3:
    Input: n = 2, pick = 1
    Output: 1
      Constraints:
    1 <= n <= 231 - 1
    1 <= pick <= n
    */
    @Test
    void example_0() {
        var solution = new Solution();
        solution.pick = 6;
        int n = 10;
        int expected = 6;
        var result = solution.guessNumber(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        solution.pick = 1;
        int n = 1;
        int expected = 1;
        var result = solution.guessNumber(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        solution.pick = 1;
        int n = 2;
        int expected = 1;
        var result = solution.guessNumber(n);
        assertThat(result).isEqualTo(expected);
    }

}
