package com.blogspot.ostas.leetcode.all.hard.sum_of_subsequence_widths;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [2,1,3]
    Output: 6
    Explanation: The subsequences are [1], [2], [3], [2,1], [2,3], [1,3], [2,1,3].
    The corresponding widths are 0, 0, 0, 1, 1, 2, 2.
    The sum of these widths is 6.
    Example 2:
    Input: nums = [2]
    Output: 0
      Constraints:
    1 <= nums.length <= 105
    1 <= nums[i] <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{2, 1, 3};
        int expected = 6;
        var result = solution.sumSubseqWidths(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{2};
        int expected = 0;
        var result = solution.sumSubseqWidths(nums);
        assertThat(result).isEqualTo(expected);
    }

}
