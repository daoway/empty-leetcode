package com.blogspot.ostas.leetcode.all.medium.minimum_moves_to_reach_target_score;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: target = 5, maxDoubles = 0
    Output: 4
    Explanation: Keep incrementing by 1 until you reach target.
    Example 2:
    Input: target = 19, maxDoubles = 2
    Output: 7
    Explanation: Initially, x = 1
    Increment 3 times so x = 4
    Double once so x = 8
    Increment once so x = 9
    Double again so x = 18
    Increment once so x = 19
    Example 3:
    Input: target = 10, maxDoubles = 4
    Output: 4
    Explanation: Initially, x = 1
    Increment once so x = 2
    Double once so x = 4
    Increment once so x = 5
    Double again so x = 10
      Constraints:
    1 <= target <= 109
    0 <= maxDoubles <= 100
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int target = 5;
        int maxDoubles = 0;
        int expected = 4;
        var result = solution.minMoves(target, maxDoubles);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int target = 19;
        int maxDoubles = 2;
        int expected = 7;
        var result = solution.minMoves(target, maxDoubles);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int target = 10;
        int maxDoubles = 4;
        int expected = 4;
        var result = solution.minMoves(target, maxDoubles);
        assertThat(result).isEqualTo(expected);
    }

}
