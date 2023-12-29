package com.blogspot.ostas.leetcode.all.medium.number_of_subarrays_with_bounded_maximum;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [2,1,4,3], left = 2, right = 3
    Output: 3
    Explanation: There are three subarrays that meet the requirements: [2], [2, 1], [3].
    Example 2:
    Input: nums = [2,9,2,5,6], left = 2, right = 8
    Output: 7
      Constraints:
    1 <= nums.length <= 105
    0 <= nums[i] <= 109
    0 <= left <= right <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{2, 1, 4, 3};
        int left = 2;
        int right = 3;
        int expected = 3;
        var result = solution.numSubarrayBoundedMax(nums, left, right);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{2, 9, 2, 5, 6};
        int left = 2;
        int right = 8;
        int expected = 7;
        var result = solution.numSubarrayBoundedMax(nums, left, right);
        assertThat(result).isEqualTo(expected);
    }

}
