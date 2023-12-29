package com.blogspot.ostas.leetcode.all.hard.max_value_of_equation;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: points = [[1,3],[2,0],[5,10],[6,-10]], k = 1
    Output: 4
    Explanation: The first two points satisfy the condition |xi - xj| <= 1 and if we calculate the equation we get 3 + 0 + |1 - 2| = 4. Third and fourth points also satisfy the condition and give a value of 10 + -10 + |5 - 6| = 1.
    No other pairs satisfy the condition, so we return the max of 4 and 1.
    Example 2:
    Input: points = [[0,0],[3,0],[9,2]], k = 3
    Output: 3
    Explanation: Only the first two points have an absolute difference of 3 or less in the x-values, and give the value of 0 + 0 + |0 - 3| = 3.
      Constraints:
    2 <= points.length <= 105
    points[i].length == 2
    -108 <= xi, yi <= 108
    0 <= k <= 2 * 108
    xi < xj for all 1 <= i < j <= points.length
    xi form a strictly increasing sequence.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] points = new int[][]{{1, 3}, {2, 0}, {5, 10}, {6, -10}};
        int k = 1;
        int expected = 4;
        var result = solution.findMaxValueOfEquation(points, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] points = new int[][]{{0, 0}, {3, 0}, {9, 2}};
        int k = 3;
        int expected = 3;
        var result = solution.findMaxValueOfEquation(points, k);
        assertThat(result).isEqualTo(expected);
    }

}
