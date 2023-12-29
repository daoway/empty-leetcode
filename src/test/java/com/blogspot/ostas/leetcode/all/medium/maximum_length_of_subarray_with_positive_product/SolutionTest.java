package com.blogspot.ostas.leetcode.all.medium.maximum_length_of_subarray_with_positive_product;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,-2,-3,4]
    Output: 4
    Explanation: The array nums already has a positive product of 24.
    Example 2:
    Input: nums = [0,1,-2,-3,-4]
    Output: 3
    Explanation: The longest subarray with positive product is [1,-2,-3] which has a product of 6.
    Notice that we cannot include 0 in the subarray since that'll make the product 0 which is not positive.
    Example 3:
    Input: nums = [-1,-2,-3,0,1]
    Output: 2
    Explanation: The longest subarray with positive product is [-1,-2] or [-2,-3].
      Constraints:
    1 <= nums.length <= 105
    -109 <= nums[i] <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, -2, -3, 4};
        int expected = 4;
        var result = solution.getMaxLen(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{0, 1, -2, -3, -4};
        int expected = 3;
        var result = solution.getMaxLen(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{-1, -2, -3, 0, 1};
        int expected = 2;
        var result = solution.getMaxLen(nums);
        assertThat(result).isEqualTo(expected);
    }

}
