package com.blogspot.ostas.leetcode.all.medium.maximum_erasure_value;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [4,2,4,5,6]
    Output: 17
    Explanation: The optimal subarray here is [2,4,5,6].
    Example 2:
    Input: nums = [5,2,1,2,5,2,1,2,5]
    Output: 8
    Explanation: The optimal subarray here is [5,2,1] or [1,2,5].
      Constraints:
    1 <= nums.length <= 105
    1 <= nums[i] <= 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{4, 2, 4, 5, 6};
        int expected = 17;
        var result = solution.maximumUniqueSubarray(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{5, 2, 1, 2, 5, 2, 1, 2, 5};
        int expected = 8;
        var result = solution.maximumUniqueSubarray(nums);
        assertThat(result).isEqualTo(expected);
    }

}
