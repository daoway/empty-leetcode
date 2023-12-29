package com.blogspot.ostas.leetcode.all.hard.rectangle_area_ii;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: rectangles = [[0,0,2,2],[1,0,2,3],[1,0,3,1]]
    Output: 6
    Explanation: A total area of 6 is covered by all three rectangles, as illustrated in the picture.
    From (1,1) to (2,2), the green and red rectangles overlap.
    From (1,0) to (2,3), all three rectangles overlap.
    Example 2:
    Input: rectangles = [[0,0,1000000000,1000000000]]
    Output: 49
    Explanation: The answer is 1018 modulo (109 + 7), which is 49.
      Constraints:
    1 <= rectangles.length <= 200
    rectanges[i].length == 4
    0 <= xi1, yi1, xi2, yi2 <= 109
    xi1 <= xi2
    yi1 <= yi2
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] rectangles = new int[][]{{0, 0, 2, 2}, {1, 0, 2, 3}, {1, 0, 3, 1}};
        int expected = 6;
        var result = solution.rectangleArea(rectangles);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] rectangles = new int[][]{{0, 0, 1000000000, 1000000000}};
        int expected = 49;
        var result = solution.rectangleArea(rectangles);
        assertThat(result).isEqualTo(expected);
    }

}
