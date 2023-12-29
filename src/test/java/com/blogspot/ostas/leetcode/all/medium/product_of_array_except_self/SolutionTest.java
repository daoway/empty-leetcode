package com.blogspot.ostas.leetcode.all.medium.product_of_array_except_self;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,2,3,4]
    Output: [24,12,8,6]
    Example 2:
    Input: nums = [-1,1,0,-3,3]
    Output: [0,0,9,0,0]
      Constraints:
    2 <= nums.length <= 105
    -30 <= nums[i] <= 30
    The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
      Follow up: Can you solve the problem in O(1) extra space complexity? (The output array does not count as extra space for space complexity analysis.)
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 3, 4};
        int[] expected = new int[]{24, 12, 8, 6};
        var result = solution.productExceptSelf(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{-1, 1, 0, -3, 3};
        int[] expected = new int[]{0, 0, 9, 0, 0};
        var result = solution.productExceptSelf(nums);
        assertThat(result).isEqualTo(expected);
    }

}
