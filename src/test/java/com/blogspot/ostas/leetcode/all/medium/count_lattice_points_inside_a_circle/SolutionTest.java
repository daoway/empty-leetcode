package com.blogspot.ostas.leetcode.all.medium.count_lattice_points_inside_a_circle;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: circles = [[2,2,1]]
    Output: 5
    Explanation:
    The figure above shows the given circle.
    The lattice points present inside the circle are (1, 2), (2, 1), (2, 2), (2, 3), and (3, 2) and are shown in green.
    Other points such as (1, 1) and (1, 3), which are shown in red, are not considered inside the circle.
    Hence, the number of lattice points present inside at least one circle is 5.
    Example 2:
    Input: circles = [[2,2,2],[3,4,1]]
    Output: 16
    Explanation:
    The figure above shows the given circles.
    There are exactly 16 lattice points which are present inside at least one circle.
    Some of them are (0, 2), (2, 0), (2, 4), (3, 2), and (4, 4).
      Constraints:
    1 <= circles.length <= 200
    circles[i].length == 3
    1 <= xi, yi <= 100
    1 <= ri <= min(xi, yi)
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] circles = new int[][]{{2, 2, 1}};
        int expected = 5;
        var result = solution.countLatticePoints(circles);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] circles = new int[][]{{2, 2, 2}, {3, 4, 1}};
        int expected = 16;
        var result = solution.countLatticePoints(circles);
        assertThat(result).isEqualTo(expected);
    }

}
