package com.blogspot.ostas.leetcode.all.medium.subarray_sum_equals_k;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,1,1], k = 2
    Output: 2
    Example 2:
    Input: nums = [1,2,3], k = 3
    Output: 2
      Constraints:
    1 <= nums.length <= 2 * 104
    -1000 <= nums[i] <= 1000
    -107 <= k <= 107
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 1, 1};
        int k = 2;
        int expected = 2;
        var result = solution.subarraySum(nums, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 3};
        int k = 3;
        int expected = 2;
        var result = solution.subarraySum(nums, k);
        assertThat(result).isEqualTo(expected);
    }

}
