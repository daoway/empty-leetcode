package com.blogspot.ostas.leetcode.all.easy.valid_boomerang;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: points = [[1,1],[2,3],[3,2]]
    Output: true
    Example 2:
    Input: points = [[1,1],[2,2],[3,3]]
    Output: false
      Constraints:
    points.length == 3
    points[i].length == 2
    0 <= xi, yi <= 100
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] points = new int[][]{{1, 1}, {2, 3}, {3, 2}};
        boolean expected = true;
        var result = solution.isBoomerang(points);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] points = new int[][]{{1, 1}, {2, 2}, {3, 3}};
        boolean expected = false;
        var result = solution.isBoomerang(points);
        assertThat(result).isEqualTo(expected);
    }

}
