package com.blogspot.ostas.leetcode.all.medium.subarray_product_less_than_k;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [10,5,2,6], k = 100
    Output: 8
    Explanation: The 8 subarrays that have product less than 100 are:
    [10], [5], [2], [6], [10, 5], [5, 2], [2, 6], [5, 2, 6]
    Note that [10, 5, 2] is not included as the product of 100 is not strictly less than k.
    Example 2:
    Input: nums = [1,2,3], k = 0
    Output: 0
      Constraints:
    1 <= nums.length <= 3 * 104
    1 <= nums[i] <= 1000
    0 <= k <= 106
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{10, 5, 2, 6};
        int k = 100;
        int expected = 8;
        var result = solution.numSubarrayProductLessThanK(nums, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 3};
        int k = 0;
        int expected = 0;
        var result = solution.numSubarrayProductLessThanK(nums, k);
        assertThat(result).isEqualTo(expected);
    }

}
