package com.blogspot.ostas.leetcode.all.hard.split_array_with_same_average;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,2,3,4,5,6,7,8]
    Output: true
    Explanation: We can split the array into [1,4,5,8] and [2,3,6,7], and both of them have an average of 4.5.
    Example 2:
    Input: nums = [3,1]
    Output: false
      Constraints:
    1 <= nums.length <= 30
    0 <= nums[i] <= 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        boolean expected = true;
        var result = solution.splitArraySameAverage(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{3, 1};
        boolean expected = false;
        var result = solution.splitArraySameAverage(nums);
        assertThat(result).isEqualTo(expected);
    }

}
