package com.blogspot.ostas.leetcode.all.medium.number_of_subarrays_with_gcd_equal_to_k;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [9,3,1,2,6,3], k = 3
    Output: 4
    Explanation: The subarrays of nums where 3 is the greatest common divisor of all the subarray's elements are:
    - [9,3,1,2,6,3]
    - [9,3,1,2,6,3]
    - [9,3,1,2,6,3]
    - [9,3,1,2,6,3]
    Example 2:
    Input: nums = [4], k = 7
    Output: 0
    Explanation: There are no subarrays of nums where 7 is the greatest common divisor of all the subarray's elements.
      Constraints:
    1 <= nums.length <= 1000
    1 <= nums[i], k <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{9, 3, 1, 2, 6, 3};
        int k = 3;
        int expected = 4;
        var result = solution.subarrayGCD(nums, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{4};
        int k = 7;
        int expected = 0;
        var result = solution.subarrayGCD(nums, k);
        assertThat(result).isEqualTo(expected);
    }

}
