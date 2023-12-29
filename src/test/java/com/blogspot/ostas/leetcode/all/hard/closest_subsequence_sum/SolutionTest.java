package com.blogspot.ostas.leetcode.all.hard.closest_subsequence_sum;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [5,-7,3,5], goal = 6
    Output: 0
    Explanation: Choose the whole array as a subsequence, with a sum of 6.
    This is equal to the goal, so the absolute difference is 0.
    Example 2:
    Input: nums = [7,-9,15,-2], goal = -5
    Output: 1
    Explanation: Choose the subsequence [7,-9,-2], with a sum of -4.
    The absolute difference is abs(-4 - (-5)) = abs(1) = 1, which is the minimum.
    Example 3:
    Input: nums = [1,2,3], goal = -7
    Output: 7
      Constraints:
    1 <= nums.length <= 40
    -107 <= nums[i] <= 107
    -109 <= goal <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{5, -7, 3, 5};
        int goal = 6;
        int expected = 0;
        var result = solution.minAbsDifference(nums, goal);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{7, -9, 15, -2};
        int goal = -5;
        int expected = 1;
        var result = solution.minAbsDifference(nums, goal);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 3};
        int goal = -7;
        int expected = 7;
        var result = solution.minAbsDifference(nums, goal);
        assertThat(result).isEqualTo(expected);
    }

}
