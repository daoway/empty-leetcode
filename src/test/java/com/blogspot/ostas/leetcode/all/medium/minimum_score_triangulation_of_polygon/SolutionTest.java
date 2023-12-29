package com.blogspot.ostas.leetcode.all.medium.minimum_score_triangulation_of_polygon;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: values = [1,2,3]
    Output: 6
    Explanation: The polygon is already triangulated, and the score of the only triangle is 6.
    Example 2:
    Input: values = [3,7,4,5]
    Output: 144
    Explanation: There are two triangulations, with possible scores: 3*7*5 + 4*5*7 = 245, or 3*4*5 + 3*4*7 = 144.
    The minimum score is 144.
    Example 3:
    Input: values = [1,3,1,4,1,5]
    Output: 13
    Explanation: The minimum score triangulation has score 1*1*3 + 1*1*4 + 1*1*5 + 1*1*1 = 13.
      Constraints:
    n == values.length
    3 <= n <= 50
    1 <= values[i] <= 100
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] values = new int[]{1, 2, 3};
        int expected = 6;
        var result = solution.minScoreTriangulation(values);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] values = new int[]{3, 7, 4, 5};
        int expected = 144;
        var result = solution.minScoreTriangulation(values);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] values = new int[]{1, 3, 1, 4, 1, 5};
        int expected = 13;
        var result = solution.minScoreTriangulation(values);
        assertThat(result).isEqualTo(expected);
    }

}
