package com.blogspot.ostas.leetcode.all.hard.count_subarrays_with_median_k;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [3,2,1,4,5], k = 4
    Output: 3
    Explanation: The subarrays that have a median equal to 4 are: [4], [4,5] and [1,4,5].
    Example 2:
    Input: nums = [2,3,1], k = 3
    Output: 1
    Explanation: [3] is the only subarray that has a median equal to 3.
      Constraints:
    n == nums.length
    1 <= n <= 105
    1 <= nums[i], k <= n
    The integers in nums are distinct.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{3, 2, 1, 4, 5};
        int k = 4;
        int expected = 3;
        var result = solution.countSubarrays(nums, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{2, 3, 1};
        int k = 3;
        int expected = 1;
        var result = solution.countSubarrays(nums, k);
        assertThat(result).isEqualTo(expected);
    }

}
