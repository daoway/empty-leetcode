package com.blogspot.ostas.leetcode.all.easy.search_insert_position;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,3,5,6], target = 5
    Output: 2
    Example 2:
    Input: nums = [1,3,5,6], target = 2
    Output: 1
    Example 3:
    Input: nums = [1,3,5,6], target = 7
    Output: 4
      Constraints:
    1 <= nums.length <= 104
    -104 <= nums[i] <= 104
    nums contains distinct values sorted in ascending order.
    -104 <= target <= 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 3, 5, 6};
        int target = 5;
        int expected = 2;
        var result = solution.searchInsert(nums, target);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 3, 5, 6};
        int target = 2;
        int expected = 1;
        var result = solution.searchInsert(nums, target);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{1, 3, 5, 6};
        int target = 7;
        int expected = 4;
        var result = solution.searchInsert(nums, target);
        assertThat(result).isEqualTo(expected);
    }

}
