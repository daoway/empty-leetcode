package com.blogspot.ostas.leetcode.all.medium.sliding_subarray_beauty;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,-1,-3,-2,3], k = 3, x = 2
    Output: [-1,-2,-2]
    Explanation: There are 3 subarrays with size k = 3.
    The first subarray is [1, -1, -3] and the 2nd smallest negative integer is -1.
    The second subarray is [-1, -3, -2] and the 2nd smallest negative integer is -2.
    The third subarray is [-3, -2, 3] and the 2nd smallest negative integer is -2.
    Example 2:
    Input: nums = [-1,-2,-3,-4,-5], k = 2, x = 2
    Output: [-1,-2,-3,-4]
    Explanation: There are 4 subarrays with size k = 2.
    For [-1, -2], the 2nd smallest negative integer is -1.
    For [-2, -3], the 2nd smallest negative integer is -2.
    For [-3, -4], the 2nd smallest negative integer is -3.
    For [-4, -5], the 2nd smallest negative integer is -4.
    Example 3:
    Input: nums = [-3,1,2,-3,0,-3], k = 2, x = 1
    Output: [-3,0,-3,-3,-3]
    Explanation: There are 5 subarrays with size k = 2.
    For [-3, 1], the 1st smallest negative integer is -3.
    For [1, 2], there is no negative integer so the beauty is 0.
    For [2, -3], the 1st smallest negative integer is -3.
    For [-3, 0], the 1st smallest negative integer is -3.
    For [0, -3], the 1st smallest negative integer is -3.
      Constraints:
    n == nums.length
    1 <= n <= 105
    1 <= k <= n
    1 <= x <= k
    -50 <= nums[i] <= 50
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, -1, -3, -2, 3};
        int k = 3;
        int x = 2;
        int[] expected = new int[]{-1, -2, -2};
        var result = solution.getSubarrayBeauty(nums, k, x);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{-1, -2, -3, -4, -5};
        int k = 2;
        int x = 2;
        int[] expected = new int[]{-1, -2, -3, -4};
        var result = solution.getSubarrayBeauty(nums, k, x);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{-3, 1, 2, -3, 0, -3};
        int k = 2;
        int x = 1;
        int[] expected = new int[]{-3, 0, -3, -3, -3};
        var result = solution.getSubarrayBeauty(nums, k, x);
        assertThat(result).isEqualTo(expected);
    }

}
