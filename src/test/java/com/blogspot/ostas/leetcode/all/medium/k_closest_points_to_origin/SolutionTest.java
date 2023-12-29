package com.blogspot.ostas.leetcode.all.medium.k_closest_points_to_origin;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: points = [[1,3],[-2,2]], k = 1
    Output: [[-2,2]]
    Explanation:
    The distance between (1, 3) and the origin is sqrt(10).
    The distance between (-2, 2) and the origin is sqrt(8).
    Since sqrt(8) < sqrt(10), (-2, 2) is closer to the origin.
    We only want the closest k = 1 points from the origin, so the answer is just [[-2,2]].
    Example 2:
    Input: points = [[3,3],[5,-1],[-2,4]], k = 2
    Output: [[3,3],[-2,4]]
    Explanation: The answer [[-2,4],[3,3]] would also be accepted.
      Constraints:
    1 <= k <= points.length <= 104
    -104 <= xi, yi <= 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] points = new int[][]{{1, 3}, {-2, 2}};
        int k = 1;
        int[][] expected = new int[][]{{-2, 2}};
        var result = solution.kClosest(points, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] points = new int[][]{{3, 3}, {5, -1}, {-2, 4}};
        int k = 2;
        int[][] expected = new int[][]{{3, 3}, {-2, 4}};
        var result = solution.kClosest(points, k);
        assertThat(result).isEqualTo(expected);
    }

}
