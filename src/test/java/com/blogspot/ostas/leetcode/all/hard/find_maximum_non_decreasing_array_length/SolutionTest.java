package com.blogspot.ostas.leetcode.all.hard.find_maximum_non_decreasing_array_length;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [5,2,2]
    Output: 1
    Explanation: This array with length 3 is not non-decreasing.
    We have two ways to make the array length two.
    First, choosing subarray [2,2] converts the array to [5,4].
    Second, choosing subarray [5,2] converts the array to [7,2].
    In these two ways the array is not non-decreasing.
    And if we choose subarray [5,2,2] and replace it with [9] it becomes non-decreasing.
    So the answer is 1.
    Example 2:
    Input: nums = [1,2,3,4]
    Output: 4
    Explanation: The array is non-decreasing. So the answer is 4.
    Example 3:
    Input: nums = [4,3,2,6]
    Output: 3
    Explanation: Replacing [3,2] with [5] converts the given array to [4,5,6] that is non-decreasing.
    Because the given array is not non-decreasing, the maximum possible answer is 3.
      Constraints:
    1 <= nums.length <= 105
    1 <= nums[i] <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{5, 2, 2};
        int expected = 1;
        var result = solution.findMaximumLength(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 3, 4};
        int expected = 4;
        var result = solution.findMaximumLength(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{4, 3, 2, 6};
        int expected = 3;
        var result = solution.findMaximumLength(nums);
        assertThat(result).isEqualTo(expected);
    }

}
