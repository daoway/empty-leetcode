package com.blogspot.ostas.leetcode.all.easy.smallest_range_i;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1], k = 0
    Output: 0
    Explanation: The score is max(nums) - min(nums) = 1 - 1 = 0.
    Example 2:
    Input: nums = [0,10], k = 2
    Output: 6
    Explanation: Change nums to be [2, 8]. The score is max(nums) - min(nums) = 8 - 2 = 6.
    Example 3:
    Input: nums = [1,3,6], k = 3
    Output: 0
    Explanation: Change nums to be [4, 4, 4]. The score is max(nums) - min(nums) = 4 - 4 = 0.
      Constraints:
    1 <= nums.length <= 104
    0 <= nums[i] <= 104
    0 <= k <= 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1};
        int k = 0;
        int expected = 0;
        var result = solution.smallestRangeI(nums, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{0, 10};
        int k = 2;
        int expected = 6;
        var result = solution.smallestRangeI(nums, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{1, 3, 6};
        int k = 3;
        int expected = 0;
        var result = solution.smallestRangeI(nums, k);
        assertThat(result).isEqualTo(expected);
    }

}
