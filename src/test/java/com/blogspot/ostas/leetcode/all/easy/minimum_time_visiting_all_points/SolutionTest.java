package com.blogspot.ostas.leetcode.all.easy.minimum_time_visiting_all_points;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: points = [[1,1],[3,4],[-1,0]]
    Output: 7
    Explanation: One optimal path is [1,1] -> [2,2] -> [3,3] -> [3,4] -> [2,3] -> [1,2] -> [0,1] -> [-1,0]
    Time from [1,1] to [3,4] = 3 seconds
    Time from [3,4] to [-1,0] = 4 seconds
    Total time = 7 seconds
    Example 2:
    Input: points = [[3,2],[-2,2]]
    Output: 5
      Constraints:
    points.length == n
    1 <= n <= 100
    points[i].length == 2
    -1000 <= points[i][0], points[i][1] <= 1000
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] points = new int[][]{{1, 1}, {3, 4}, {-1, 0}};
        int expected = 7;
        var result = solution.minTimeToVisitAllPoints(points);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] points = new int[][]{{3, 2}, {-2, 2}};
        int expected = 5;
        var result = solution.minTimeToVisitAllPoints(points);
        assertThat(result).isEqualTo(expected);
    }

}
