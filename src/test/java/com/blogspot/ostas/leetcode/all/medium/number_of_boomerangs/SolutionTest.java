package com.blogspot.ostas.leetcode.all.medium.number_of_boomerangs;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: points = [[0,0],[1,0],[2,0]]
    Output: 2
    Explanation: The two boomerangs are [[1,0],[0,0],[2,0]] and [[1,0],[2,0],[0,0]].
    Example 2:
    Input: points = [[1,1],[2,2],[3,3]]
    Output: 2
    Example 3:
    Input: points = [[1,1]]
    Output: 0
      Constraints:
    n == points.length
    1 <= n <= 500
    points[i].length == 2
    -104 <= xi, yi <= 104
    All the points are unique.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] points = new int[][]{{0, 0}, {1, 0}, {2, 0}};
        int expected = 2;
        var result = solution.numberOfBoomerangs(points);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] points = new int[][]{{1, 1}, {2, 2}, {3, 3}};
        int expected = 2;
        var result = solution.numberOfBoomerangs(points);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[][] points = new int[][]{{1, 1}};
        int expected = 0;
        var result = solution.numberOfBoomerangs(points);
        assertThat(result).isEqualTo(expected);
    }

}
