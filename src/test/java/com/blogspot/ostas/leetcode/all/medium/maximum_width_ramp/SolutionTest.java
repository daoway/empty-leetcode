package com.blogspot.ostas.leetcode.all.medium.maximum_width_ramp;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [6,0,8,2,1,5]
    Output: 4
    Explanation: The maximum width ramp is achieved at (i, j) = (1, 5): nums[1] = 0 and nums[5] = 5.
    Example 2:
    Input: nums = [9,8,1,0,1,9,4,0,4,1]
    Output: 7
    Explanation: The maximum width ramp is achieved at (i, j) = (2, 9): nums[2] = 1 and nums[9] = 1.
      Constraints:
    2 <= nums.length <= 5 * 104
    0 <= nums[i] <= 5 * 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{6, 0, 8, 2, 1, 5};
        int expected = 4;
        var result = solution.maxWidthRamp(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{9, 8, 1, 0, 1, 9, 4, 0, 4, 1};
        int expected = 7;
        var result = solution.maxWidthRamp(nums);
        assertThat(result).isEqualTo(expected);
    }

}
