package com.blogspot.ostas.leetcode.all.hard.shortest_subarray_with_sum_at_least_k;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1], k = 1
    Output: 1
    Example 2:
    Input: nums = [1,2], k = 4
    Output: -1
    Example 3:
    Input: nums = [2,-1,2], k = 3
    Output: 3
      Constraints:
    1 <= nums.length <= 105
    -105 <= nums[i] <= 105
    1 <= k <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1};
        int k = 1;
        int expected = 1;
        var result = solution.shortestSubarray(nums, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2};
        int k = 4;
        int expected = -1;
        var result = solution.shortestSubarray(nums, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{2, -1, 2};
        int k = 3;
        int expected = 3;
        var result = solution.shortestSubarray(nums, k);
        assertThat(result).isEqualTo(expected);
    }

}
