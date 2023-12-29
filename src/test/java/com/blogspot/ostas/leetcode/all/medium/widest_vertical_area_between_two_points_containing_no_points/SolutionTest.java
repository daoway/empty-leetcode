package com.blogspot.ostas.leetcode.all.medium.widest_vertical_area_between_two_points_containing_no_points;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: points = [[8,7],[9,9],[7,4],[9,7]]
    Output: 1
    Explanation: Both the red and the blue area are optimal.
    Example 2:
    Input: points = [[3,1],[9,0],[1,0],[1,4],[5,3],[8,8]]
    Output: 3
      Constraints:
    n == points.length
    2 <= n <= 105
    points[i].length == 2
    0 <= xi, yi <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] points = new int[][]{{8, 7}, {9, 9}, {7, 4}, {9, 7}};
        int expected = 1;
        var result = solution.maxWidthOfVerticalArea(points);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] points = new int[][]{{3, 1}, {9, 0}, {1, 0}, {1, 4}, {5, 3}, {8, 8}};
        int expected = 3;
        var result = solution.maxWidthOfVerticalArea(points);
        assertThat(result).isEqualTo(expected);
    }

}
