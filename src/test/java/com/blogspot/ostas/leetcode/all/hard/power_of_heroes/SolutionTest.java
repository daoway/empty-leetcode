package com.blogspot.ostas.leetcode.all.hard.power_of_heroes;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [2,1,4]
    Output: 141
    Explanation:
    1st group: [2] has power = 22 * 2 = 8.
    2nd group: [1] has power = 12 * 1 = 1.
    3rd group: [4] has power = 42 * 4 = 64.
    4th group: [2,1] has power = 22 * 1 = 4.
    5th group: [2,4] has power = 42 * 2 = 32.
    6th group: [1,4] has power = 42 * 1 = 16.
    7th group: [2,1,4] has power = 42 * 1 = 16.
    The sum of powers of all groups is 8 + 1 + 64 + 4 + 32 + 16 + 16 = 141.
    Example 2:
    Input: nums = [1,1,1]
    Output: 7
    Explanation: A total of 7 groups are possible, and the power of each group will be 1. Therefore, the sum of the powers of all groups is 7.
      Constraints:
    1 <= nums.length <= 105
    1 <= nums[i] <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{2, 1, 4};
        int expected = 141;
        var result = solution.sumOfPower(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 1, 1};
        int expected = 7;
        var result = solution.sumOfPower(nums);
        assertThat(result).isEqualTo(expected);
    }

}
