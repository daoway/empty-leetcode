package com.blogspot.ostas.leetcode.all.medium.maximum_subarray_min_product;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,2,3,2]
    Output: 14
    Explanation: The maximum min-product is achieved with the subarray [2,3,2] (minimum value is 2).
    2 * (2+3+2) = 2 * 7 = 14.
    Example 2:
    Input: nums = [2,3,3,1,2]
    Output: 18
    Explanation: The maximum min-product is achieved with the subarray [3,3] (minimum value is 3).
    3 * (3+3) = 3 * 6 = 18.
    Example 3:
    Input: nums = [3,1,5,6,4,2]
    Output: 60
    Explanation: The maximum min-product is achieved with the subarray [5,6,4] (minimum value is 4).
    4 * (5+6+4) = 4 * 15 = 60.
      Constraints:
    1 <= nums.length <= 105
    1 <= nums[i] <= 107
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 3, 2};
        int expected = 14;
        var result = solution.maxSumMinProduct(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{2, 3, 3, 1, 2};
        int expected = 18;
        var result = solution.maxSumMinProduct(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{3, 1, 5, 6, 4, 2};
        int expected = 60;
        var result = solution.maxSumMinProduct(nums);
        assertThat(result).isEqualTo(expected);
    }

}
