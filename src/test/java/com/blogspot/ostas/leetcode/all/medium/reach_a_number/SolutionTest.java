package com.blogspot.ostas.leetcode.all.medium.reach_a_number;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: target = 2
    Output: 3
    Explanation:
    On the 1st move, we step from 0 to 1 (1 step).
    On the 2nd move, we step from 1 to -1 (2 steps).
    On the 3rd move, we step from -1 to 2 (3 steps).
    Example 2:
    Input: target = 3
    Output: 2
    Explanation:
    On the 1st move, we step from 0 to 1 (1 step).
    On the 2nd move, we step from 1 to 3 (2 steps).
      Constraints:
    -109 <= target <= 109
    target != 0
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int target = 2;
        int expected = 3;
        var result = solution.reachNumber(target);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int target = 3;
        int expected = 2;
        var result = solution.reachNumber(target);
        assertThat(result).isEqualTo(expected);
    }

}
