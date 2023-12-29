package com.blogspot.ostas.leetcode.all.medium.maximum_number_of_non_overlapping_subarrays_with_sum_equals_target;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,1,1,1,1], target = 2
    Output: 2
    Explanation: There are 2 non-overlapping subarrays [1,1,1,1,1] with sum equals to target(2).
    Example 2:
    Input: nums = [-1,3,5,1,4,2,-9], target = 6
    Output: 2
    Explanation: There are 3 subarrays with sum equal to 6.
    ([5,1], [4,2], [3,5,1,4,2,-9]) but only the first 2 are non-overlapping.
      Constraints:
    1 <= nums.length <= 105
    -104 <= nums[i] <= 104
    0 <= target <= 106
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 1, 1, 1, 1};
        int target = 2;
        int expected = 2;
        var result = solution.maxNonOverlapping(nums, target);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{-1, 3, 5, 1, 4, 2, -9};
        int target = 6;
        int expected = 2;
        var result = solution.maxNonOverlapping(nums, target);
        assertThat(result).isEqualTo(expected);
    }

}
