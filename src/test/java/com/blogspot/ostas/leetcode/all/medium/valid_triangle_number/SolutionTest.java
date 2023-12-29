package com.blogspot.ostas.leetcode.all.medium.valid_triangle_number;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [2,2,3,4]
    Output: 3
    Explanation: Valid combinations are:
    2,3,4 (using the first 2)
    2,3,4 (using the second 2)
    2,2,3
    Example 2:
    Input: nums = [4,2,3,4]
    Output: 4
      Constraints:
    1 <= nums.length <= 1000
    0 <= nums[i] <= 1000
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{2, 2, 3, 4};
        int expected = 3;
        var result = solution.triangleNumber(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{4, 2, 3, 4};
        int expected = 4;
        var result = solution.triangleNumber(nums);
        assertThat(result).isEqualTo(expected);
    }

}
