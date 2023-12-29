package com.blogspot.ostas.leetcode.all.easy.nim_game;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 4
    Output: false
    Explanation: These are the possible outcomes:
    1. You remove 1 stone. Your friend removes 3 stones, including the last stone. Your friend wins.
    2. You remove 2 stones. Your friend removes 2 stones, including the last stone. Your friend wins.
    3. You remove 3 stones. Your friend removes the last stone. Your friend wins.
    In all outcomes, your friend wins.
    Example 2:
    Input: n = 1
    Output: true
    Example 3:
    Input: n = 2
    Output: true
      Constraints:
    1 <= n <= 231 - 1
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 4;
        boolean expected = false;
        var result = solution.canWinNim(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 1;
        boolean expected = true;
        var result = solution.canWinNim(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int n = 2;
        boolean expected = true;
        var result = solution.canWinNim(n);
        assertThat(result).isEqualTo(expected);
    }

}
