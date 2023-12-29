package com.blogspot.ostas.leetcode.all.medium.count_complete_subarrays_in_an_array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,3,1,2,2]
    Output: 4
    Explanation: The complete subarrays are the following: [1,3,1,2], [1,3,1,2,2], [3,1,2] and [3,1,2,2].
    Example 2:
    Input: nums = [5,5,5,5]
    Output: 10
    Explanation: The array consists only of the integer 5, so any subarray is complete. The number of subarrays that we can choose is 10.
      Constraints:
    1 <= nums.length <= 1000
    1 <= nums[i] <= 2000
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 3, 1, 2, 2};
        int expected = 4;
        var result = solution.countCompleteSubarrays(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{5, 5, 5, 5};
        int expected = 10;
        var result = solution.countCompleteSubarrays(nums);
        assertThat(result).isEqualTo(expected);
    }

}
