package com.blogspot.ostas.leetcode.all.easy.monotonic_array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,2,2,3]
    Output: true
    Example 2:
    Input: nums = [6,5,4,4]
    Output: true
    Example 3:
    Input: nums = [1,3,2]
    Output: false
      Constraints:
    1 <= nums.length <= 105
    -105 <= nums[i] <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 2, 3};
        boolean expected = true;
        var result = solution.isMonotonic(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{6, 5, 4, 4};
        boolean expected = true;
        var result = solution.isMonotonic(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{1, 3, 2};
        boolean expected = false;
        var result = solution.isMonotonic(nums);
        assertThat(result).isEqualTo(expected);
    }

}
