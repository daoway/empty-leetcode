package com.blogspot.ostas.leetcode.all.easy.make_array_zero_by_subtracting_equal_amounts;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,5,0,3,5]
    Output: 3
    Explanation:
    In the first operation, choose x = 1. Now, nums = [0,4,0,2,4].
    In the second operation, choose x = 2. Now, nums = [0,2,0,0,2].
    In the third operation, choose x = 2. Now, nums = [0,0,0,0,0].
    Example 2:
    Input: nums = [0]
    Output: 0
    Explanation: Each element in nums is already 0 so no operations are needed.
      Constraints:
    1 <= nums.length <= 100
    0 <= nums[i] <= 100
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 5, 0, 3, 5};
        int expected = 3;
        var result = solution.minimumOperations(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{0};
        int expected = 0;
        var result = solution.minimumOperations(nums);
        assertThat(result).isEqualTo(expected);
    }

}
