package com.blogspot.ostas.leetcode.all.medium.longest_continuous_subarray_with_absolute_diff_less_than_or_equal_to_limit;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [8,2,4,7], limit = 4
    Output: 2
    Explanation: All subarrays are:
    [8] with maximum absolute diff |8-8| = 0 <= 4.
    [8,2] with maximum absolute diff |8-2| = 6 > 4.
    [8,2,4] with maximum absolute diff |8-2| = 6 > 4.
    [8,2,4,7] with maximum absolute diff |8-2| = 6 > 4.
    [2] with maximum absolute diff |2-2| = 0 <= 4.
    [2,4] with maximum absolute diff |2-4| = 2 <= 4.
    [2,4,7] with maximum absolute diff |2-7| = 5 > 4.
    [4] with maximum absolute diff |4-4| = 0 <= 4.
    [4,7] with maximum absolute diff |4-7| = 3 <= 4.
    [7] with maximum absolute diff |7-7| = 0 <= 4.
    Therefore, the size of the longest subarray is 2.
    Example 2:
    Input: nums = [10,1,2,4,7,2], limit = 5
    Output: 4
    Explanation: The subarray [2,4,7,2] is the longest since the maximum absolute diff is |2-7| = 5 <= 5.
    Example 3:
    Input: nums = [4,2,2,2,4,4,2,2], limit = 0
    Output: 3
      Constraints:
    1 <= nums.length <= 105
    1 <= nums[i] <= 109
    0 <= limit <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{8, 2, 4, 7};
        int limit = 4;
        int expected = 2;
        var result = solution.longestSubarray(nums, limit);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{10, 1, 2, 4, 7, 2};
        int limit = 5;
        int expected = 4;
        var result = solution.longestSubarray(nums, limit);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{4, 2, 2, 2, 4, 4, 2, 2};
        int limit = 0;
        int expected = 3;
        var result = solution.longestSubarray(nums, limit);
        assertThat(result).isEqualTo(expected);
    }

}
