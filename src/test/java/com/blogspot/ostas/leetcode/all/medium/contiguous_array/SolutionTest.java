package com.blogspot.ostas.leetcode.all.medium.contiguous_array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [0,1]
    Output: 2
    Explanation: [0, 1] is the longest contiguous subarray with an equal number of 0 and 1.
    Example 2:
    Input: nums = [0,1,0]
    Output: 2
    Explanation: [0, 1] (or [1, 0]) is a longest contiguous subarray with equal number of 0 and 1.
      Constraints:
    1 <= nums.length <= 105
    nums[i] is either 0 or 1.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{0, 1};
        int expected = 2;
        var result = solution.findMaxLength(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{0, 1, 0};
        int expected = 2;
        var result = solution.findMaxLength(nums);
        assertThat(result).isEqualTo(expected);
    }

}
