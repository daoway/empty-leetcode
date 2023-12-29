package com.blogspot.ostas.leetcode.all.hard.constrained_subsequence_sum;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [10,2,-10,5,20], k = 2
    Output: 37
    Explanation: The subsequence is [10, 2, 5, 20].
    Example 2:
    Input: nums = [-1,-2,-3], k = 1
    Output: -1
    Explanation: The subsequence must be non-empty, so we choose the largest number.
    Example 3:
    Input: nums = [10,-2,-10,-5,20], k = 2
    Output: 23
    Explanation: The subsequence is [10, -2, -5, 20].
      Constraints:
    1 <= k <= nums.length <= 105
    -104 <= nums[i] <= 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{10, 2, -10, 5, 20};
        int k = 2;
        int expected = 37;
        var result = solution.constrainedSubsetSum(nums, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{-1, -2, -3};
        int k = 1;
        int expected = -1;
        var result = solution.constrainedSubsetSum(nums, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{10, -2, -10, -5, 20};
        int k = 2;
        int expected = 23;
        var result = solution.constrainedSubsetSum(nums, k);
        assertThat(result).isEqualTo(expected);
    }

}
