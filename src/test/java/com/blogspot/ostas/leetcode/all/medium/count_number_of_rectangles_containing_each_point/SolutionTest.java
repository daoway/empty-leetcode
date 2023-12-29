package com.blogspot.ostas.leetcode.all.medium.count_number_of_rectangles_containing_each_point;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: rectangles = [[1,2],[2,3],[2,5]], points = [[2,1],[1,4]]
    Output: [2,1]
    Explanation:
    The first rectangle contains no points.
    The second rectangle contains only the point (2, 1).
    The third rectangle contains the points (2, 1) and (1, 4).
    The number of rectangles that contain the point (2, 1) is 2.
    The number of rectangles that contain the point (1, 4) is 1.
    Therefore, we return [2, 1].
    Example 2:
    Input: rectangles = [[1,1],[2,2],[3,3]], points = [[1,3],[1,1]]
    Output: [1,3]
    Explanation:
    The first rectangle contains only the point (1, 1).
    The second rectangle contains only the point (1, 1).
    The third rectangle contains the points (1, 3) and (1, 1).
    The number of rectangles that contain the point (1, 3) is 1.
    The number of rectangles that contain the point (1, 1) is 3.
    Therefore, we return [1, 3].
      Constraints:
    1 <= rectangles.length, points.length <= 5 * 104
    rectangles[i].length == points[j].length == 2
    1 <= li, xj <= 109
    1 <= hi, yj <= 100
    All the rectangles are unique.
    All the points are unique.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] rectangles = new int[][]{{1, 2}, {2, 3}, {2, 5}};
        int[][] points = new int[][]{{2, 1}, {1, 4}};
        int[] expected = new int[]{2, 1};
        var result = solution.countRectangles(rectangles, points);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] rectangles = new int[][]{{1, 1}, {2, 2}, {3, 3}};
        int[][] points = new int[][]{{1, 3}, {1, 1}};
        int[] expected = new int[]{1, 3};
        var result = solution.countRectangles(rectangles, points);
        assertThat(result).isEqualTo(expected);
    }

}
