package com.blogspot.ostas.leetcode.all.medium.minimum_size_subarray_in_infinite_array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,2,3], target = 5
    Output: 2
    Explanation: In this example infinite_nums = [1,2,3,1,2,3,1,2,...].
    The subarray in the range [1,2], has the sum equal to target = 5 and length = 2.
    It can be proven that 2 is the shortest length of a subarray with sum equal to target = 5.
    Example 2:
    Input: nums = [1,1,1,2,3], target = 4
    Output: 2
    Explanation: In this example infinite_nums = [1,1,1,2,3,1,1,1,2,3,1,1,...].
    The subarray in the range [4,5], has the sum equal to target = 4 and length = 2.
    It can be proven that 2 is the shortest length of a subarray with sum equal to target = 4.
    Example 3:
    Input: nums = [2,4,6,8], target = 3
    Output: -1
    Explanation: In this example infinite_nums = [2,4,6,8,2,4,6,8,...].
    It can be proven that there is no subarray with sum equal to target = 3.
      Constraints:
    1 <= nums.length <= 105
    1 <= nums[i] <= 105
    1 <= target <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 3};
        int target = 5;
        int expected = 2;
        var result = solution.minSizeSubarray(nums, target);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 1, 1, 2, 3};
        int target = 4;
        int expected = 2;
        var result = solution.minSizeSubarray(nums, target);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{2, 4, 6, 8};
        int target = 3;
        int expected = -1;
        var result = solution.minSizeSubarray(nums, target);
        assertThat(result).isEqualTo(expected);
    }

}
