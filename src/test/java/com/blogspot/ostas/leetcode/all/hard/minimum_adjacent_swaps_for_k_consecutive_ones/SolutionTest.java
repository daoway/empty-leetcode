package com.blogspot.ostas.leetcode.all.hard.minimum_adjacent_swaps_for_k_consecutive_ones;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,0,0,1,0,1], k = 2
    Output: 1
    Explanation: In 1 move, nums could be [1,0,0,0,1,1] and have 2 consecutive 1's.
    Example 2:
    Input: nums = [1,0,0,0,0,0,1,1], k = 3
    Output: 5
    Explanation: In 5 moves, the leftmost 1 can be shifted right until nums = [0,0,0,0,0,1,1,1].
    Example 3:
    Input: nums = [1,1,0,1], k = 2
    Output: 0
    Explanation: nums already has 2 consecutive 1's.
      Constraints:
    1 <= nums.length <= 105
    nums[i] is 0 or 1.
    1 <= k <= sum(nums)
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 0, 0, 1, 0, 1};
        int k = 2;
        int expected = 1;
        var result = solution.minMoves(nums, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 0, 0, 0, 0, 0, 1, 1};
        int k = 3;
        int expected = 5;
        var result = solution.minMoves(nums, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{1, 1, 0, 1};
        int k = 2;
        int expected = 0;
        var result = solution.minMoves(nums, k);
        assertThat(result).isEqualTo(expected);
    }

}
