package com.blogspot.ostas.leetcode.all.easy.minimum_cuts_to_divide_a_circle;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 4
    Output: 2
    Explanation:
    The above figure shows how cutting the circle twice through the middle divides it into 4 equal slices.
    Example 2:
    Input: n = 3
    Output: 3
    Explanation:
    At least 3 cuts are needed to divide the circle into 3 equal slices.
    It can be shown that less than 3 cuts cannot result in 3 slices of equal size and shape.
    Also note that the first cut will not divide the circle into distinct parts.
      Constraints:
    1 <= n <= 100
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 4;
        int expected = 2;
        var result = solution.numberOfCuts(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 3;
        int expected = 3;
        var result = solution.numberOfCuts(n);
        assertThat(result).isEqualTo(expected);
    }

}
