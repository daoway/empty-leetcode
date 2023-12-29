package com.blogspot.ostas.leetcode.all.easy.max_consecutive_ones;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,1,0,1,1,1]
    Output: 3
    Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
    Example 2:
    Input: nums = [1,0,1,1,0,1]
    Output: 2
      Constraints:
    1 <= nums.length <= 105
    nums[i] is either 0 or 1.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 1, 0, 1, 1, 1};
        int expected = 3;
        var result = solution.findMaxConsecutiveOnes(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 0, 1, 1, 0, 1};
        int expected = 2;
        var result = solution.findMaxConsecutiveOnes(nums);
        assertThat(result).isEqualTo(expected);
    }

}
