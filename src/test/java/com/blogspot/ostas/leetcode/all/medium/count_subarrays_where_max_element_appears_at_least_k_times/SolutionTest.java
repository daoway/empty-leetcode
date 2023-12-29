package com.blogspot.ostas.leetcode.all.medium.count_subarrays_where_max_element_appears_at_least_k_times;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,3,2,3,3], k = 2
    Output: 6
    Explanation: The subarrays that contain the element 3 at least 2 times are: [1,3,2,3], [1,3,2,3,3], [3,2,3], [3,2,3,3], [2,3,3] and [3,3].
    Example 2:
    Input: nums = [1,4,2,1], k = 3
    Output: 0
    Explanation: No subarray contains the element 4 at least 3 times.
      Constraints:
    1 <= nums.length <= 105
    1 <= nums[i] <= 106
    1 <= k <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 3, 2, 3, 3};
        int k = 2;
        long expected = 6;
        var result = solution.countSubarrays(nums, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 4, 2, 1};
        int k = 3;
        long expected = 0;
        var result = solution.countSubarrays(nums, k);
        assertThat(result).isEqualTo(expected);
    }

}
