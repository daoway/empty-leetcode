package com.blogspot.ostas.leetcode.all.medium.number_of_longest_increasing_subsequence;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,3,5,4,7]
    Output: 2
    Explanation: The two longest increasing subsequences are [1, 3, 4, 7] and [1, 3, 5, 7].
    Example 2:
    Input: nums = [2,2,2,2,2]
    Output: 5
    Explanation: The length of the longest increasing subsequence is 1, and there are 5 increasing subsequences of length 1, so output 5.
      Constraints:
    1 <= nums.length <= 2000
    -106 <= nums[i] <= 106
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 3, 5, 4, 7};
        int expected = 2;
        var result = solution.findNumberOfLIS(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{2, 2, 2, 2, 2};
        int expected = 5;
        var result = solution.findNumberOfLIS(nums);
        assertThat(result).isEqualTo(expected);
    }

}
