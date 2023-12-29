package com.blogspot.ostas.leetcode.all.medium.elimination_game;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 9
    Output: 6
    Explanation:
    arr = [1, 2, 3, 4, 5, 6, 7, 8, 9]
    arr = [2, 4, 6, 8]
    arr = [2, 6]
    arr = [6]
    Example 2:
    Input: n = 1
    Output: 1
      Constraints:
    1 <= n <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 9;
        int expected = 6;
        var result = solution.lastRemaining(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 1;
        int expected = 1;
        var result = solution.lastRemaining(n);
        assertThat(result).isEqualTo(expected);
    }

}
