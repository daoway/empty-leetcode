package com.blogspot.ostas.leetcode.all.medium.knight_dialer;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 1
    Output: 10
    Explanation: We need to dial a number of length 1, so placing the knight over any numeric cell of the 10 cells is sufficient.
    Example 2:
    Input: n = 2
    Output: 20
    Explanation: All the valid number we can dial are [04, 06, 16, 18, 27, 29, 34, 38, 40, 43, 49, 60, 61, 67, 72, 76, 81, 83, 92, 94]
    Example 3:
    Input: n = 3131
    Output: 136006598
    Explanation: Please take care of the mod.
      Constraints:
    1 <= n <= 5000
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 1;
        int expected = 10;
        var result = solution.knightDialer(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 2;
        int expected = 20;
        var result = solution.knightDialer(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int n = 3131;
        int expected = 136006598;
        var result = solution.knightDialer(n);
        assertThat(result).isEqualTo(expected);
    }

}
