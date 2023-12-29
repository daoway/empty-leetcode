package com.blogspot.ostas.leetcode.all.medium.continuous_subarray_sum;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [23,2,4,6,7], k = 6
    Output: true
    Explanation: [2, 4] is a continuous subarray of size 2 whose elements sum up to 6.
    Example 2:
    Input: nums = [23,2,6,4,7], k = 6
    Output: true
    Explanation: [23, 2, 6, 4, 7] is an continuous subarray of size 5 whose elements sum up to 42.
    42 is a multiple of 6 because 42 = 7 * 6 and 7 is an integer.
    Example 3:
    Input: nums = [23,2,6,4,7], k = 13
    Output: false
      Constraints:
    1 <= nums.length <= 105
    0 <= nums[i] <= 109
    0 <= sum(nums[i]) <= 231 - 1
    1 <= k <= 231 - 1
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{23, 2, 4, 6, 7};
        int k = 6;
        boolean expected = true;
        var result = solution.checkSubarraySum(nums, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{23, 2, 6, 4, 7};
        int k = 6;
        boolean expected = true;
        var result = solution.checkSubarraySum(nums, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{23, 2, 6, 4, 7};
        int k = 13;
        boolean expected = false;
        var result = solution.checkSubarraySum(nums, k);
        assertThat(result).isEqualTo(expected);
    }

}
