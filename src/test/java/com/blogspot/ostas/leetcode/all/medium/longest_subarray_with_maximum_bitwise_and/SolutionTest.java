package com.blogspot.ostas.leetcode.all.medium.longest_subarray_with_maximum_bitwise_and;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,2,3,3,2,2]
    Output: 2
    Explanation:
    The maximum possible bitwise AND of a subarray is 3.
    The longest subarray with that value is [3,3], so we return 2.
    Example 2:
    Input: nums = [1,2,3,4]
    Output: 1
    Explanation:
    The maximum possible bitwise AND of a subarray is 4.
    The longest subarray with that value is [4], so we return 1.
      Constraints:
    1 <= nums.length <= 105
    1 <= nums[i] <= 106
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 3, 3, 2, 2};
        int expected = 2;
        var result = solution.longestSubarray(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 3, 4};
        int expected = 1;
        var result = solution.longestSubarray(nums);
        assertThat(result).isEqualTo(expected);
    }

}
