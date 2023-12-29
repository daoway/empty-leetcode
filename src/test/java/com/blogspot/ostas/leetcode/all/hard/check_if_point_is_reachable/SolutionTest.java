package com.blogspot.ostas.leetcode.all.hard.check_if_point_is_reachable;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: targetX = 6, targetY = 9
    Output: false
    Explanation: It is impossible to reach (6,9) from (1,1) using any sequence of moves, so false is returned.
    Example 2:
    Input: targetX = 4, targetY = 7
    Output: true
    Explanation: You can follow the path (1,1) -> (1,2) -> (1,4) -> (1,8) -> (1,7) -> (2,7) -> (4,7).
      Constraints:
    1 <= targetX, targetY <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int targetX = 6;
        int targetY = 9;
        boolean expected = false;
        var result = solution.isReachable(targetX, targetY);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int targetX = 4;
        int targetY = 7;
        boolean expected = true;
        var result = solution.isReachable(targetX, targetY);
        assertThat(result).isEqualTo(expected);
    }

}
