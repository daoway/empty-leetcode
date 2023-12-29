package com.blogspot.ostas.leetcode.all.medium.arithmetic_slices;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,2,3,4]
    Output: 3
    Explanation: We have 3 arithmetic slices in nums: [1, 2, 3], [2, 3, 4] and [1,2,3,4] itself.
    Example 2:
    Input: nums = [1]
    Output: 0
      Constraints:
    1 <= nums.length <= 5000
    -1000 <= nums[i] <= 1000
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 3, 4};
        int expected = 3;
        var result = solution.numberOfArithmeticSlices(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1};
        int expected = 0;
        var result = solution.numberOfArithmeticSlices(nums);
        assertThat(result).isEqualTo(expected);
    }

}
