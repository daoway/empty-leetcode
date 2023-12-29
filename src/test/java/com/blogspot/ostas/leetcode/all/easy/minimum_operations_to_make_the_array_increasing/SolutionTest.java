package com.blogspot.ostas.leetcode.all.easy.minimum_operations_to_make_the_array_increasing;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,1,1]
    Output: 3
    Explanation: You can do the following operations:
    1) Increment nums[2], so nums becomes [1,1,2].
    2) Increment nums[1], so nums becomes [1,2,2].
    3) Increment nums[2], so nums becomes [1,2,3].
    Example 2:
    Input: nums = [1,5,2,4,1]
    Output: 14
    Example 3:
    Input: nums = [8]
    Output: 0
      Constraints:
    1 <= nums.length <= 5000
    1 <= nums[i] <= 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 1, 1};
        int expected = 3;
        var result = solution.minOperations(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 5, 2, 4, 1};
        int expected = 14;
        var result = solution.minOperations(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{8};
        int expected = 0;
        var result = solution.minOperations(nums);
        assertThat(result).isEqualTo(expected);
    }

}
