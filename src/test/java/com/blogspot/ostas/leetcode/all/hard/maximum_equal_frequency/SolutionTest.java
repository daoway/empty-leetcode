package com.blogspot.ostas.leetcode.all.hard.maximum_equal_frequency;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [2,2,1,1,5,3,3,5]
    Output: 7
    Explanation: For the subarray [2,2,1,1,5,3,3] of length 7, if we remove nums[4] = 5, we will get [2,2,1,1,3,3], so that each number will appear exactly twice.
    Example 2:
    Input: nums = [1,1,1,2,2,2,3,3,3,4,4,4,5]
    Output: 13
      Constraints:
    2 <= nums.length <= 105
    1 <= nums[i] <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{2, 2, 1, 1, 5, 3, 3, 5};
        int expected = 7;
        var result = solution.maxEqualFreq(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5};
        int expected = 13;
        var result = solution.maxEqualFreq(nums);
        assertThat(result).isEqualTo(expected);
    }

}
