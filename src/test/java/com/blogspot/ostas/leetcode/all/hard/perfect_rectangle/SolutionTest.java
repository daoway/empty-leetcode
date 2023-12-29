package com.blogspot.ostas.leetcode.all.hard.perfect_rectangle;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: rectangles = [[1,1,3,3],[3,1,4,2],[3,2,4,4],[1,3,2,4],[2,3,3,4]]
    Output: true
    Explanation: All 5 rectangles together form an exact cover of a rectangular region.
    Example 2:
    Input: rectangles = [[1,1,2,3],[1,3,2,4],[3,1,4,2],[3,2,4,4]]
    Output: false
    Explanation: Because there is a gap between the two rectangular regions.
    Example 3:
    Input: rectangles = [[1,1,3,3],[3,1,4,2],[1,3,2,4],[2,2,4,4]]
    Output: false
    Explanation: Because two of the rectangles overlap with each other.
      Constraints:
    1 <= rectangles.length <= 2 * 104
    rectangles[i].length == 4
    -105 <= xi, yi, ai, bi <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] rectangles = new int[][]{{1, 1, 3, 3}, {3, 1, 4, 2}, {3, 2, 4, 4}, {1, 3, 2, 4},
                {2, 3, 3, 4}};
        boolean expected = true;
        var result = solution.isRectangleCover(rectangles);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] rectangles = new int[][]{{1, 1, 2, 3}, {1, 3, 2, 4}, {3, 1, 4, 2}, {3, 2, 4, 4}};
        boolean expected = false;
        var result = solution.isRectangleCover(rectangles);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[][] rectangles = new int[][]{{1, 1, 3, 3}, {3, 1, 4, 2}, {1, 3, 2, 4}, {2, 2, 4, 4}};
        boolean expected = false;
        var result = solution.isRectangleCover(rectangles);
        assertThat(result).isEqualTo(expected);
    }

}
