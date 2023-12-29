package com.blogspot.ostas.leetcode.all.hard.subarray_with_elements_greater_than_varying_threshold;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,3,4,3,1], threshold = 6
    Output: 3
    Explanation: The subarray [3,4,3] has a size of 3, and every element is greater than 6 / 3 = 2.
    Note that this is the only valid subarray.
    Example 2:
    Input: nums = [6,5,6,5,8], threshold = 7
    Output: 1
    Explanation: The subarray [8] has a size of 1, and 8 > 7 / 1 = 7. So 1 is returned.
    Note that the subarray [6,5] has a size of 2, and every element is greater than 7 / 2 = 3.5.
    Similarly, the subarrays [6,5,6], [6,5,6,5], [6,5,6,5,8] also satisfy the given conditions.
    Therefore, 2, 3, 4, or 5 may also be returned.
      Constraints:
    1 <= nums.length <= 105
    1 <= nums[i], threshold <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 3, 4, 3, 1};
        int threshold = 6;
        int expected = 3;
        var result = solution.validSubarraySize(nums, threshold);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{6, 5, 6, 5, 8};
        int threshold = 7;
        int expected = 1;
        var result = solution.validSubarraySize(nums, threshold);
        assertThat(result).isEqualTo(expected);
    }

}
