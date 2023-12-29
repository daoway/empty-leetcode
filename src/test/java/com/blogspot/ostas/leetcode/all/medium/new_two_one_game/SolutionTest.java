package com.blogspot.ostas.leetcode.all.medium.new_two_one_game;

import org.junit.jupiter.api.Test;

import static com.blogspot.ostas.leetcode.all.common.Utils.round;
import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 10, k = 1, maxPts = 10
    Output: 1.00000
    Explanation: Alice gets a single card, then stops.
    Example 2:
    Input: n = 6, k = 1, maxPts = 10
    Output: 0.60000
    Explanation: Alice gets a single card, then stops.
    In 6 out of 10 possibilities, she is at or below 6 points.
    Example 3:
    Input: n = 21, k = 17, maxPts = 10
    Output: 0.73278
      Constraints:
    0 <= k <= n <= 104
    1 <= maxPts <= 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 10;
        int k = 1;
        int maxPts = 10;
        double expected = 1.00000;
        var result = solution.new21Game(n, k, maxPts);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 6;
        int k = 1;
        int maxPts = 10;
        double expected = 0.60000;
        var result = solution.new21Game(n, k, maxPts);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int n = 21;
        int k = 17;
        int maxPts = 10;
        double expected = 0.73278;
        var result = solution.new21Game(n, k, maxPts);
        assertThat(round(result)).isEqualTo(expected);
    }

}
