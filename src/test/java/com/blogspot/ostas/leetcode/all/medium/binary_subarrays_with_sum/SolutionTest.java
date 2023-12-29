package com.blogspot.ostas.leetcode.all.medium.binary_subarrays_with_sum;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,0,1,0,1], goal = 2
    Output: 4
    Explanation: The 4 subarrays are bolded and underlined below:
    [1,0,1,0,1]
    [1,0,1,0,1]
    [1,0,1,0,1]
    [1,0,1,0,1]
    Example 2:
    Input: nums = [0,0,0,0,0], goal = 0
    Output: 15
      Constraints:
    1 <= nums.length <= 3 * 104
    nums[i] is either 0 or 1.
    0 <= goal <= nums.length
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 0, 1, 0, 1};
        int goal = 2;
        int expected = 4;
        var result = solution.numSubarraysWithSum(nums, goal);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{0, 0, 0, 0, 0};
        int goal = 0;
        int expected = 15;
        var result = solution.numSubarraysWithSum(nums, goal);
        assertThat(result).isEqualTo(expected);
    }

}
