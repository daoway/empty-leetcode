package com.blogspot.ostas.leetcode.all.medium.continuous_subarrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [5,4,2,4]
    Output: 8
    Explanation:
    Continuous subarray of size 1: [5], [4], [2], [4].
    Continuous subarray of size 2: [5,4], [4,2], [2,4].
    Continuous subarray of size 3: [4,2,4].
    Thereare no subarrys of size 4.
    Total continuous subarrays = 4 + 3 + 1 = 8.
    It can be shown that there are no more continuous subarrays.
      Example 2:
    Input: nums = [1,2,3]
    Output: 6
    Explanation:
    Continuous subarray of size 1: [1], [2], [3].
    Continuous subarray of size 2: [1,2], [2,3].
    Continuous subarray of size 3: [1,2,3].
    Total continuous subarrays = 3 + 2 + 1 = 6.
      Constraints:
    1 <= nums.length <= 105
    1 <= nums[i] <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{5, 4, 2, 4};
        long expected = 8;
        var result = solution.continuousSubarrays(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 3};
        long expected = 6;
        var result = solution.continuousSubarrays(nums);
        assertThat(result).isEqualTo(expected);
    }

}
