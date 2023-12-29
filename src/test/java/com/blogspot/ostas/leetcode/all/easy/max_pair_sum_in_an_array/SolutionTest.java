package com.blogspot.ostas.leetcode.all.easy.max_pair_sum_in_an_array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [51,71,17,24,42]
    Output: 88
    Explanation:
    For i = 1 and j = 2, nums[i] and nums[j] have equal maximum digits with a pair sum of 71 + 17 = 88.
    For i = 3 and j = 4, nums[i] and nums[j] have equal maximum digits with a pair sum of 24 + 42 = 66.
    It can be shown that there are no other pairs with equal maximum digits, so the answer is 88.
    Example 2:
    Input: nums = [1,2,3,4]
    Output: -1
    Explanation: No pair exists in nums with equal maximum digits.
      Constraints:
    2 <= nums.length <= 100
    1 <= nums[i] <= 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{51, 71, 17, 24, 42};
        int expected = 88;
        var result = solution.maxSum(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 3, 4};
        int expected = -1;
        var result = solution.maxSum(nums);
        assertThat(result).isEqualTo(expected);
    }

}
