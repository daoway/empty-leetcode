package com.blogspot.ostas.leetcode.all.medium.search_in_rotated_sorted_array_ii;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [2,5,6,0,0,1,2], target = 0
    Output: true
    Example 2:
    Input: nums = [2,5,6,0,0,1,2], target = 3
    Output: false
      Constraints:
    1 <= nums.length <= 5000
    -104 <= nums[i] <= 104
    nums is guaranteed to be rotated at some pivot.
    -104 <= target <= 104
      Follow up: This problem is similar to Search in Rotated Sorted Array, but nums may contain duplicates. Would this affect the runtime complexity? How and why?
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{2, 5, 6, 0, 0, 1, 2};
        int target = 0;
        boolean expected = true;
        var result = solution.search(nums, target);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{2, 5, 6, 0, 0, 1, 2};
        int target = 3;
        boolean expected = false;
        var result = solution.search(nums, target);
        assertThat(result).isEqualTo(expected);
    }

}
