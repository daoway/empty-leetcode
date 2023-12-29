package com.blogspot.ostas.leetcode.all.medium.steps_to_make_array_non_decreasing;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [5,3,4,4,7,3,6,11,8,5,11]
    Output: 3
    Explanation: The following are the steps performed:
    - Step 1: [5,3,4,4,7,3,6,11,8,5,11] becomes [5,4,4,7,6,11,11]
    - Step 2: [5,4,4,7,6,11,11] becomes [5,4,7,11,11]
    - Step 3: [5,4,7,11,11] becomes [5,7,11,11]
    [5,7,11,11] is a non-decreasing array. Therefore, we return 3.
    Example 2:
    Input: nums = [4,5,7,7,13]
    Output: 0
    Explanation: nums is already a non-decreasing array. Therefore, we return 0.
      Constraints:
    1 <= nums.length <= 105
    1 <= nums[i] <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{5, 3, 4, 4, 7, 3, 6, 11, 8, 5, 11};
        int expected = 3;
        var result = solution.totalSteps(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{4, 5, 7, 7, 13};
        int expected = 0;
        var result = solution.totalSteps(nums);
        assertThat(result).isEqualTo(expected);
    }

}
