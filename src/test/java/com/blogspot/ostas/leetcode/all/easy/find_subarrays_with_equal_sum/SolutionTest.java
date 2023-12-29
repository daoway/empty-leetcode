package com.blogspot.ostas.leetcode.all.easy.find_subarrays_with_equal_sum;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [4,2,4]
    Output: true
    Explanation: The subarrays with elements [4,2] and [2,4] have the same sum of 6.
    Example 2:
    Input: nums = [1,2,3,4,5]
    Output: false
    Explanation: No two subarrays of size 2 have the same sum.
    Example 3:
    Input: nums = [0,0,0]
    Output: true
    Explanation: The subarrays [nums[0],nums[1]] and [nums[1],nums[2]] have the same sum of 0.
    Note that even though the subarrays have the same content, the two subarrays are considered different because they are in different positions in the original array.
      Constraints:
    2 <= nums.length <= 1000
    -109 <= nums[i] <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{4, 2, 4};
        boolean expected = true;
        var result = solution.findSubarrays(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 3, 4, 5};
        boolean expected = false;
        var result = solution.findSubarrays(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{0, 0, 0};
        boolean expected = true;
        var result = solution.findSubarrays(nums);
        assertThat(result).isEqualTo(expected);
    }

}
