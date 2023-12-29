package com.blogspot.ostas.leetcode.all.medium.maximum_absolute_sum_of_any_subarray;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,-3,2,3,-4]
    Output: 5
    Explanation: The subarray [2,3] has absolute sum = abs(2+3) = abs(5) = 5.
    Example 2:
    Input: nums = [2,-5,1,-4,3,-2]
    Output: 8
    Explanation: The subarray [-5,1,-4] has absolute sum = abs(-5+1-4) = abs(-8) = 8.
      Constraints:
    1 <= nums.length <= 105
    -104 <= nums[i] <= 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, -3, 2, 3, -4};
        int expected = 5;
        var result = solution.maxAbsoluteSum(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{2, -5, 1, -4, 3, -2};
        int expected = 8;
        var result = solution.maxAbsoluteSum(nums);
        assertThat(result).isEqualTo(expected);
    }

}
