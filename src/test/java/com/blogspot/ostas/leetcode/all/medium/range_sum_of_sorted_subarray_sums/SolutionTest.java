package com.blogspot.ostas.leetcode.all.medium.range_sum_of_sorted_subarray_sums;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,2,3,4], n = 4, left = 1, right = 5
    Output: 13
    Explanation: All subarray sums are 1, 3, 6, 10, 2, 5, 9, 3, 7, 4. After sorting them in non-decreasing order we have the new array [1, 2, 3, 3, 4, 5, 6, 7, 9, 10]. The sum of the numbers from index le = 1 to ri = 5 is 1 + 2 + 3 + 3 + 4 = 13.
    Example 2:
    Input: nums = [1,2,3,4], n = 4, left = 3, right = 4
    Output: 6
    Explanation: The given array is the same as example 1. We have the new array [1, 2, 3, 3, 4, 5, 6, 7, 9, 10]. The sum of the numbers from index le = 3 to ri = 4 is 3 + 3 = 6.
    Example 3:
    Input: nums = [1,2,3,4], n = 4, left = 1, right = 10
    Output: 50
      Constraints:
    n == nums.length
    1 <= nums.length <= 1000
    1 <= nums[i] <= 100
    1 <= left <= right <= n * (n + 1) / 2
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 3, 4};
        int n = 4;
        int left = 1;
        int right = 5;
        int expected = 13;
        var result = solution.rangeSum(nums, n, left, right);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 3, 4};
        int n = 4;
        int left = 3;
        int right = 4;
        int expected = 6;
        var result = solution.rangeSum(nums, n, left, right);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 3, 4};
        int n = 4;
        int left = 1;
        int right = 10;
        int expected = 50;
        var result = solution.rangeSum(nums, n, left, right);
        assertThat(result).isEqualTo(expected);
    }

}
