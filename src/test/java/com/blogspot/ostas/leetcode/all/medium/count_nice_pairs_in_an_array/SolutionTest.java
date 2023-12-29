package com.blogspot.ostas.leetcode.all.medium.count_nice_pairs_in_an_array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [42,11,1,97]
    Output: 2
    Explanation: The two pairs are:
     - (0,3) : 42 + rev(97) = 42 + 79 = 121, 97 + rev(42) = 97 + 24 = 121.
     - (1,2) : 11 + rev(1) = 11 + 1 = 12, 1 + rev(11) = 1 + 11 = 12.
    Example 2:
    Input: nums = [13,10,35,24,76]
    Output: 4
      Constraints:
    1 <= nums.length <= 105
    0 <= nums[i] <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{42, 11, 1, 97};
        int expected = 2;
        var result = solution.countNicePairs(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{13, 10, 35, 24, 76};
        int expected = 4;
        var result = solution.countNicePairs(nums);
        assertThat(result).isEqualTo(expected);
    }

}
