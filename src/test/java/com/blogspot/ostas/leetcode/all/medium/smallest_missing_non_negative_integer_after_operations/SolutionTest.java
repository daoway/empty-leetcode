package com.blogspot.ostas.leetcode.all.medium.smallest_missing_non_negative_integer_after_operations;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,-10,7,13,6,8], value = 5
    Output: 4
    Explanation: One can achieve this result by applying the following operations:
    - Add value to nums[1] twice to make nums = [1,0,7,13,6,8]
    - Subtract value from nums[2] once to make nums = [1,0,2,13,6,8]
    - Subtract value from nums[3] twice to make nums = [1,0,2,3,6,8]
    The MEX of nums is 4. It can be shown that 4 is the maximum MEX we can achieve.
    Example 2:
    Input: nums = [1,-10,7,13,6,8], value = 7
    Output: 2
    Explanation: One can achieve this result by applying the following operation:
    - subtract value from nums[2] once to make nums = [1,-10,0,13,6,8]
    The MEX of nums is 2. It can be shown that 2 is the maximum MEX we can achieve.
      Constraints:
    1 <= nums.length, value <= 105
    -109 <= nums[i] <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, -10, 7, 13, 6, 8};
        int value = 5;
        int expected = 4;
        var result = solution.findSmallestInteger(nums, value);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, -10, 7, 13, 6, 8};
        int value = 7;
        int expected = 2;
        var result = solution.findSmallestInteger(nums, value);
        assertThat(result).isEqualTo(expected);
    }

}
