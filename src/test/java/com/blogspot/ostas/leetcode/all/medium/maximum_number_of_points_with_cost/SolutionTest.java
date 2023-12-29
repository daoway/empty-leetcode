package com.blogspot.ostas.leetcode.all.medium.maximum_number_of_points_with_cost;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: points = [[1,2,3],[1,5,1],[3,1,1]]
    Output: 9
    Explanation:
    The blue cells denote the optimal cells to pick, which have coordinates (0, 2), (1, 1), and (2, 0).
    You add 3 + 5 + 3 = 11 to your score.
    However, you must subtract abs(2 - 1) + abs(1 - 0) = 2 from your score.
    Your final score is 11 - 2 = 9.
    Example 2:
    Input: points = [[1,5],[2,3],[4,2]]
    Output: 11
    Explanation:
    The blue cells denote the optimal cells to pick, which have coordinates (0, 1), (1, 1), and (2, 0).
    You add 5 + 3 + 4 = 12 to your score.
    However, you must subtract abs(1 - 1) + abs(1 - 0) = 1 from your score.
    Your final score is 12 - 1 = 11.
      Constraints:
    m == points.length
    n == points[r].length
    1 <= m, n <= 105
    1 <= m * n <= 105
    0 <= points[r][c] <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] points = new int[][]{{1, 2, 3}, {1, 5, 1}, {3, 1, 1}};
        long expected = 9;
        var result = solution.maxPoints(points);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] points = new int[][]{{1, 5}, {2, 3}, {4, 2}};
        long expected = 11;
        var result = solution.maxPoints(points);
        assertThat(result).isEqualTo(expected);
    }

}
