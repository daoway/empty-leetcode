package com.blogspot.ostas.leetcode.all.medium.maximum_beauty_of_an_array_after_applying_operation;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [4,6,1,2], k = 2
    Output: 3
    Explanation: In this example, we apply the following operations:
    - Choose index 1, replace it with 4 (from range [4,8]), nums = [4,4,1,2].
    - Choose index 3, replace it with 4 (from range [0,4]), nums = [4,4,1,4].
    After the applied operations, the beauty of the array nums is 3 (subsequence consisting of indices 0, 1, and 3).
    It can be proven that 3 is the maximum possible length we can achieve.
    Example 2:
    Input: nums = [1,1,1,1], k = 10
    Output: 4
    Explanation: In this example we don't have to apply any operations.
    The beauty of the array nums is 4 (whole array).
      Constraints:
    1 <= nums.length <= 105
    0 <= nums[i], k <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{4, 6, 1, 2};
        int k = 2;
        int expected = 3;
        var result = solution.maximumBeauty(nums, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 1, 1, 1};
        int k = 10;
        int expected = 4;
        var result = solution.maximumBeauty(nums, k);
        assertThat(result).isEqualTo(expected);
    }

}
