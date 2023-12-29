package com.blogspot.ostas.leetcode.all.easy.arranging_coins;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 5
    Output: 2
    Explanation: Because the 3rd row is incomplete, we return 2.
    Example 2:
    Input: n = 8
    Output: 3
    Explanation: Because the 4th row is incomplete, we return 3.
      Constraints:
    1 <= n <= 231 - 1
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 5;
        int expected = 2;
        var result = solution.arrangeCoins(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 8;
        int expected = 3;
        var result = solution.arrangeCoins(n);
        assertThat(result).isEqualTo(expected);
    }

}
