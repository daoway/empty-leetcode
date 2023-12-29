package com.blogspot.ostas.leetcode.all.easy.maximum_product_of_two_elements_in_an_array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [3,4,5,2]
    Output: 12
    Explanation: If you choose the indices i=1 and j=2 (indexed from 0), you will get the maximum value, that is, (nums[1]-1)*(nums[2]-1) = (4-1)*(5-1) = 3*4 = 12.
    Example 2:
    Input: nums = [1,5,4,5]
    Output: 16
    Explanation: Choosing the indices i=1 and j=3 (indexed from 0), you will get the maximum value of (5-1)*(5-1) = 16.
    Example 3:
    Input: nums = [3,7]
    Output: 12
      Constraints:
    2 <= nums.length <= 500
    1 <= nums[i] <= 10^3
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{3, 4, 5, 2};
        int expected = 12;
        var result = solution.maxProduct(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 5, 4, 5};
        int expected = 16;
        var result = solution.maxProduct(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{3, 7};
        int expected = 12;
        var result = solution.maxProduct(nums);
        assertThat(result).isEqualTo(expected);
    }

}
