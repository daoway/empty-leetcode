package com.blogspot.ostas.leetcode.all.medium.minimum_operations_to_reduce_x_to_zero;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,1,4,2,3], x = 5
    Output: 2
    Explanation: The optimal solution is to remove the last two elements to reduce x to zero.
    Example 2:
    Input: nums = [5,6,7,8,9], x = 4
    Output: -1
    Example 3:
    Input: nums = [3,2,20,1,1,3], x = 10
    Output: 5
    Explanation: The optimal solution is to remove the last three elements and the first two elements (5 operations in total) to reduce x to zero.
      Constraints:
    1 <= nums.length <= 105
    1 <= nums[i] <= 104
    1 <= x <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 1, 4, 2, 3};
        int x = 5;
        int expected = 2;
        var result = solution.minOperations(nums, x);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{5, 6, 7, 8, 9};
        int x = 4;
        int expected = -1;
        var result = solution.minOperations(nums, x);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{3, 2, 20, 1, 1, 3};
        int x = 10;
        int expected = 5;
        var result = solution.minOperations(nums, x);
        assertThat(result).isEqualTo(expected);
    }

}
