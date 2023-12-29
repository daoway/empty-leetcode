package com.blogspot.ostas.leetcode.all.medium.maximum_product_after_k_increments;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [0,4], k = 5
    Output: 20
    Explanation: Increment the first number 5 times.
    Now nums = [5, 4], with a product of 5 * 4 = 20.
    It can be shown that 20 is maximum product possible, so we return 20.
    Note that there may be other ways to increment nums to have the maximum product.
    Example 2:
    Input: nums = [6,3,3,2], k = 2
    Output: 216
    Explanation: Increment the second number 1 time and increment the fourth number 1 time.
    Now nums = [6, 4, 3, 3], with a product of 6 * 4 * 3 * 3 = 216.
    It can be shown that 216 is maximum product possible, so we return 216.
    Note that there may be other ways to increment nums to have the maximum product.
      Constraints:
    1 <= nums.length, k <= 105
    0 <= nums[i] <= 106
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{0, 4};
        int k = 5;
        int expected = 20;
        var result = solution.maximumProduct(nums, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{6, 3, 3, 2};
        int k = 2;
        int expected = 216;
        var result = solution.maximumProduct(nums, k);
        assertThat(result).isEqualTo(expected);
    }

}
