package com.blogspot.ostas.leetcode.all.medium.rectangle_area;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: ax1 = -3, ay1 = 0, ax2 = 3, ay2 = 4, bx1 = 0, by1 = -1, bx2 = 9, by2 = 2
    Output: 45
    Example 2:
    Input: ax1 = -2, ay1 = -2, ax2 = 2, ay2 = 2, bx1 = -2, by1 = -2, bx2 = 2, by2 = 2
    Output: 16
      Constraints:
    -104 <= ax1 <= ax2 <= 104
    -104 <= ay1 <= ay2 <= 104
    -104 <= bx1 <= bx2 <= 104
    -104 <= by1 <= by2 <= 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int ax1 = -3;
        int ay1 = 0;
        int ax2 = 3;
        int ay2 = 4;
        int bx1 = 0;
        int by1 = -1;
        int bx2 = 9;
        int by2 = 2;
        int expected = 45;
        var result = solution.computeArea(ax1, ay1, ax2, ay2, bx1, by1, bx2, by2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int ax1 = -2;
        int ay1 = -2;
        int ax2 = 2;
        int ay2 = 2;
        int bx1 = -2;
        int by1 = -2;
        int bx2 = 2;
        int by2 = 2;
        int expected = 16;
        var result = solution.computeArea(ax1, ay1, ax2, ay2, bx1, by1, bx2, by2);
        assertThat(result).isEqualTo(expected);
    }

}
