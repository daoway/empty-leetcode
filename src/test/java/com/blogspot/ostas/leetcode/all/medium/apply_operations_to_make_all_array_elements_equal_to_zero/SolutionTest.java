package com.blogspot.ostas.leetcode.all.medium.apply_operations_to_make_all_array_elements_equal_to_zero;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [2,2,3,1,1,0], k = 3
    Output: true
    Explanation: We can do the following operations:
    - Choose the subarray [2,2,3]. The resulting array will be nums = [1,1,2,1,1,0].
    - Choose the subarray [2,1,1]. The resulting array will be nums = [1,1,1,0,0,0].
    - Choose the subarray [1,1,1]. The resulting array will be nums = [0,0,0,0,0,0].
    Example 2:
    Input: nums = [1,3,1,1], k = 2
    Output: false
    Explanation: It is not possible to make all the array elements equal to 0.
      Constraints:
    1 <= k <= nums.length <= 105
    0 <= nums[i] <= 106
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{2, 2, 3, 1, 1, 0};
        int k = 3;
        boolean expected = true;
        var result = solution.checkArray(nums, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 3, 1, 1};
        int k = 2;
        boolean expected = false;
        var result = solution.checkArray(nums, k);
        assertThat(result).isEqualTo(expected);
    }

}
