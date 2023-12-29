package com.blogspot.ostas.leetcode.all.medium.number_of_ways_to_reach_a_position_after_exactly_k_steps;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: startPos = 1, endPos = 2, k = 3
    Output: 3
    Explanation: We can reach position 2 from 1 in exactly 3 steps in three ways:
    - 1 -> 2 -> 3 -> 2.
    - 1 -> 2 -> 1 -> 2.
    - 1 -> 0 -> 1 -> 2.
    It can be proven that no other way is possible, so we return 3.
    Example 2:
    Input: startPos = 2, endPos = 5, k = 10
    Output: 0
    Explanation: It is impossible to reach position 5 from position 2 in exactly 10 steps.
      Constraints:
    1 <= startPos, endPos, k <= 1000
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int startPos = 1;
        int endPos = 2;
        int k = 3;
        int expected = 3;
        var result = solution.numberOfWays(startPos, endPos, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int startPos = 2;
        int endPos = 5;
        int k = 10;
        int expected = 0;
        var result = solution.numberOfWays(startPos, endPos, k);
        assertThat(result).isEqualTo(expected);
    }

}
