package com.blogspot.ostas.leetcode.all.easy.maximize_sum_of_array_after_k_negations;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [4,2,3], k = 1
    Output: 5
    Explanation: Choose index 1 and nums becomes [4,-2,3].
    Example 2:
    Input: nums = [3,-1,0,2], k = 3
    Output: 6
    Explanation: Choose indices (1, 2, 2) and nums becomes [3,1,0,2].
    Example 3:
    Input: nums = [2,-3,-1,5,-4], k = 2
    Output: 13
    Explanation: Choose indices (1, 4) and nums becomes [2,3,-1,5,4].
      Constraints:
    1 <= nums.length <= 104
    -100 <= nums[i] <= 100
    1 <= k <= 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{4, 2, 3};
        int k = 1;
        int expected = 5;
        var result = solution.largestSumAfterKNegations(nums, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{3, -1, 0, 2};
        int k = 3;
        int expected = 6;
        var result = solution.largestSumAfterKNegations(nums, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{2, -3, -1, 5, -4};
        int k = 2;
        int expected = 13;
        var result = solution.largestSumAfterKNegations(nums, k);
        assertThat(result).isEqualTo(expected);
    }

}
