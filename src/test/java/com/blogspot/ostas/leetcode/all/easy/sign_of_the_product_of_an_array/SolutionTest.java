package com.blogspot.ostas.leetcode.all.easy.sign_of_the_product_of_an_array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [-1,-2,-3,-4,3,2,1]
    Output: 1
    Explanation: The product of all values in the array is 144, and signFunc(144) = 1
    Example 2:
    Input: nums = [1,5,0,2,-3]
    Output: 0
    Explanation: The product of all values in the array is 0, and signFunc(0) = 0
    Example 3:
    Input: nums = [-1,1,-1,1,-1]
    Output: -1
    Explanation: The product of all values in the array is -1, and signFunc(-1) = -1
      Constraints:
    1 <= nums.length <= 1000
    -100 <= nums[i] <= 100
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{-1, -2, -3, -4, 3, 2, 1};
        int expected = 1;
        var result = solution.arraySign(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 5, 0, 2, -3};
        int expected = 0;
        var result = solution.arraySign(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{-1, 1, -1, 1, -1};
        int expected = -1;
        var result = solution.arraySign(nums);
        assertThat(result).isEqualTo(expected);
    }

}
