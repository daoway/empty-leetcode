package com.blogspot.ostas.leetcode.all.hard.painting_a_grid_with_three_different_colors;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: m = 1, n = 1
    Output: 3
    Explanation: The three possible colorings are shown in the image above.
    Example 2:
    Input: m = 1, n = 2
    Output: 6
    Explanation: The six possible colorings are shown in the image above.
    Example 3:
    Input: m = 5, n = 5
    Output: 580986
      Constraints:
    1 <= m <= 5
    1 <= n <= 1000
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int m = 1;
        int n = 1;
        int expected = 3;
        var result = solution.colorTheGrid(m, n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int m = 1;
        int n = 2;
        int expected = 6;
        var result = solution.colorTheGrid(m, n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int m = 5;
        int n = 5;
        int expected = 580986;
        var result = solution.colorTheGrid(m, n);
        assertThat(result).isEqualTo(expected);
    }

}
