package com.blogspot.ostas.leetcode.all.medium.maximum_sum_of_two_non_overlapping_subarrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [0,6,5,2,2,5,1,9,4], firstLen = 1, secondLen = 2
    Output: 20
    Explanation: One choice of subarrays is [9] with length 1, and [6,5] with length 2.
    Example 2:
    Input: nums = [3,8,1,3,2,1,8,9,0], firstLen = 3, secondLen = 2
    Output: 29
    Explanation: One choice of subarrays is [3,8,1] with length 3, and [8,9] with length 2.
    Example 3:
    Input: nums = [2,1,5,6,0,9,5,0,3,8], firstLen = 4, secondLen = 3
    Output: 31
    Explanation: One choice of subarrays is [5,6,0,9] with length 4, and [0,3,8] with length 3.
      Constraints:
    1 <= firstLen, secondLen <= 1000
    2 <= firstLen + secondLen <= 1000
    firstLen + secondLen <= nums.length <= 1000
    0 <= nums[i] <= 1000
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{0, 6, 5, 2, 2, 5, 1, 9, 4};
        int firstLen = 1;
        int secondLen = 2;
        int expected = 20;
        var result = solution.maxSumTwoNoOverlap(nums, firstLen, secondLen);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{3, 8, 1, 3, 2, 1, 8, 9, 0};
        int firstLen = 3;
        int secondLen = 2;
        int expected = 29;
        var result = solution.maxSumTwoNoOverlap(nums, firstLen, secondLen);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{2, 1, 5, 6, 0, 9, 5, 0, 3, 8};
        int firstLen = 4;
        int secondLen = 3;
        int expected = 31;
        var result = solution.maxSumTwoNoOverlap(nums, firstLen, secondLen);
        assertThat(result).isEqualTo(expected);
    }

}
