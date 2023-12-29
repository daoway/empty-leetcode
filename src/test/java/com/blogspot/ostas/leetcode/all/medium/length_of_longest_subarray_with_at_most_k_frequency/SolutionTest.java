package com.blogspot.ostas.leetcode.all.medium.length_of_longest_subarray_with_at_most_k_frequency;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,2,3,1,2,3,1,2], k = 2
    Output: 6
    Explanation: The longest possible good subarray is [1,2,3,1,2,3] since the values 1, 2, and 3 occur at most twice in this subarray. Note that the subarrays [2,3,1,2,3,1] and [3,1,2,3,1,2] are also good.
    It can be shown that there are no good subarrays with length more than 6.
    Example 2:
    Input: nums = [1,2,1,2,1,2,1,2], k = 1
    Output: 2
    Explanation: The longest possible good subarray is [1,2] since the values 1 and 2 occur at most once in this subarray. Note that the subarray [2,1] is also good.
    It can be shown that there are no good subarrays with length more than 2.
    Example 3:
    Input: nums = [5,5,5,5,5,5,5], k = 4
    Output: 4
    Explanation: The longest possible good subarray is [5,5,5,5] since the value 5 occurs 4 times in this subarray.
    It can be shown that there are no good subarrays with length more than 4.
      Constraints:
    1 <= nums.length <= 105
    1 <= nums[i] <= 109
    1 <= k <= nums.length
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 3, 1, 2, 3, 1, 2};
        int k = 2;
        int expected = 6;
        var result = solution.maxSubarrayLength(nums, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 1, 2, 1, 2, 1, 2};
        int k = 1;
        int expected = 2;
        var result = solution.maxSubarrayLength(nums, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{5, 5, 5, 5, 5, 5, 5};
        int k = 4;
        int expected = 4;
        var result = solution.maxSubarrayLength(nums, k);
        assertThat(result).isEqualTo(expected);
    }

}
