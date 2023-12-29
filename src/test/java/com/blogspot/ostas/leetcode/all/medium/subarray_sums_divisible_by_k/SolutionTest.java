package com.blogspot.ostas.leetcode.all.medium.subarray_sums_divisible_by_k;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [4,5,0,-2,-3,1], k = 5
    Output: 7
    Explanation: There are 7 subarrays with a sum divisible by k = 5:
    [4, 5, 0, -2, -3, 1], [5], [5, 0], [5, 0, -2, -3], [0], [0, -2, -3], [-2, -3]
    Example 2:
    Input: nums = [5], k = 9
    Output: 0
      Constraints:
    1 <= nums.length <= 3 * 104
    -104 <= nums[i] <= 104
    2 <= k <= 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{4, 5, 0, -2, -3, 1};
        int k = 5;
        int expected = 7;
        var result = solution.subarraysDivByK(nums, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{5};
        int k = 9;
        int expected = 0;
        var result = solution.subarraysDivByK(nums, k);
        assertThat(result).isEqualTo(expected);
    }

}
