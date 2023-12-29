package com.blogspot.ostas.leetcode.all.hard.number_of_ways_to_stay_in_the_same_place_after_some_steps;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: steps = 3, arrLen = 2
    Output: 4
    Explanation: There are 4 differents ways to stay at index 0 after 3 steps.
    Right, Left, Stay
    Stay, Right, Left
    Right, Stay, Left
    Stay, Stay, Stay
    Example 2:
    Input: steps = 2, arrLen = 4
    Output: 2
    Explanation: There are 2 differents ways to stay at index 0 after 2 steps
    Right, Left
    Stay, Stay
    Example 3:
    Input: steps = 4, arrLen = 2
    Output: 8
      Constraints:
    1 <= steps <= 500
    1 <= arrLen <= 106
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int steps = 3;
        int arrLen = 2;
        int expected = 4;
        var result = solution.numWays(steps, arrLen);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int steps = 2;
        int arrLen = 4;
        int expected = 2;
        var result = solution.numWays(steps, arrLen);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int steps = 4;
        int arrLen = 2;
        int expected = 8;
        var result = solution.numWays(steps, arrLen);
        assertThat(result).isEqualTo(expected);
    }

}
