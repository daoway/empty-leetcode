package com.blogspot.ostas.leetcode.all.medium.maximum_sum_circular_subarray;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,-2,3,-2]
    Output: 3
    Explanation: Subarray [3] has maximum sum 3.
    Example 2:
    Input: nums = [5,-3,5]
    Output: 10
    Explanation: Subarray [5,5] has maximum sum 5 + 5 = 10.
    Example 3:
    Input: nums = [-3,-2,-3]
    Output: -2
    Explanation: Subarray [-2] has maximum sum -2.
      Constraints:
    n == nums.length
    1 <= n <= 3 * 104
    -3 * 104 <= nums[i] <= 3 * 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, -2, 3, -2};
        int expected = 3;
        var result = solution.maxSubarraySumCircular(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{5, -3, 5};
        int expected = 10;
        var result = solution.maxSubarraySumCircular(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{-3, -2, -3};
        int expected = -2;
        var result = solution.maxSubarraySumCircular(nums);
        assertThat(result).isEqualTo(expected);
    }

}
