package com.blogspot.ostas.leetcode.all.medium.greatest_sum_divisible_by_three;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [3,6,5,1,8]
    Output: 18
    Explanation: Pick numbers 3, 6, 1 and 8 their sum is 18 (maximum sum divisible by 3).
    Example 2:
    Input: nums = [4]
    Output: 0
    Explanation: Since 4 is not divisible by 3, do not pick any number.
    Example 3:
    Input: nums = [1,2,3,4,4]
    Output: 12
    Explanation: Pick numbers 1, 3, 4 and 4 their sum is 12 (maximum sum divisible by 3).
      Constraints:
    1 <= nums.length <= 4 * 104
    1 <= nums[i] <= 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{3, 6, 5, 1, 8};
        int expected = 18;
        var result = solution.maxSumDivThree(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{4};
        int expected = 0;
        var result = solution.maxSumDivThree(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 3, 4, 4};
        int expected = 12;
        var result = solution.maxSumDivThree(nums);
        assertThat(result).isEqualTo(expected);
    }

}
