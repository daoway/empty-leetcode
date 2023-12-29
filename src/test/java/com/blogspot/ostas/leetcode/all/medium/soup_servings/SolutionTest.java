package com.blogspot.ostas.leetcode.all.medium.soup_servings;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 50
    Output: 0.62500
    Explanation: If we choose the first two operations, A will become empty first.
    For the third operation, A and B will become empty at the same time.
    For the fourth operation, B will become empty first.
    So the total probability of A becoming empty first plus half the probability that A and B become empty at the same time, is 0.25 * (1 + 1 + 0.5 + 0) = 0.625.
    Example 2:
    Input: n = 100
    Output: 0.71875
      Constraints:
    0 <= n <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 50;
        double expected = 0.62500;
        var result = solution.soupServings(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 100;
        double expected = 0.71875;
        var result = solution.soupServings(n);
        assertThat(result).isEqualTo(expected);
    }

}
