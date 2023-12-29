package com.blogspot.ostas.leetcode.all.medium.matchsticks_to_square;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: matchsticks = [1,1,2,2,2]
    Output: true
    Explanation: You can form a square with length 2, one side of the square came two sticks with length 1.
    Example 2:
    Input: matchsticks = [3,3,3,3,4]
    Output: false
    Explanation: You cannot find a way to form a square with all the matchsticks.
      Constraints:
    1 <= matchsticks.length <= 15
    1 <= matchsticks[i] <= 108
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] matchsticks = new int[]{1, 1, 2, 2, 2};
        boolean expected = true;
        var result = solution.makesquare(matchsticks);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] matchsticks = new int[]{3, 3, 3, 3, 4};
        boolean expected = false;
        var result = solution.makesquare(matchsticks);
        assertThat(result).isEqualTo(expected);
    }

}
