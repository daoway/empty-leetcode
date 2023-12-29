package com.blogspot.ostas.leetcode.all.hard.count_subarrays_with_fixed_bounds;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,3,5,2,7,5], minK = 1, maxK = 5
    Output: 2
    Explanation: The fixed-bound subarrays are [1,3,5] and [1,3,5,2].
    Example 2:
    Input: nums = [1,1,1,1], minK = 1, maxK = 1
    Output: 10
    Explanation: Every subarray of nums is a fixed-bound subarray. There are 10 possible subarrays.
      Constraints:
    2 <= nums.length <= 105
    1 <= nums[i], minK, maxK <= 106
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 3, 5, 2, 7, 5};
        int minK = 1;
        int maxK = 5;
        long expected = 2;
        var result = solution.countSubarrays(nums, minK, maxK);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 1, 1, 1};
        int minK = 1;
        int maxK = 1;
        long expected = 10;
        var result = solution.countSubarrays(nums, minK, maxK);
        assertThat(result).isEqualTo(expected);
    }

}
