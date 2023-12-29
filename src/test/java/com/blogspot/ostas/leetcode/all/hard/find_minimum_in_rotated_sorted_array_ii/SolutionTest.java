package com.blogspot.ostas.leetcode.all.hard.find_minimum_in_rotated_sorted_array_ii;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,3,5]
    Output: 1
    Example 2:
    Input: nums = [2,2,2,0,1]
    Output: 0
      Constraints:
    n == nums.length
    1 <= n <= 5000
    -5000 <= nums[i] <= 5000
    nums is sorted and rotated between 1 and n times.
      Follow up: This problem is similar to Find Minimum in Rotated Sorted Array, but nums may contain duplicates. Would this affect the runtime complexity? How and why?
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 3, 5};
        int expected = 1;
        var result = solution.findMin(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{2, 2, 2, 0, 1};
        int expected = 0;
        var result = solution.findMin(nums);
        assertThat(result).isEqualTo(expected);
    }

}
