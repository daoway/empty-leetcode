package com.blogspot.ostas.leetcode.all.medium.min_cost_to_connect_all_points;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: points = [[0,0],[2,2],[3,10],[5,2],[7,0]]
    Output: 20
    Explanation:
    We can connect the points as shown above to get the minimum cost of 20.
    Notice that there is a unique path between every pair of points.
    Example 2:
    Input: points = [[3,12],[-2,5],[-4,1]]
    Output: 18
      Constraints:
    1 <= points.length <= 1000
    -106 <= xi, yi <= 106
    All pairs (xi, yi) are distinct.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] points = new int[][]{{0, 0}, {2, 2}, {3, 10}, {5, 2}, {7, 0}};
        int expected = 20;
        var result = solution.minCostConnectPoints(points);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] points = new int[][]{{3, 12}, {-2, 5}, {-4, 1}};
        int expected = 18;
        var result = solution.minCostConnectPoints(points);
        assertThat(result).isEqualTo(expected);
    }

}
