package com.blogspot.ostas.leetcode.all.medium.number_of_subarrays_with_lcm_equal_to_k;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [3,6,2,7,1], k = 6
    Output: 4
    Explanation: The subarrays of nums where 6 is the least common multiple of all the subarray's elements are:
    - [3,6,2,7,1]
    - [3,6,2,7,1]
    - [3,6,2,7,1]
    - [3,6,2,7,1]
    Example 2:
    Input: nums = [3], k = 2
    Output: 0
    Explanation: There are no subarrays of nums where 2 is the least common multiple of all the subarray's elements.
      Constraints:
    1 <= nums.length <= 1000
    1 <= nums[i], k <= 1000
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{3, 6, 2, 7, 1};
        int k = 6;
        int expected = 4;
        var result = solution.subarrayLCM(nums, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{3};
        int k = 2;
        int expected = 0;
        var result = solution.subarrayLCM(nums, k);
        assertThat(result).isEqualTo(expected);
    }

}
