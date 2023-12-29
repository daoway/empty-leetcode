package com.blogspot.ostas.leetcode.all.easy.find_nearest_point_that_has_the_same_x_or_y_coordinate;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: x = 3, y = 4, points = [[1,2],[3,1],[2,4],[2,3],[4,4]]
    Output: 2
    Explanation: Of all the points, only [3,1], [2,4] and [4,4] are valid. Of the valid points, [2,4] and [4,4] have the smallest Manhattan distance from your current location, with a distance of 1. [2,4] has the smallest index, so return 2.
    Example 2:
    Input: x = 3, y = 4, points = [[3,4]]
    Output: 0
    Explanation: The answer is allowed to be on the same location as your current location.
    Example 3:
    Input: x = 3, y = 4, points = [[2,3]]
    Output: -1
    Explanation: There are no valid points.
      Constraints:
    1 <= points.length <= 104
    points[i].length == 2
    1 <= x, y, ai, bi <= 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int x = 3;
        int y = 4;
        int[][] points = new int[][]{{1, 2}, {3, 1}, {2, 4}, {2, 3}, {4, 4}};
        int expected = 2;
        var result = solution.nearestValidPoint(x, y, points);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int x = 3;
        int y = 4;
        int[][] points = new int[][]{{3, 4}};
        int expected = 0;
        var result = solution.nearestValidPoint(x, y, points);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int x = 3;
        int y = 4;
        int[][] points = new int[][]{{2, 3}};
        int expected = -1;
        var result = solution.nearestValidPoint(x, y, points);
        assertThat(result).isEqualTo(expected);
    }

}
