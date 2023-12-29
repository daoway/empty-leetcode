package com.blogspot.ostas.leetcode.all.hard.arithmetic_slices_ii_subsequence;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [2,4,6,8,10]
    Output: 7
    Explanation: All arithmetic subsequence slices are:
    [2,4,6]
    [4,6,8]
    [6,8,10]
    [2,4,6,8]
    [4,6,8,10]
    [2,4,6,8,10]
    [2,6,10]
    Example 2:
    Input: nums = [7,7,7,7,7]
    Output: 16
    Explanation: Any subsequence of this array is arithmetic.
      Constraints:
    1  <= nums.length <= 1000
    -231 <= nums[i] <= 231 - 1
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{2, 4, 6, 8, 10};
        int expected = 7;
        var result = solution.numberOfArithmeticSlices(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{7, 7, 7, 7, 7};
        int expected = 16;
        var result = solution.numberOfArithmeticSlices(nums);
        assertThat(result).isEqualTo(expected);
    }

}
