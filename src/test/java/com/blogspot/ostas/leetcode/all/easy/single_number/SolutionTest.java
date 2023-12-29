package com.blogspot.ostas.leetcode.all.easy.single_number;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [2,2,1]
    Output: 1
    Example 2:
    Input: nums = [4,1,2,1,2]
    Output: 4
    Example 3:
    Input: nums = [1]
    Output: 1
      Constraints:
    1 <= nums.length <= 3 * 104
    -3 * 104 <= nums[i] <= 3 * 104
    Each element in the array appears twice except for one element which appears only once.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{2, 2, 1};
        int expected = 1;
        var result = solution.singleNumber(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{4, 1, 2, 1, 2};
        int expected = 4;
        var result = solution.singleNumber(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{1};
        int expected = 1;
        var result = solution.singleNumber(nums);
        assertThat(result).isEqualTo(expected);
    }

}
