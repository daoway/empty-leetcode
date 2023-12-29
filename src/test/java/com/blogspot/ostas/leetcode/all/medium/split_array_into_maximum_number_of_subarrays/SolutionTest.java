package com.blogspot.ostas.leetcode.all.medium.split_array_into_maximum_number_of_subarrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,0,2,0,1,2]
    Output: 3
    Explanation: We can split the array into the following subarrays:
    - [1,0]. The score of this subarray is 1 AND 0 = 0.
    - [2,0]. The score of this subarray is 2 AND 0 = 0.
    - [1,2]. The score of this subarray is 1 AND 2 = 0.
    The sum of scores is 0 + 0 + 0 = 0, which is the minimum possible score that we can obtain.
    It can be shown that we cannot split the array into more than 3 subarrays with a total score of 0. So we return 3.
    Example 2:
    Input: nums = [5,7,1,3]
    Output: 1
    Explanation: We can split the array into one subarray: [5,7,1,3] with a score of 1, which is the minimum possible score that we can obtain.
    It can be shown that we cannot split the array into more than 1 subarray with a total score of 1. So we return 1.
      Constraints:
    1 <= nums.length <= 105
    0 <= nums[i] <= 106
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 0, 2, 0, 1, 2};
        int expected = 3;
        var result = solution.maxSubarrays(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{5, 7, 1, 3};
        int expected = 1;
        var result = solution.maxSubarrays(nums);
        assertThat(result).isEqualTo(expected);
    }

}
