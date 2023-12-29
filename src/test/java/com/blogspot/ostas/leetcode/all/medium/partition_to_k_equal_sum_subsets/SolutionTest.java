package com.blogspot.ostas.leetcode.all.medium.partition_to_k_equal_sum_subsets;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [4,3,2,3,5,2,1], k = 4
    Output: true
    Explanation: It is possible to divide it into 4 subsets (5), (1, 4), (2,3), (2,3) with equal sums.
    Example 2:
    Input: nums = [1,2,3,4], k = 3
    Output: false
      Constraints:
    1 <= k <= nums.length <= 16
    1 <= nums[i] <= 104
    The frequency of each element is in the range [1, 4].
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{4, 3, 2, 3, 5, 2, 1};
        int k = 4;
        boolean expected = true;
        var result = solution.canPartitionKSubsets(nums, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 3, 4};
        int k = 3;
        boolean expected = false;
        var result = solution.canPartitionKSubsets(nums, k);
        assertThat(result).isEqualTo(expected);
    }

}
