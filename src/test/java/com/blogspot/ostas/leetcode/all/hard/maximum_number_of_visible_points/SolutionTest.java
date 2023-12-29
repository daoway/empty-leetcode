package com.blogspot.ostas.leetcode.all.hard.maximum_number_of_visible_points;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: points = [[2,1],[2,2],[3,3]], angle = 90, location = [1,1]
    Output: 3
    Explanation: The shaded region represents your field of view. All points can be made visible in your field of view, including [3,3] even though [2,2] is in front and in the same line of sight.
    Example 2:
    Input: points = [[2,1],[2,2],[3,4],[1,1]], angle = 90, location = [1,1]
    Output: 4
    Explanation: All points can be made visible in your field of view, including the one at your location.
    Example 3:
    Input: points = [[1,0],[2,1]], angle = 13, location = [1,1]
    Output: 1
    Explanation: You can only see one of the two points, as shown above.
      Constraints:
    1 <= points.length <= 105
    points[i].length == 2
    location.length == 2
    0 <= angle < 360
    0 <= posx, posy, xi, yi <= 100
    */
    @Test
    void example_0() {
        var solution = new Solution();
        List<List<Integer>> points = List.of(List.of(2, 1), List.of(2, 2), List.of(3, 3));
        int angle = 90;
        List<Integer> location = List.of(1, 1);
        int expected = 3;
        var result = solution.visiblePoints(points, angle, location);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        List<List<Integer>> points =
                List.of(List.of(2, 1), List.of(2, 2), List.of(3, 4), List.of(1, 1));
        int angle = 90;
        List<Integer> location = List.of(1, 1);
        int expected = 4;
        var result = solution.visiblePoints(points, angle, location);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        List<List<Integer>> points = List.of(List.of(1, 0), List.of(2, 1));
        int angle = 13;
        List<Integer> location = List.of(1, 1);
        int expected = 1;
        var result = solution.visiblePoints(points, angle, location);
        assertThat(result).isEqualTo(expected);
    }

}
