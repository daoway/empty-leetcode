package com.blogspot.ostas.leetcode.all.medium.search_in_rotated_sorted_array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [4,5,6,7,0,1,2], target = 0
    Output: 4
    Example 2:
    Input: nums = [4,5,6,7,0,1,2], target = 3
    Output: -1
    Example 3:
    Input: nums = [1], target = 0
    Output: -1
      Constraints:
    1 <= nums.length <= 5000
    -104 <= nums[i] <= 104
    All values of nums are unique.
    nums is an ascending array that is possibly rotated.
    -104 <= target <= 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int expected = 4;
        var result = solution.search(nums, target);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{4, 5, 6, 7, 0, 1, 2};
        int target = 3;
        int expected = -1;
        var result = solution.search(nums, target);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{1};
        int target = 0;
        int expected = -1;
        var result = solution.search(nums, target);
        assertThat(result).isEqualTo(expected);
    }

}
