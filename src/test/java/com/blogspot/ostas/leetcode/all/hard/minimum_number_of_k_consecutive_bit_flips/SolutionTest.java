package com.blogspot.ostas.leetcode.all.hard.minimum_number_of_k_consecutive_bit_flips;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [0,1,0], k = 1
    Output: 2
    Explanation: Flip nums[0], then flip nums[2].
    Example 2:
    Input: nums = [1,1,0], k = 2
    Output: -1
    Explanation: No matter how we flip subarrays of size 2, we cannot make the array become [1,1,1].
    Example 3:
    Input: nums = [0,0,0,1,0,1,1,0], k = 3
    Output: 3
    Explanation:
    Flip nums[0],nums[1],nums[2]: nums becomes [1,1,1,1,0,1,1,0]
    Flip nums[4],nums[5],nums[6]: nums becomes [1,1,1,1,1,0,0,0]
    Flip nums[5],nums[6],nums[7]: nums becomes [1,1,1,1,1,1,1,1]
      Constraints:
    1 <= nums.length <= 105
    1 <= k <= nums.length
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{0, 1, 0};
        int k = 1;
        int expected = 2;
        var result = solution.minKBitFlips(nums, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 1, 0};
        int k = 2;
        int expected = -1;
        var result = solution.minKBitFlips(nums, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{0, 0, 0, 1, 0, 1, 1, 0};
        int k = 3;
        int expected = 3;
        var result = solution.minKBitFlips(nums, k);
        assertThat(result).isEqualTo(expected);
    }

}
