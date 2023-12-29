package com.blogspot.ostas.leetcode.all.hard.tiling_a_rectangle_with_the_fewest_squares;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 2, m = 3
    Output: 3
    Explanation: 3 squares are necessary to cover the rectangle.
    2 (squares of 1x1)
    1 (square of 2x2)
    Example 2:
    Input: n = 5, m = 8
    Output: 5
    Example 3:
    Input: n = 11, m = 13
    Output: 6
      Constraints:
    1 <= n, m <= 13
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 2;
        int m = 3;
        int expected = 3;
        var result = solution.tilingRectangle(n, m);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 5;
        int m = 8;
        int expected = 5;
        var result = solution.tilingRectangle(n, m);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int n = 11;
        int m = 13;
        int expected = 6;
        var result = solution.tilingRectangle(n, m);
        assertThat(result).isEqualTo(expected);
    }

}
