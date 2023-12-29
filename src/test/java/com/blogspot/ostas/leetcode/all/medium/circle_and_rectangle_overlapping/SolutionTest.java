package com.blogspot.ostas.leetcode.all.medium.circle_and_rectangle_overlapping;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: radius = 1, xCenter = 0, yCenter = 0, x1 = 1, y1 = -1, x2 = 3, y2 = 1
    Output: true
    Explanation: Circle and rectangle share the point (1,0).
    Example 2:
    Input: radius = 1, xCenter = 1, yCenter = 1, x1 = 1, y1 = -3, x2 = 2, y2 = -1
    Output: false
    Example 3:
    Input: radius = 1, xCenter = 0, yCenter = 0, x1 = -1, y1 = 0, x2 = 0, y2 = 1
    Output: true
      Constraints:
    1 <= radius <= 2000
    -104 <= xCenter, yCenter <= 104
    -104 <= x1 < x2 <= 104
    -104 <= y1 < y2 <= 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int radius = 1;
        int xCenter = 0;
        int yCenter = 0;
        int x1 = 1;
        int y1 = -1;
        int x2 = 3;
        int y2 = 1;
        boolean expected = true;
        var result = solution.checkOverlap(radius, xCenter, yCenter, x1, y1, x2, y2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int radius = 1;
        int xCenter = 1;
        int yCenter = 1;
        int x1 = 1;
        int y1 = -3;
        int x2 = 2;
        int y2 = -1;
        boolean expected = false;
        var result = solution.checkOverlap(radius, xCenter, yCenter, x1, y1, x2, y2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int radius = 1;
        int xCenter = 0;
        int yCenter = 0;
        int x1 = -1;
        int y1 = 0;
        int x2 = 0;
        int y2 = 1;
        boolean expected = true;
        var result = solution.checkOverlap(radius, xCenter, yCenter, x1, y1, x2, y2);
        assertThat(result).isEqualTo(expected);
    }

}
