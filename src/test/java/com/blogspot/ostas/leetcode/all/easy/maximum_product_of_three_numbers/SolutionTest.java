package com.blogspot.ostas.leetcode.all.easy.maximum_product_of_three_numbers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,2,3]
    Output: 6
    Example 2:
    Input: nums = [1,2,3,4]
    Output: 24
    Example 3:
    Input: nums = [-1,-2,-3]
    Output: -6
      Constraints:
    3 <= nums.length <= 104
    -1000 <= nums[i] <= 1000
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 3};
        int expected = 6;
        var result = solution.maximumProduct(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 3, 4};
        int expected = 24;
        var result = solution.maximumProduct(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{-1, -2, -3};
        int expected = -6;
        var result = solution.maximumProduct(nums);
        assertThat(result).isEqualTo(expected);
    }

}
