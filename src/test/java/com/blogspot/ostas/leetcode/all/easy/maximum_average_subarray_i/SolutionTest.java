package com.blogspot.ostas.leetcode.all.easy.maximum_average_subarray_i;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,12,-5,-6,50,3], k = 4
    Output: 12.75000
    Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
    Example 2:
    Input: nums = [5], k = 1
    Output: 5.00000
      Constraints:
    n == nums.length
    1 <= k <= n <= 105
    -104 <= nums[i] <= 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 12, -5, -6, 50, 3};
        int k = 4;
        double expected = 12.75000;
        var result = solution.findMaxAverage(nums, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{5};
        int k = 1;
        double expected = 5.00000;
        var result = solution.findMaxAverage(nums, k);
        assertThat(result).isEqualTo(expected);
    }

}
