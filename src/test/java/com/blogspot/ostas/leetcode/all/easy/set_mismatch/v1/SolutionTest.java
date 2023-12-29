package com.blogspot.ostas.leetcode.all.easy.set_mismatch.v1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,2,2,4]
    Output: [2,3]
    Example 2:
    Input: nums = [1,1]
    Output: [1,2]
      Constraints:
    2 <= nums.length <= 104
    1 <= nums[i] <= 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 2, 4};
        int[] expected = new int[]{2, 3};
        var result = solution.findErrorNums(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 1};
        int[] expected = new int[]{1, 2};
        var result = solution.findErrorNums(nums);
        assertThat(result).isEqualTo(expected);
    }

}
