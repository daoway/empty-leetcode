package com.blogspot.ostas.leetcode.all.medium.largest_element_in_an_array_after_merge_operations;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [2,3,7,9,3]
    Output: 21
    Explanation: We can apply the following operations on the array:
    - Choose i = 0. The resulting array will be nums = [5,7,9,3].
    - Choose i = 1. The resulting array will be nums = [5,16,3].
    - Choose i = 0. The resulting array will be nums = [21,3].
    The largest element in the final array is 21. It can be shown that we cannot obtain a larger element.
    Example 2:
    Input: nums = [5,3,3]
    Output: 11
    Explanation: We can do the following operations on the array:
    - Choose i = 1. The resulting array will be nums = [5,6].
    - Choose i = 0. The resulting array will be nums = [11].
    There is only one element in the final array, which is 11.
      Constraints:
    1 <= nums.length <= 105
    1 <= nums[i] <= 106
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{2, 3, 7, 9, 3};
        long expected = 21;
        var result = solution.maxArrayValue(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{5, 3, 3};
        long expected = 11;
        var result = solution.maxArrayValue(nums);
        assertThat(result).isEqualTo(expected);
    }

}
