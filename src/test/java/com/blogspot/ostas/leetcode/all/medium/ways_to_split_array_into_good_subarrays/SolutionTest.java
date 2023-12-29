package com.blogspot.ostas.leetcode.all.medium.ways_to_split_array_into_good_subarrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [0,1,0,0,1]
    Output: 3
    Explanation: There are 3 ways to split nums into good subarrays:
    - [0,1] [0,0,1]
    - [0,1,0] [0,1]
    - [0,1,0,0] [1]
    Example 2:
    Input: nums = [0,1,0]
    Output: 1
    Explanation: There is 1 way to split nums into good subarrays:
    - [0,1,0]
      Constraints:
    1 <= nums.length <= 105
    0 <= nums[i] <= 1
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{0, 1, 0, 0, 1};
        int expected = 3;
        var result = solution.numberOfGoodSubarraySplits(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{0, 1, 0};
        int expected = 1;
        var result = solution.numberOfGoodSubarraySplits(nums);
        assertThat(result).isEqualTo(expected);
    }

}
