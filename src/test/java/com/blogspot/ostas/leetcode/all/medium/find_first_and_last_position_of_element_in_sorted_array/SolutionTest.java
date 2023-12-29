package com.blogspot.ostas.leetcode.all.medium.find_first_and_last_position_of_element_in_sorted_array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [5,7,7,8,8,10], target = 8
    Output: [3,4]
    Example 2:
    Input: nums = [5,7,7,8,8,10], target = 6
    Output: [-1,-1]
    Example 3:
    Input: nums = [], target = 0
    Output: [-1,-1]
      Constraints:
    0 <= nums.length <= 105
    -109 <= nums[i] <= 109
    nums is a non-decreasing array.
    -109 <= target <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] expected = new int[]{3, 4};
        var result = solution.searchRange(nums, target);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{5, 7, 7, 8, 8, 10};
        int target = 6;
        int[] expected = new int[]{-1, -1};
        var result = solution.searchRange(nums, target);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{};
        int target = 0;
        int[] expected = new int[]{-1, -1};
        var result = solution.searchRange(nums, target);
        assertThat(result).isEqualTo(expected);
    }

}
