package com.blogspot.ostas.leetcode.all.hard.split_array_largest_sum;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [7,2,5,10,8], k = 2
    Output: 18
    Explanation: There are four ways to split nums into two subarrays.
    The best way is to split it into [7,2,5] and [10,8], where the largest sum among the two subarrays is only 18.
    Example 2:
    Input: nums = [1,2,3,4,5], k = 2
    Output: 9
    Explanation: There are four ways to split nums into two subarrays.
    The best way is to split it into [1,2,3] and [4,5], where the largest sum among the two subarrays is only 9.
      Constraints:
    1 <= nums.length <= 1000
    0 <= nums[i] <= 106
    1 <= k <= min(50, nums.length)
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{7, 2, 5, 10, 8};
        int k = 2;
        int expected = 18;
        var result = solution.splitArray(nums, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 3, 4, 5};
        int k = 2;
        int expected = 9;
        var result = solution.splitArray(nums, k);
        assertThat(result).isEqualTo(expected);
    }

}
