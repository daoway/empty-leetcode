package com.blogspot.ostas.leetcode.all.medium.number_of_dice_rolls_with_target_sum;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 1, k = 6, target = 3
    Output: 1
    Explanation: You throw one die with 6 faces.
    There is only one way to get a sum of 3.
    Example 2:
    Input: n = 2, k = 6, target = 7
    Output: 6
    Explanation: You throw two dice, each with 6 faces.
    There are 6 ways to get a sum of 7: 1+6, 2+5, 3+4, 4+3, 5+2, 6+1.
    Example 3:
    Input: n = 30, k = 30, target = 500
    Output: 222616187
    Explanation: The answer must be returned modulo 109 + 7.
      Constraints:
    1 <= n, k <= 30
    1 <= target <= 1000
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 1;
        int k = 6;
        int target = 3;
        int expected = 1;
        var result = solution.numRollsToTarget(n, k, target);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 2;
        int k = 6;
        int target = 7;
        int expected = 6;
        var result = solution.numRollsToTarget(n, k, target);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int n = 30;
        int k = 30;
        int target = 500;
        int expected = 222616187;
        var result = solution.numRollsToTarget(n, k, target);
        assertThat(result).isEqualTo(expected);
    }

}
