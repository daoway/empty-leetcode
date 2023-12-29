package com.blogspot.ostas.leetcode.all.hard.first_missing_positive;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,2,0]
    Output: 3
    Explanation: The numbers in the range [1,2] are all in the array.
    Example 2:
    Input: nums = [3,4,-1,1]
    Output: 2
    Explanation: 1 is in the array but 2 is missing.
    Example 3:
    Input: nums = [7,8,9,11,12]
    Output: 1
    Explanation: The smallest positive integer 1 is missing.
      Constraints:
    1 <= nums.length <= 105
    -231 <= nums[i] <= 231 - 1
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 0};
        int expected = 3;
        var result = solution.firstMissingPositive(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{3, 4, -1, 1};
        int expected = 2;
        var result = solution.firstMissingPositive(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{7, 8, 9, 11, 12};
        int expected = 1;
        var result = solution.firstMissingPositive(nums);
        assertThat(result).isEqualTo(expected);
    }

}
