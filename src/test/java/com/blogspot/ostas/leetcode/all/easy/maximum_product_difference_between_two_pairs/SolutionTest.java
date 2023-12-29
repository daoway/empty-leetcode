package com.blogspot.ostas.leetcode.all.easy.maximum_product_difference_between_two_pairs;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [5,6,2,7,4]
    Output: 34
    Explanation: We can choose indices 1 and 3 for the first pair (6, 7) and indices 2 and 4 for the second pair (2, 4).
    The product difference is (6 * 7) - (2 * 4) = 34.
    Example 2:
    Input: nums = [4,2,5,9,7,4,8]
    Output: 64
    Explanation: We can choose indices 3 and 6 for the first pair (9, 8) and indices 1 and 5 for the second pair (2, 4).
    The product difference is (9 * 8) - (2 * 4) = 64.
      Constraints:
    4 <= nums.length <= 104
    1 <= nums[i] <= 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{5, 6, 2, 7, 4};
        int expected = 34;
        var result = solution.maxProductDifference(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{4, 2, 5, 9, 7, 4, 8};
        int expected = 64;
        var result = solution.maxProductDifference(nums);
        assertThat(result).isEqualTo(expected);
    }

}
