package com.blogspot.ostas.leetcode.all.easy.binary_prefix_divisible_by_five_;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [0,1,1]
    Output: [true,false,false]
    Explanation: The input numbers in binary are 0, 01, 011; which are 0, 1, and 3 in base-10.
    Only the first number is divisible by 5, so answer[0] is true.
    Example 2:
    Input: nums = [1,1,1]
    Output: [false,false,false]
      Constraints:
    1 <= nums.length <= 105
    nums[i] is either 0 or 1.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{0, 1, 1};
        List<Boolean> expected = List.of(true, false, false);
        var result = solution.prefixesDivBy5(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 1, 1};
        List<Boolean> expected = List.of(false, false, false);
        var result = solution.prefixesDivBy5(nums);
        assertThat(result).isEqualTo(expected);
    }

}
