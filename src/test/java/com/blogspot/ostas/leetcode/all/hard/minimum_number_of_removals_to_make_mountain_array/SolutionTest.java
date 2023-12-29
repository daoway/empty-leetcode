package com.blogspot.ostas.leetcode.all.hard.minimum_number_of_removals_to_make_mountain_array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,3,1]
    Output: 0
    Explanation: The array itself is a mountain array so we do not need to remove any elements.
    Example 2:
    Input: nums = [2,1,1,5,6,2,3,1]
    Output: 3
    Explanation: One solution is to remove the elements at indices 0, 1, and 5, making the array nums = [1,5,6,3,1].
      Constraints:
    3 <= nums.length <= 1000
    1 <= nums[i] <= 109
    It is guaranteed that you can make a mountain array out of nums.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 3, 1};
        int expected = 0;
        var result = solution.minimumMountainRemovals(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{2, 1, 1, 5, 6, 2, 3, 1};
        int expected = 3;
        var result = solution.minimumMountainRemovals(nums);
        assertThat(result).isEqualTo(expected);
    }

}
