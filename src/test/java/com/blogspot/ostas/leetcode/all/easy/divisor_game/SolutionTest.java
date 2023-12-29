package com.blogspot.ostas.leetcode.all.easy.divisor_game;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 2
    Output: true
    Explanation: Alice chooses 1, and Bob has no more moves.
    Example 2:
    Input: n = 3
    Output: false
    Explanation: Alice chooses 1, Bob chooses 1, and Alice has no more moves.
      Constraints:
    1 <= n <= 1000
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 2;
        boolean expected = true;
        var result = solution.divisorGame(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 3;
        boolean expected = false;
        var result = solution.divisorGame(n);
        assertThat(result).isEqualTo(expected);
    }

}
